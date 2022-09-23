package com.liferay.amf.internal.resource.v1_0;

import com.liferay.amf.resource.v1_0.AccountInfoResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author gabriel
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/account-info.properties",
	scope = ServiceScope.PROTOTYPE, service = AccountInfoResource.class
)
public class AccountInfoResourceImpl extends BaseAccountInfoResourceImpl {
}