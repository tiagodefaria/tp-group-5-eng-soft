package entities;

import enums.Status;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ChargesDataAccessTest {

    @Test
    void addCharge() {
        Charge charge = new Charge("ABC1234", Date.from(Instant.now()), Status.NOT_PAID, 10.5);
        ChargesDataAccess chargesDataAccess = new ChargesDataAccess();
        chargesDataAccess.AddCharge(charge);
    }
}