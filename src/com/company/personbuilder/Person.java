package com.company.personbuilder;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private String situation;
    private String suffix;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomeOwner;

    public Person(String lastName, String firstName, String middleName, String situation, String suffix, String streetAddress, String city, String state, boolean isFemale, boolean isEmployed, boolean isHomeOwner) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.situation = situation;
        this.suffix = suffix;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHomeOwner = isHomeOwner;
    }

    public void presentPerson() {
        System.out.printf("%s %s %s %s %s %s %s ", lastName, firstName, middleName, situation, suffix, streetAddress, city, state);
        if (isFemale) System.out.print("woman ");
        else System.out.print("man ");
        if (isEmployed) System.out.print("employed ");
        else System.out.print("unemployed ");
        if (isHomeOwner) System.out.print("has a home");
        else System.out.print("doesn't have a home");
        System.out.println();
    }
}
