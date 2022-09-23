package com.liferay.amf.enums;

public enum SecurityQuestion {

    FAVORITE_ACTOR(3, "Who is your favorite actor?"),
    FIRST_CAR(1, "What is the make of your first car?"),
    MAIDEN_NAME(0, "What is your mother's maiden name?"),
    HIGH_SCHOOL_MASCOT(2, "What is your high school mascot?");

    SecurityQuestion(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static SecurityQuestion toEnum(int code) {

        for (SecurityQuestion securityQuestion : SecurityQuestion.values()) {
            if (securityQuestion.code == code) {
                return securityQuestion;
            }
        }

        throw new IllegalArgumentException("Invalid security question ID: " + code);
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    private final int code;
    private final String description;

}