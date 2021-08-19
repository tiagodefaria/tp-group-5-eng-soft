package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TagTest {

    @Test
    void getId() {
        Tag tag = new Tag("123");
        assertEquals("123", tag.getId());
    }

    @Test
    void setId() {
        Tag tag = new Tag("");
        tag.setId("123");
        assertEquals("123", tag.getId());
    }
}