package entities;

import enums.Status;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ChargeTest {

    @Test
    void getPlate() {
        Charge charge = new Charge("ABC123",new Date(), Status.NOT_PAID,0.0);
        assertEquals("ABC123", charge.getPlate());
    }

    @Test
    void setPlate() {
        Charge charge = new Charge("",new Date(),Status.NOT_PAID,0.0);
        charge.setPlate("ABC123");
        assertEquals("ABC123", charge.getPlate());
    }

    @Test
    void getStatus() {
        Charge charge = new Charge("",new Date(),Status.NOT_PAID,0.0);
        assertEquals(Status.NOT_PAID, charge.getStatus());
    }

    @Test
    void setStatus() {
        Charge charge = new Charge("",new Date(),Status.NOT_PAID,0.0);
        charge.setStatus(Status.PAID);
        assertEquals(Status.PAID, charge.getStatus());
    }

    @Test
    void getPrice() {
        Charge charge = new Charge("",new Date(),Status.NOT_PAID,10.0);
        assertEquals(10.0, charge.getPrice());
    }

    @Test
    void setPrice() {
        Charge charge = new Charge("",new Date(),Status.NOT_PAID,10.0);
        charge.setPrice(100.0);
        assertEquals(100.0, charge.getPrice());
    }
}