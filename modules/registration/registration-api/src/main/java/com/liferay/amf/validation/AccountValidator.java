package com.liferay.amf.validation;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountValidator {

    private final List<FieldMessage> fieldErrors = new ArrayList<>();

    public List<FieldMessage> validateAccountFields(
            String userName,
            String firstName,
            String lastName,
            String emailAddress,
            String birthday,
            String password,
            String homePhone,
            String mobilePhone,
            String address1,
            String address2,
            String city,
            String state,
            String zipCode,
            Integer securityQuestion,
            String securityAnswer,
            Boolean acceptTerms
    ) {

        validateName(firstName);
        validateName(lastName);
        validateAgeThirteen(birthday);
        validatePassword(password);
        validatePhoneNumber(homePhone);
        validatePhoneNumber(mobilePhone);
        validateAddress(address1);
        validateAddress(address2);
        validateCity(city);
        validateState(state);
        validateZipCode(zipCode);
        validateQuestion(securityQuestion);
        validateAnswer(securityAnswer);
        validateTermsOfUseAccepted(acceptTerms);

        if (fieldErrors.isEmpty()) {
            validateUserName(userName);
            validateEmailAddress(emailAddress);
        }

        return fieldErrors;
    }

    private void validateAddress(String address) {
        if (_hasInvalidCharacters(address))
            fieldErrors.add(new FieldMessage("address", "Address must be alphanumeric"));

        if (address.length() > 255)
            fieldErrors.add(new FieldMessage("address", "Address must have a maximum number of 255 characters"));
    }

    private void validateAgeThirteen(String birthdayString) {

        try {

            Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthdayString);
            Date currentDate = new Date();
            int age = _calculateAge(birthday, currentDate);

            if (birthday.after(currentDate))
                fieldErrors.add(new FieldMessage("birthday", "Date of birth cannot be a future date"));

            if (age < 13)
                fieldErrors.add(new FieldMessage("birthday", "You must be over 13 years old"));

        } catch (ParseException e) {
            fieldErrors.add(new FieldMessage("birthday", "Birthday must be in yyyy-MM-dd format"));
        }
    }

    private void validateQuestion(Integer question) {

        //refactor this to use SecurityQuestion enum
        if (question == null || question < 0 || question > 3)
            fieldErrors.add(new FieldMessage("securityQuestion", "Security question must be a number between 0 and 3"));
    }

    private void validateAnswer(String answer) {
        if (_hasInvalidCharacters(answer))
            fieldErrors.add(new FieldMessage("answer", "Answer must be alphanumeric"));

        if (answer.length() > 255)
            fieldErrors.add(new FieldMessage("answer", "Answer must have a maximum number of 255 characters"));
    }

    private void validateCity(String city) {
        if (_hasInvalidCharacters(city))
            fieldErrors.add(new FieldMessage("city", "City must be alphanumeric"));

        if (city.length() > 255)
            fieldErrors.add(new FieldMessage("city", "City must have a maximum number of 255 characters"));
    }

    private void validateEmailAddress(String email) {

        if (!email.matches(REGEX_VALID_EMAIL_ADDRESS))
            fieldErrors.add(new FieldMessage("email", "Email is not valid"));

        if (email.length() > 255)
            fieldErrors.add(new FieldMessage("email", "Email must have a maximum number of 255 characters"));

        User user = UserLocalServiceUtil.fetchUserByEmailAddress(PortalUtil.getDefaultCompanyId(), email);

        if (user != null)
            fieldErrors.add(new FieldMessage("email", "This email is taken"));
    }

    private void validateName(String name) {
        if (_hasInvalidCharacters(name))
            fieldErrors.add(new FieldMessage("name", "Name must be alphanumeric"));

        if (name.length() > 50)
            fieldErrors.add(new FieldMessage("name", "Name must have a maximum number of 50 characters"));
    }

    private void validatePassword(String password) {
        if (!password.matches(REGEX_PASSWORD))
            fieldErrors.add(new FieldMessage("password", "Password must be a minimum 6 characters, must contain one uppercase, one number, and one special character"));
    }

    private void validatePhoneNumber(String phone) {
        if (phone.length() != 10 || !phone.matches("[0-9]+"))
            fieldErrors.add(new FieldMessage("phone", "Phone number must be 10 digits long"));
    }

    private void validateState(String state) {
        if (_hasInvalidCharacters(state))
            fieldErrors.add(new FieldMessage("state", "State must be alphanumeric"));

        if (state.length() > 255)
            fieldErrors.add(new FieldMessage("state", "State must have a maximum number of 255 characters"));
    }

    private void validateTermsOfUseAccepted(Boolean acceptTerms) {
        if (acceptTerms == null || !acceptTerms)
            fieldErrors.add(new FieldMessage("acceptedTerms", "Terms of Use must be accepted."));
    }

    private void validateUserName(String username) {
        if (_hasInvalidCharacters(username))
            fieldErrors.add(new FieldMessage("username", "Username must be alphanumeric"));

        if (username.length() < 4)
            fieldErrors.add(new FieldMessage("username", "Username must have at least 4 characters"));

        if (username.length() > 16)
            fieldErrors.add(new FieldMessage("username", "Username must have a maximum number of 16 characters"));

        User user = UserLocalServiceUtil.fetchUserByScreenName(PortalUtil.getDefaultCompanyId(), username);

        if (user != null)
            fieldErrors.add(new FieldMessage("username", "This username is taken"));
    }

    private void validateZipCode(String zipCode) {
        if (zipCode.length() != 5)
            fieldErrors.add(new FieldMessage("zipcode", "zipcode must be 5 characters long"));
    }

    private int _calculateAge(Date dateOfBirth, Date currentDate) {
        if ((dateOfBirth == null) || (currentDate == null))
            return 0;

        LocalDate birth = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate current = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return Period.between(birth, current).getYears();
    }

    private boolean _hasInvalidCharacters(String name) {
        return !name.matches(REGEX_ALPHANUMERIC);
    }

    private static final String REGEX_ALPHANUMERIC = "^[a-zA-Z\\d]+$";
    private static final String REGEX_PASSWORD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{6,}$";
    private static final String REGEX_VALID_EMAIL_ADDRESS = "^[a-zA-Z\\d_+&*-]+(?:\\.[a-zA-Z\\d_+&*-]+)*@(?:[a-zA-Z\\d-]+\\.)+[a-zA-Z]{2,7}$";
}