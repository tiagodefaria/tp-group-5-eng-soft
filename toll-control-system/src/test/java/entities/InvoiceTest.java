package entities;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Invoice invoice = new Invoice("123", 0.0, "");
        assertEquals("123", invoice.getId());
    }

    @Test
    void setId() {
        Invoice invoice = new Invoice("", 0.0, "");
        invoice.setId("123");
        assertEquals("123", invoice.getId());
    }

    @Test
    void getValue() {
        Invoice invoice = new Invoice("", 1.0, "");
        assertEquals(1.0, invoice.getValue());
    }

    @Test
    void setValue() {
        Invoice invoice = new Invoice("", 0.0, "");
        invoice.setValue(1.0);
        assertEquals(1.0, invoice.getValue());
    }

    @Test
    void getStatus() {
        Invoice invoice = new Invoice("", 0.0, "OK");
        assertEquals("OK", invoice.getStatus());
    }

    @Test
    void setStatus() {
        Invoice invoice = new Invoice("", 0.0, "");
        invoice.setStatus("OK");
        assertEquals("OK", invoice.getStatus());
    }
}