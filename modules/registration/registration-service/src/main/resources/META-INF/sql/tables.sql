create table Account_Account (
	uuid_ VARCHAR(75) null,
	accountId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	homePhone VARCHAR(75) null,
	mobilePhone VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	zipCode VARCHAR(75) null,
	securityQuestion INTEGER,
	securityAnswer VARCHAR(75) null,
	acceptedTerms BOOLEAN
);