package entities;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsDataAccessTest {

    @Test
    void getCars() {
        Vehicle vehicle = new Vehicle("HCC9993",new Tag("TAG3"),new Person("123456"));
        CarsDataAccess carsDataAccess = new CarsDataAccess();
        List<Vehicle> vehicles = carsDataAccess.getCars();

        boolean test = false;

        for (Vehicle v: vehicles ) {
            if (v.getPlate().equals(vehicle.getPlate()) && v.getAssociatedTag().getId().equals(vehicle.getAssociatedTag().getId()) && v.getOwner().getId().equals(vehicle.getOwner().getId())) {
                test = true;
            }
        }
        assert(!vehicles.isEmpty());
        assert(test);
    }
}