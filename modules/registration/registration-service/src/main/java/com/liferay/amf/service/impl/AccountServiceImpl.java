package com.liferay.amf.service.impl;

import com.liferay.amf.model.Account;
import com.liferay.amf.service.base.AccountServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

@Component(
		property = {
				"json.web.service.context.name=account",
				"json.web.service.context.path=Account"
		},
		service = AopService.class
)
public class AccountServiceImpl extends AccountServiceBaseImpl {
	public Account addAccount(
			long groupId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, Date birthday, String password,
			String homePhone, String mobilePhone, String address1,
			String address2, String city, String state, String zipCode,
			int securityQuestion, String securityAnswer, boolean acceptTerms)
			throws PortalException {
		return accountLocalService.addAccount(
				groupId, userName, firstName, lastName,
				emailAddress, male, birthday, password,
				homePhone, mobilePhone, address1,
				address2, city, state, zipCode,
				securityQuestion, securityAnswer, acceptTerms
		);
	}
}