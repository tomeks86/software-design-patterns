package com.company.personbuilder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonBuilderTest {
    @Test
    public void createPerson() throws Exception {
        Person person = (new PersonBuilder())
                .setNewCity("Warszawa")
                .setNewSituation("single")
                .createPerson();
        Assert.assertTrue(person.getCity().equals("Warszawa"));
        Assert.assertFalse(person.getSituation().equals("married"));
    }

}