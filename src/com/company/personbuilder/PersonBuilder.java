package com.company.personbuilder;

public class PersonBuilder {
    private String lastName = "Jan";
    private String firstName = "Kowalski";
    private String middleName = "";
    private String situation = "married";
    private String suffix = "Mr";
    private String streetAddress = "Gronostajowa 2";
    private String city = "Krakow";
    private String state = "malopolskie";
    private boolean isFemale = false;
    private boolean isEmployed = true;
    private boolean isHomeOwner = false;

    public Person createPerson() {
        return new Person(lastName, firstName, middleName, situation, suffix, streetAddress, city, state, isFemale, isEmployed, isHomeOwner);
    }

    public PersonBuilder setNewLastName(String newLastName) {
        this.lastName = newLastName;
        return this;
    }

    public PersonBuilder setNewFirstName(String newFirstName) {
        this.firstName = newFirstName;
        return this;
    }

    public PersonBuilder setNewMiddleName(String newMiddleName) {
        this.middleName = newMiddleName;
        return this;
    }

    public PersonBuilder setNewSituation(String newSituation) {
        this.situation = newSituation;
        return this;
    }

    public PersonBuilder setNewSuffix(String newSuffix) {
        this.suffix = newSuffix;
        return this;
    }

    public PersonBuilder setNewStreetAddress(String newStreetAddress) {
        this.streetAddress = newStreetAddress;
        return this;
    }

    public PersonBuilder setNewCity(String newCity) {
        this.city = newCity;
        return this;
    }

    public PersonBuilder setNewState(String newState) {
        this.state = newState;
        return this;
    }

    public PersonBuilder setNewFemale(boolean newFemale) {
        isFemale = newFemale;
        return this;
    }

    public PersonBuilder setNewEmployed(boolean newEmployed) {
        isEmployed = newEmployed;
        return this;
    }

    public PersonBuilder setNewHomeOwner(boolean newHomeOwner) {
        isHomeOwner = newHomeOwner;
        return this;
    }
}
