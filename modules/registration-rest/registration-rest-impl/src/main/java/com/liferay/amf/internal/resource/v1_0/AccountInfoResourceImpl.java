package com.liferay.amf.internal.resource.v1_0;

import com.liferay.amf.service.AccountService;
import com.liferay.amf.dto.v1_0.AccountInfo;
import com.liferay.amf.resource.v1_0.AccountInfoResource;
import com.liferay.amf.validation.AccountValidator;
import com.liferay.amf.validation.FieldMessage;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.List;

@Component(
		properties = "OSGI-INF/liferay/rest/v1_0/account-dto.properties",
		scope = ServiceScope.PROTOTYPE, service = AccountInfoResource.class
)
public class AccountInfoResourceImpl extends BaseAccountInfoResourceImpl {

	@Override
	public Response postRegistration(AccountInfo accountInfo) throws Exception {

		List<FieldMessage> validationErrors = new AccountValidator().validateAccountFields(
				accountInfo.getUserName(),
				accountInfo.getFirstName(),
				accountInfo.getLastName(),
				accountInfo.getEmailAddress(),
				accountInfo.getBirthday(),
				accountInfo.getPassword(),
				accountInfo.getHomePhone(),
				accountInfo.getMobilePhone(),
				accountInfo.getAddress1(),
				accountInfo.getAddress2(),
				accountInfo.getCity(),
				accountInfo.getState(),
				accountInfo.getZipCode(),
				accountInfo.getSecurityQuestion(),
				accountInfo.getSecurityAnswer(),
				accountInfo.getAcceptedTerms()
		);

		if (!validationErrors.isEmpty()) {
			return Response.status(400).entity(validationErrors).type(MediaType.APPLICATION_JSON).build();
		}

		_accountService.addAccount(
				groupLocalService.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId(),
				accountInfo.getUserName(),
				accountInfo.getFirstName(),
				accountInfo.getLastName(),
				accountInfo.getEmailAddress(),
				accountInfo.getMale(),
				new SimpleDateFormat("yyy-MM-dd").parse(accountInfo.getBirthday()),
				accountInfo.getPassword(),
				accountInfo.getHomePhone(),
				accountInfo.getMobilePhone(),
				accountInfo.getAddress1(),
				accountInfo.getAddress2(),
				accountInfo.getCity(),
				accountInfo.getState(),
				accountInfo.getZipCode(),
				accountInfo.getSecurityQuestion(),
				accountInfo.getSecurityAnswer(),
				accountInfo.getAcceptedTerms()
		);
		return Response.ok().build();
	}

	@Reference
	AccountService _accountService;
}