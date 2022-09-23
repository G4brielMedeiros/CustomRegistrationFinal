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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Account_Account&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Account
 * @generated
 */
public class AccountTable extends BaseTable<AccountTable> {

	public static final AccountTable INSTANCE = new AccountTable();

	public final Column<AccountTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Long> accountId = createColumn(
		"accountId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AccountTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> homePhone = createColumn(
		"homePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> mobilePhone = createColumn(
		"mobilePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> address1 = createColumn(
		"address1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> address2 = createColumn(
		"address2", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> city = createColumn(
		"city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> state = createColumn(
		"state_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> zipCode = createColumn(
		"zipCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Integer> securityQuestion = createColumn(
		"securityQuestion", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<AccountTable, String> securityAnswer = createColumn(
		"securityAnswer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccountTable, Boolean> acceptedTerms = createColumn(
		"acceptedTerms", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private AccountTable() {
		super("Account_Account", AccountTable::new);
	}

}