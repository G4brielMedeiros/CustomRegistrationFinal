package com.liferay.amf.client.serdes.v1_0;

import com.liferay.amf.client.dto.v1_0.AccountInfo;
import com.liferay.amf.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author gabriel
 * @generated
 */
@Generated("")
public class AccountInfoSerDes {

	public static AccountInfo toDTO(String json) {
		AccountInfoJSONParser accountInfoJSONParser =
			new AccountInfoJSONParser();

		return accountInfoJSONParser.parseToDTO(json);
	}

	public static AccountInfo[] toDTOs(String json) {
		AccountInfoJSONParser accountInfoJSONParser =
			new AccountInfoJSONParser();

		return accountInfoJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AccountInfo accountInfo) {
		if (accountInfo == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (accountInfo.getAcceptedTerms() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acceptedTerms\": ");

			sb.append(accountInfo.getAcceptedTerms());
		}

		if (accountInfo.getAddress1() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address1\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getAddress1()));

			sb.append("\"");
		}

		if (accountInfo.getAddress2() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address2\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getAddress2()));

			sb.append("\"");
		}

		if (accountInfo.getBirthday() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"birthday\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getBirthday()));

			sb.append("\"");
		}

		if (accountInfo.getCity() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"city\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getCity()));

			sb.append("\"");
		}

		if (accountInfo.getEmailAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddress\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getEmailAddress()));

			sb.append("\"");
		}

		if (accountInfo.getFirstName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"firstName\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getFirstName()));

			sb.append("\"");
		}

		if (accountInfo.getHomePhone() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"homePhone\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getHomePhone()));

			sb.append("\"");
		}

		if (accountInfo.getLastName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastName\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getLastName()));

			sb.append("\"");
		}

		if (accountInfo.getMale() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"male\": ");

			sb.append(accountInfo.getMale());
		}

		if (accountInfo.getMobilePhone() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mobilePhone\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getMobilePhone()));

			sb.append("\"");
		}

		if (accountInfo.getPassword() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"password\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getPassword()));

			sb.append("\"");
		}

		if (accountInfo.getSecurityAnswer() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"securityAnswer\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getSecurityAnswer()));

			sb.append("\"");
		}

		if (accountInfo.getSecurityQuestion() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"securityQuestion\": ");

			sb.append(accountInfo.getSecurityQuestion());
		}

		if (accountInfo.getState() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getState()));

			sb.append("\"");
		}

		if (accountInfo.getUserName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userName\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getUserName()));

			sb.append("\"");
		}

		if (accountInfo.getZipCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"zipCode\": ");

			sb.append("\"");

			sb.append(_escape(accountInfo.getZipCode()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AccountInfoJSONParser accountInfoJSONParser =
			new AccountInfoJSONParser();

		return accountInfoJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(AccountInfo accountInfo) {
		if (accountInfo == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (accountInfo.getAcceptedTerms() == null) {
			map.put("acceptedTerms", null);
		}
		else {
			map.put(
				"acceptedTerms",
				String.valueOf(accountInfo.getAcceptedTerms()));
		}

		if (accountInfo.getAddress1() == null) {
			map.put("address1", null);
		}
		else {
			map.put("address1", String.valueOf(accountInfo.getAddress1()));
		}

		if (accountInfo.getAddress2() == null) {
			map.put("address2", null);
		}
		else {
			map.put("address2", String.valueOf(accountInfo.getAddress2()));
		}

		if (accountInfo.getBirthday() == null) {
			map.put("birthday", null);
		}
		else {
			map.put("birthday", String.valueOf(accountInfo.getBirthday()));
		}

		if (accountInfo.getCity() == null) {
			map.put("city", null);
		}
		else {
			map.put("city", String.valueOf(accountInfo.getCity()));
		}

		if (accountInfo.getEmailAddress() == null) {
			map.put("emailAddress", null);
		}
		else {
			map.put(
				"emailAddress", String.valueOf(accountInfo.getEmailAddress()));
		}

		if (accountInfo.getFirstName() == null) {
			map.put("firstName", null);
		}
		else {
			map.put("firstName", String.valueOf(accountInfo.getFirstName()));
		}

		if (accountInfo.getHomePhone() == null) {
			map.put("homePhone", null);
		}
		else {
			map.put("homePhone", String.valueOf(accountInfo.getHomePhone()));
		}

		if (accountInfo.getLastName() == null) {
			map.put("lastName", null);
		}
		else {
			map.put("lastName", String.valueOf(accountInfo.getLastName()));
		}

		if (accountInfo.getMale() == null) {
			map.put("male", null);
		}
		else {
			map.put("male", String.valueOf(accountInfo.getMale()));
		}

		if (accountInfo.getMobilePhone() == null) {
			map.put("mobilePhone", null);
		}
		else {
			map.put(
				"mobilePhone", String.valueOf(accountInfo.getMobilePhone()));
		}

		if (accountInfo.getPassword() == null) {
			map.put("password", null);
		}
		else {
			map.put("password", String.valueOf(accountInfo.getPassword()));
		}

		if (accountInfo.getSecurityAnswer() == null) {
			map.put("securityAnswer", null);
		}
		else {
			map.put(
				"securityAnswer",
				String.valueOf(accountInfo.getSecurityAnswer()));
		}

		if (accountInfo.getSecurityQuestion() == null) {
			map.put("securityQuestion", null);
		}
		else {
			map.put(
				"securityQuestion",
				String.valueOf(accountInfo.getSecurityQuestion()));
		}

		if (accountInfo.getState() == null) {
			map.put("state", null);
		}
		else {
			map.put("state", String.valueOf(accountInfo.getState()));
		}

		if (accountInfo.getUserName() == null) {
			map.put("userName", null);
		}
		else {
			map.put("userName", String.valueOf(accountInfo.getUserName()));
		}

		if (accountInfo.getZipCode() == null) {
			map.put("zipCode", null);
		}
		else {
			map.put("zipCode", String.valueOf(accountInfo.getZipCode()));
		}

		return map;
	}

	public static class AccountInfoJSONParser
		extends BaseJSONParser<AccountInfo> {

		@Override
		protected AccountInfo createDTO() {
			return new AccountInfo();
		}

		@Override
		protected AccountInfo[] createDTOArray(int size) {
			return new AccountInfo[size];
		}

		@Override
		protected void setField(
			AccountInfo accountInfo, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "acceptedTerms")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setAcceptedTerms((Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "address1")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setAddress1((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "address2")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setAddress2((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "birthday")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setBirthday((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "city")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setCity((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "emailAddress")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setEmailAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "firstName")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setFirstName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "homePhone")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setHomePhone((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastName")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setLastName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "male")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setMale((Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "mobilePhone")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setMobilePhone((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "password")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setPassword((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "securityAnswer")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setSecurityAnswer((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "securityQuestion")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setSecurityQuestion(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "state")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setState((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "userName")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setUserName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "zipCode")) {
				if (jsonParserFieldValue != null) {
					accountInfo.setZipCode((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}