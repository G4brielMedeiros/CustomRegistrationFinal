package com.liferay.amf.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gabriel
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Model containing account info", value = "AccountInfo"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "AccountInfo")
public class AccountInfo implements Serializable {

	public static AccountInfo toDTO(String json) {
		return ObjectMapperUtil.readValue(AccountInfo.class, json);
	}

	public static AccountInfo unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(AccountInfo.class, json);
	}

	@Schema(example = "true")
	public Boolean getAcceptedTerms() {
		return acceptedTerms;
	}

	public void setAcceptedTerms(Boolean acceptedTerms) {
		this.acceptedTerms = acceptedTerms;
	}

	@JsonIgnore
	public void setAcceptedTerms(
		UnsafeSupplier<Boolean, Exception> acceptedTermsUnsafeSupplier) {

		try {
			acceptedTerms = acceptedTermsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean acceptedTerms;

	@Schema(example = "main street")
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@JsonIgnore
	public void setAddress1(
		UnsafeSupplier<String, Exception> address1UnsafeSupplier) {

		try {
			address1 = address1UnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String address1;

	@Schema(example = "other street")
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@JsonIgnore
	public void setAddress2(
		UnsafeSupplier<String, Exception> address2UnsafeSupplier) {

		try {
			address2 = address2UnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String address2;

	@Schema(example = "1998-12-30T00:00:00+0000")
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@JsonIgnore
	public void setBirthday(
		UnsafeSupplier<String, Exception> birthdayUnsafeSupplier) {

		try {
			birthday = birthdayUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String birthday;

	@Schema(example = "big city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonIgnore
	public void setCity(UnsafeSupplier<String, Exception> cityUnsafeSupplier) {
		try {
			city = cityUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String city;

	@Schema(example = "johndoe@gmail.com")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonIgnore
	public void setEmailAddress(
		UnsafeSupplier<String, Exception> emailAddressUnsafeSupplier) {

		try {
			emailAddress = emailAddressUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String emailAddress;

	@Schema(example = "John")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonIgnore
	public void setFirstName(
		UnsafeSupplier<String, Exception> firstNameUnsafeSupplier) {

		try {
			firstName = firstNameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String firstName;

	@Schema(example = "1234567890")
	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@JsonIgnore
	public void setHomePhone(
		UnsafeSupplier<String, Exception> homePhoneUnsafeSupplier) {

		try {
			homePhone = homePhoneUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String homePhone;

	@Schema(example = "Doe")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonIgnore
	public void setLastName(
		UnsafeSupplier<String, Exception> lastNameUnsafeSupplier) {

		try {
			lastName = lastNameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String lastName;

	@Schema(example = "true")
	public Boolean getMale() {
		return male;
	}

	public void setMale(Boolean male) {
		this.male = male;
	}

	@JsonIgnore
	public void setMale(UnsafeSupplier<Boolean, Exception> maleUnsafeSupplier) {
		try {
			male = maleUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean male;

	@Schema(example = "9.87654321E8")
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@JsonIgnore
	public void setMobilePhone(
		UnsafeSupplier<String, Exception> mobilePhoneUnsafeSupplier) {

		try {
			mobilePhone = mobilePhoneUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String mobilePhone;

	@Schema(example = "Pass123#")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonIgnore
	public void setPassword(
		UnsafeSupplier<String, Exception> passwordUnsafeSupplier) {

		try {
			password = passwordUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String password;

	@Schema(example = "my answer")
	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	@JsonIgnore
	public void setSecurityAnswer(
		UnsafeSupplier<String, Exception> securityAnswerUnsafeSupplier) {

		try {
			securityAnswer = securityAnswerUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String securityAnswer;

	@Schema(example = "0")
	public Integer getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(Integer securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	@JsonIgnore
	public void setSecurityQuestion(
		UnsafeSupplier<Integer, Exception> securityQuestionUnsafeSupplier) {

		try {
			securityQuestion = securityQuestionUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer securityQuestion;

	@Schema(example = "alaska")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonIgnore
	public void setState(
		UnsafeSupplier<String, Exception> stateUnsafeSupplier) {

		try {
			state = stateUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String state;

	@Schema(example = "johnDoe")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonIgnore
	public void setUserName(
		UnsafeSupplier<String, Exception> userNameUnsafeSupplier) {

		try {
			userName = userNameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String userName;

	@Schema(example = "54321")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@JsonIgnore
	public void setZipCode(
		UnsafeSupplier<String, Exception> zipCodeUnsafeSupplier) {

		try {
			zipCode = zipCodeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String zipCode;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (acceptedTerms != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acceptedTerms\": ");

			sb.append(acceptedTerms);
		}

		if (address1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address1\": ");

			sb.append("\"");

			sb.append(_escape(address1));

			sb.append("\"");
		}

		if (address2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address2\": ");

			sb.append("\"");

			sb.append(_escape(address2));

			sb.append("\"");
		}

		if (birthday != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"birthday\": ");

			sb.append("\"");

			sb.append(_escape(birthday));

			sb.append("\"");
		}

		if (city != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"city\": ");

			sb.append("\"");

			sb.append(_escape(city));

			sb.append("\"");
		}

		if (emailAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddress\": ");

			sb.append("\"");

			sb.append(_escape(emailAddress));

			sb.append("\"");
		}

		if (firstName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"firstName\": ");

			sb.append("\"");

			sb.append(_escape(firstName));

			sb.append("\"");
		}

		if (homePhone != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"homePhone\": ");

			sb.append("\"");

			sb.append(_escape(homePhone));

			sb.append("\"");
		}

		if (lastName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastName\": ");

			sb.append("\"");

			sb.append(_escape(lastName));

			sb.append("\"");
		}

		if (male != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"male\": ");

			sb.append(male);
		}

		if (mobilePhone != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mobilePhone\": ");

			sb.append("\"");

			sb.append(_escape(mobilePhone));

			sb.append("\"");
		}

		if (password != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"password\": ");

			sb.append("\"");

			sb.append(_escape(password));

			sb.append("\"");
		}

		if (securityAnswer != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"securityAnswer\": ");

			sb.append("\"");

			sb.append(_escape(securityAnswer));

			sb.append("\"");
		}

		if (securityQuestion != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"securityQuestion\": ");

			sb.append(securityQuestion);
		}

		if (state != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append("\"");

			sb.append(_escape(state));

			sb.append("\"");
		}

		if (userName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userName\": ");

			sb.append("\"");

			sb.append(_escape(userName));

			sb.append("\"");
		}

		if (zipCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"zipCode\": ");

			sb.append("\"");

			sb.append(_escape(zipCode));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.amf.dto.v1_0.AccountInfo",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}