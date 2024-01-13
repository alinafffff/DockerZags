package com.zags.entity;

public enum EType {
    MARRIAGE("Регистрация брака"),
    DIVORCE("Регистрация расторжения брака"),
    BIRTH("Регистрация рождения"),
    DEATH("Регистрация смерти"),
    NAME("Регистрация смены имени"),
    FATHERHOOD("Регистрация установления отцовства"),
    ADOPTION("Регистрация усыновления/удочерения")
    ;
    private final String type;
    private EType(String type) {
        this.type = type;
    }

}
