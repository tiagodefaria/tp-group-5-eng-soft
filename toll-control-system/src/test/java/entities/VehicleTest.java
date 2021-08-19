package entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class VehicleTest {

    @Test
    void getAssociatedTag() {
        Vehicle vehicle = new Vehicle("",new Tag("123"),new Person());
        assertEquals("123", vehicle.getAssociatedTag().getId());
    }

    @Test
    void setAssociatedTag() {
        Vehicle vehicle = new Vehicle("",new Tag(""),new Person());
        vehicle.setAssociatedTag(new Tag("123"));
        assertEquals("123", vehicle.getAssociatedTag().getId());
    }

    @Test
    void getPlate() {
        Vehicle vehicle = new Vehicle("ABC123",new Tag(""),new Person());
        assertEquals("ABC123", vehicle.getPlate());
    }

    @Test
    void setPlate() {
        Vehicle vehicle = new Vehicle("",new Tag(""),new Person());
        vehicle.setPlate("ABC123");
        assertEquals("ABC123", vehicle.getPlate());
    }

    @Test
    void getOwner() {
        Vehicle vehicle = new Vehicle("",new Tag(""),new Person("Name", "123"));
        assertEquals("123", vehicle.getOwner().getId());
        assertEquals("Name", vehicle.getOwner().getName());
    }

    @Test
    void setOwner() {
        Vehicle vehicle = new Vehicle("",new Tag(""),new Person());
        vehicle.setOwner(new Person("Name", "123"));
        assertEquals("123", vehicle.getOwner().getId());
        assertEquals("Name", vehicle.getOwner().getName());
    }
}