package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChargeBusinessRulesTest {

    @Test
    void chargeByPlate() {
        assertEquals(0,ChargeBusinessRules.chargeByPlate("HCC9999"));
    }

    @Test
    void chargeByTAG() {
        assertEquals(0,ChargeBusinessRules.chargeByTAG("TAG1"));
    }
}