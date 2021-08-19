package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("Name","");
        assertEquals("Name", person.getName());
    }

    @Test
    void setName() {
        Person person = new Person("","");
        person.setName("Name");
        assertEquals("Name", person.getName());
    }

    @Test
    void getId() {
        Person person = new Person("","123");
        assertEquals("123", person.getId());
    }

    @Test
    void setId() {
        Person person = new Person("","");
        person.setId("123");
        assertEquals("123", person.getId());
    }
}