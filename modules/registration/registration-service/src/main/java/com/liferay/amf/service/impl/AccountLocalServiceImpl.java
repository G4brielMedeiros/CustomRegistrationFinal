package com.liferay.amf.service.impl;

import com.liferay.amf.enums.SecurityQuestion;
import com.liferay.amf.model.Account;
import com.liferay.amf.service.base.AccountLocalServiceBaseImpl;
import com.liferay.amf.validation.AccountValidator;
import com.liferay.amf.validation.FieldMessage;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component(
		property = "model.class.name=amf.model.Account", service = AopService.class
)
public class AccountLocalServiceImpl extends AccountLocalServiceBaseImpl {

	public Account addAccount(
			long groupId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, Date birthday, String password,
			String homePhone, String mobilePhone, String address1,
			String address2, String city, String state, String zipCode,
			int securityQuestion, String securityAnswer, boolean acceptedTerms)
			throws PortalException {

		List<FieldMessage> fieldErrors = new AccountValidator().validateAccountFields(
				userName, firstName, lastName, emailAddress,
				new SimpleDateFormat("yyyy-MM-dd").format(birthday),
				password, homePhone, mobilePhone, address1, address2,
				city, state, zipCode, securityQuestion, securityAnswer, acceptedTerms);

		if (!fieldErrors.isEmpty()) {
			throw new PortalException(fieldErrors.get(0).getMessage());
		}

		User user = userLocalService.addUser(
				userLocalService.getDefaultUserId(PortalUtil.getDefaultCompanyId()), // creatorUserId
				PortalUtil.getDefaultCompanyId(), // companyId
				false, // autoPassword
				password, // password1
				password, // password2
				false, // autoScreenName
				userName, // screenName
				emailAddress, // emailAddress
				LocaleUtil.US, // locale
				firstName, // firstName
				null, // middleName
				lastName, // lastName
				0, // prefixId
				0, // suffixId
				male, // male
				birthday.getMonth(), // birthdayMonth
				birthday.getDate(), // birthdayDay
				birthday.getYear(), // birthdayYear
				null, // jobTitle
				null, // groupIds
				null, // organizationIds
				null, // roleIds
				null, // userGroupIds
				false, // sendEmail
				null // serviceContext
		);

		user.setAgreedToTermsOfUse(acceptedTerms);
		user.setReminderQueryQuestion(SecurityQuestion.toEnum(securityQuestion).getDescription());
		user.setReminderQueryAnswer(securityAnswer);
		user.setPasswordModified(true);
		userLocalService.updateUser(user);

		Account account = accountPersistence.create(user.getUserId());

		account.setGroupId(groupId);
		account.setCompanyId(PortalUtil.getDefaultCompanyId());
		account.setUserId(user.getUserId());
		account.setCreateDate(user.getCreateDate());
		account.setModifiedDate(user.getCreateDate());

		account.setHomePhone(homePhone);
		account.setMobilePhone(mobilePhone);

		account.setAddress1(address1);
		account.setAddress2(address2);
		account.setCity(city);
		account.setState(state);
		account.setZipCode(zipCode);

		account.setSecurityQuestion(SecurityQuestion.toEnum(securityQuestion).getCode());
		account.setSecurityAnswer(securityAnswer);

		account.setAcceptedTerms(acceptedTerms);

		return accountPersistence.update(account);
	}
}