package com.company.personbuilder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder().setNewFirstName("Jan").setNewLastName("Beton").setNewCity("Krakow").createPerson();
        Person person2 = new PersonBuilder().setNewCity("Chrubieszow").createPerson();
        person1.presentPerson();
        person2.presentPerson();
    }
}
