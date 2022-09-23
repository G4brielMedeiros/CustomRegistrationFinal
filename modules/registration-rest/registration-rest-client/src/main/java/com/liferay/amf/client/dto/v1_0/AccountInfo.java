package com.liferay.amf.client.dto.v1_0;

import com.liferay.amf.client.function.UnsafeSupplier;
import com.liferay.amf.client.serdes.v1_0.AccountInfoSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author gabriel
 * @generated
 */
@Generated("")
public class AccountInfo implements Cloneable, Serializable {

	public static AccountInfo toDTO(String json) {
		return AccountInfoSerDes.toDTO(json);
	}

	public Boolean getAcceptedTerms() {
		return acceptedTerms;
	}

	public void setAcceptedTerms(Boolean acceptedTerms) {
		this.acceptedTerms = acceptedTerms;
	}

	public void setAcceptedTerms(
		UnsafeSupplier<Boolean, Exception> acceptedTermsUnsafeSupplier) {

		try {
			acceptedTerms = acceptedTermsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean acceptedTerms;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress1(
		UnsafeSupplier<String, Exception> address1UnsafeSupplier) {

		try {
			address1 = address1UnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String address1;

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setAddress2(
		UnsafeSupplier<String, Exception> address2UnsafeSupplier) {

		try {
			address2 = address2UnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String address2;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setBirthday(
		UnsafeSupplier<String, Exception> birthdayUnsafeSupplier) {

		try {
			birthday = birthdayUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String birthday;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCity(UnsafeSupplier<String, Exception> cityUnsafeSupplier) {
		try {
			city = cityUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String city;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setEmailAddress(
		UnsafeSupplier<String, Exception> emailAddressUnsafeSupplier) {

		try {
			emailAddress = emailAddressUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String emailAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFirstName(
		UnsafeSupplier<String, Exception> firstNameUnsafeSupplier) {

		try {
			firstName = firstNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String firstName;

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public void setHomePhone(
		UnsafeSupplier<String, Exception> homePhoneUnsafeSupplier) {

		try {
			homePhone = homePhoneUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String homePhone;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLastName(
		UnsafeSupplier<String, Exception> lastNameUnsafeSupplier) {

		try {
			lastName = lastNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String lastName;

	public Boolean getMale() {
		return male;
	}

	public void setMale(Boolean male) {
		this.male = male;
	}

	public void setMale(UnsafeSupplier<Boolean, Exception> maleUnsafeSupplier) {
		try {
			male = maleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean male;

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public void setMobilePhone(
		UnsafeSupplier<String, Exception> mobilePhoneUnsafeSupplier) {

		try {
			mobilePhone = mobilePhoneUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String mobilePhone;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPassword(
		UnsafeSupplier<String, Exception> passwordUnsafeSupplier) {

		try {
			password = passwordUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String password;

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public void setSecurityAnswer(
		UnsafeSupplier<String, Exception> securityAnswerUnsafeSupplier) {

		try {
			securityAnswer = securityAnswerUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String securityAnswer;

	public Integer getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(Integer securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public void setSecurityQuestion(
		UnsafeSupplier<Integer, Exception> securityQuestionUnsafeSupplier) {

		try {
			securityQuestion = securityQuestionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer securityQuestion;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setState(
		UnsafeSupplier<String, Exception> stateUnsafeSupplier) {

		try {
			state = stateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String state;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserName(
		UnsafeSupplier<String, Exception> userNameUnsafeSupplier) {

		try {
			userName = userNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String userName;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setZipCode(
		UnsafeSupplier<String, Exception> zipCodeUnsafeSupplier) {

		try {
			zipCode = zipCodeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String zipCode;

	@Override
	public AccountInfo clone() throws CloneNotSupportedException {
		return (AccountInfo)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccountInfo)) {
			return false;
		}

		AccountInfo accountInfo = (AccountInfo)object;

		return Objects.equals(toString(), accountInfo.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AccountInfoSerDes.toJSON(this);
	}

}