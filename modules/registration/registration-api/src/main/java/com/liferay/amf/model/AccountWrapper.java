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

package com.liferay.amf.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Account}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Account
 * @generated
 */
public class AccountWrapper
	extends BaseModelWrapper<Account>
	implements Account, ModelWrapper<Account> {

	public AccountWrapper(Account account) {
		super(account);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accountId", getAccountId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("homePhone", getHomePhone());
		attributes.put("mobilePhone", getMobilePhone());
		attributes.put("address1", getAddress1());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zipCode", getZipCode());
		attributes.put("securityQuestion", getSecurityQuestion());
		attributes.put("securityAnswer", getSecurityAnswer());
		attributes.put("acceptedTerms", isAcceptedTerms());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accountId = (Long)attributes.get("accountId");

		if (accountId != null) {
			setAccountId(accountId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String homePhone = (String)attributes.get("homePhone");

		if (homePhone != null) {
			setHomePhone(homePhone);
		}

		String mobilePhone = (String)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}

		String address1 = (String)attributes.get("address1");

		if (address1 != null) {
			setAddress1(address1);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}

		Integer securityQuestion = (Integer)attributes.get("securityQuestion");

		if (securityQuestion != null) {
			setSecurityQuestion(securityQuestion);
		}

		String securityAnswer = (String)attributes.get("securityAnswer");

		if (securityAnswer != null) {
			setSecurityAnswer(securityAnswer);
		}

		Boolean acceptedTerms = (Boolean)attributes.get("acceptedTerms");

		if (acceptedTerms != null) {
			setAcceptedTerms(acceptedTerms);
		}
	}

	@Override
	public Account cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the accepted terms of this account.
	 *
	 * @return the accepted terms of this account
	 */
	@Override
	public boolean getAcceptedTerms() {
		return model.getAcceptedTerms();
	}

	/**
	 * Returns the account ID of this account.
	 *
	 * @return the account ID of this account
	 */
	@Override
	public long getAccountId() {
		return model.getAccountId();
	}

	/**
	 * Returns the address1 of this account.
	 *
	 * @return the address1 of this account
	 */
	@Override
	public String getAddress1() {
		return model.getAddress1();
	}

	/**
	 * Returns the address2 of this account.
	 *
	 * @return the address2 of this account
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the city of this account.
	 *
	 * @return the city of this account
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this account.
	 *
	 * @return the company ID of this account
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this account.
	 *
	 * @return the create date of this account
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this account.
	 *
	 * @return the group ID of this account
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home phone of this account.
	 *
	 * @return the home phone of this account
	 */
	@Override
	public String getHomePhone() {
		return model.getHomePhone();
	}

	/**
	 * Returns the mobile phone of this account.
	 *
	 * @return the mobile phone of this account
	 */
	@Override
	public String getMobilePhone() {
		return model.getMobilePhone();
	}

	/**
	 * Returns the modified date of this account.
	 *
	 * @return the modified date of this account
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this account.
	 *
	 * @return the primary key of this account
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the security answer of this account.
	 *
	 * @return the security answer of this account
	 */
	@Override
	public String getSecurityAnswer() {
		return model.getSecurityAnswer();
	}

	/**
	 * Returns the security question of this account.
	 *
	 * @return the security question of this account
	 */
	@Override
	public int getSecurityQuestion() {
		return model.getSecurityQuestion();
	}

	/**
	 * Returns the state of this account.
	 *
	 * @return the state of this account
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this account.
	 *
	 * @return the user ID of this account
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this account.
	 *
	 * @return the user uuid of this account
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this account.
	 *
	 * @return the uuid of this account
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip code of this account.
	 *
	 * @return the zip code of this account
	 */
	@Override
	public String getZipCode() {
		return model.getZipCode();
	}

	/**
	 * Returns <code>true</code> if this account is accepted terms.
	 *
	 * @return <code>true</code> if this account is accepted terms; <code>false</code> otherwise
	 */
	@Override
	public boolean isAcceptedTerms() {
		return model.isAcceptedTerms();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this account is accepted terms.
	 *
	 * @param acceptedTerms the accepted terms of this account
	 */
	@Override
	public void setAcceptedTerms(boolean acceptedTerms) {
		model.setAcceptedTerms(acceptedTerms);
	}

	/**
	 * Sets the account ID of this account.
	 *
	 * @param accountId the account ID of this account
	 */
	@Override
	public void setAccountId(long accountId) {
		model.setAccountId(accountId);
	}

	/**
	 * Sets the address1 of this account.
	 *
	 * @param address1 the address1 of this account
	 */
	@Override
	public void setAddress1(String address1) {
		model.setAddress1(address1);
	}

	/**
	 * Sets the address2 of this account.
	 *
	 * @param address2 the address2 of this account
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the city of this account.
	 *
	 * @param city the city of this account
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this account.
	 *
	 * @param companyId the company ID of this account
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this account.
	 *
	 * @param createDate the create date of this account
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this account.
	 *
	 * @param groupId the group ID of this account
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home phone of this account.
	 *
	 * @param homePhone the home phone of this account
	 */
	@Override
	public void setHomePhone(String homePhone) {
		model.setHomePhone(homePhone);
	}

	/**
	 * Sets the mobile phone of this account.
	 *
	 * @param mobilePhone the mobile phone of this account
	 */
	@Override
	public void setMobilePhone(String mobilePhone) {
		model.setMobilePhone(mobilePhone);
	}

	/**
	 * Sets the modified date of this account.
	 *
	 * @param modifiedDate the modified date of this account
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this account.
	 *
	 * @param primaryKey the primary key of this account
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the security answer of this account.
	 *
	 * @param securityAnswer the security answer of this account
	 */
	@Override
	public void setSecurityAnswer(String securityAnswer) {
		model.setSecurityAnswer(securityAnswer);
	}

	/**
	 * Sets the security question of this account.
	 *
	 * @param securityQuestion the security question of this account
	 */
	@Override
	public void setSecurityQuestion(int securityQuestion) {
		model.setSecurityQuestion(securityQuestion);
	}

	/**
	 * Sets the state of this account.
	 *
	 * @param state the state of this account
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the user ID of this account.
	 *
	 * @param userId the user ID of this account
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this account.
	 *
	 * @param userUuid the user uuid of this account
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this account.
	 *
	 * @param uuid the uuid of this account
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip code of this account.
	 *
	 * @param zipCode the zip code of this account
	 */
	@Override
	public void setZipCode(String zipCode) {
		model.setZipCode(zipCode);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccountWrapper wrap(Account account) {
		return new AccountWrapper(account);
	}

}