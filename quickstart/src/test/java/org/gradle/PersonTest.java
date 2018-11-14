package org.gradle;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    private Person person;

    @Before
    public void before(){
        person = new Person("123456789w","Larry", "Mendez", "Famele", 18, 78451236);
    }
    @Test
    public void canConstructAPersonWithACi() {
        assertEquals("123456789w", person.getCi());
    }
    @Test
    public void notCanConstructAPersonWithACiEmpty() {
        String ci = " ";
        assertFalse(ci.equals(person.getCi()));
    }
    @Test
    public void noCanConstructAPersonWithACiError() {
        assertNotEquals("123456789a", person.getCi());
    }

    @Test
    public void canConstructAPersonWithAName() {
        assertEquals("Larry", person.getName());
    }

    @Test
    public void notCanConstructAPersonWithANameEmpty() {
        String name = " ";
        assertFalse(name.equals(person.getName()));
    }

    @Test
    public void canConstructAPersonWithALastName() {
        assertEquals("Mendez", person.getLast_name());
    }

    @Test
    public void canConstructAPersonWithGander() {
        assertEquals("Famele", person.getGender());
    }

    @Test
    public void canConstructAPersonWithAge() {
        assertEquals(18, person.getAge());
    }
    @Test
    public void canConstructAPersonWithAgeMajor() {
        int age = 55;
        assertTrue(age >= person.getAge());
    }

    @Test
    public void canConstructAPersonWithAgeLess() {
        int age = 1;
        assertTrue(age <= person.getAge());
    }

    @Test
    public void canConstructAPersonWithNumber() {
        int number = 78451236;
        assertTrue(number == person.getNumberCell());
    }


}
