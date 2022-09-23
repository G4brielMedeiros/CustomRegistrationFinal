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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccountService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccountService
 * @generated
 */
public class AccountServiceWrapper
	implements AccountService, ServiceWrapper<AccountService> {

	public AccountServiceWrapper() {
		this(null);
	}

	public AccountServiceWrapper(AccountService accountService) {
		_accountService = accountService;
	}

	@Override
	public com.liferay.amf.model.Account addAccount(
			long groupId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthday,
			String password, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, int securityQuestion, String securityAnswer,
			boolean acceptTerms)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accountService.addAccount(
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
	@Override
	public String getOSGiServiceIdentifier() {
		return _accountService.getOSGiServiceIdentifier();
	}

	@Override
	public AccountService getWrappedService() {
		return _accountService;
	}

	@Override
	public void setWrappedService(AccountService accountService) {
		_accountService = accountService;
	}

	private AccountService _accountService;

}