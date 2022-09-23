/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.amf.service;

import com.liferay.amf.model.Account;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the remote service utility for Account. This utility wraps
 * <code>com.liferay.amf.service.impl.AccountServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AccountService
 * @generated
 */
public class AccountServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.amf.service.impl.AccountServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Account addAccount(
			long groupId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthday,
			String password, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, int securityQuestion, String securityAnswer,
			boolean acceptTerms)
		throws PortalException {

		return getService().addAccount(
			groupId, userName, firstName, lastName, emailAddress, male,
			birthday, password, homePhone, mobilePhone, address1, address2,
			city, state, zipCode, securityQuestion, securityAnswer,
			acceptTerms);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AccountService getService() {
		return _service;
	}

	private static volatile AccountService _service;

}