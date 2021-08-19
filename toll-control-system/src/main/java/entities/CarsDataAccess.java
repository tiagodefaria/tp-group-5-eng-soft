package entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsDataAccess {
    public List<Vehicle> getCars() {
        String arquivoCSV = "DataBase/carsDB.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {
                String[] data = linha.split(csvDivisor);
                vehicles.add(new Vehicle(data[0], new Tag(data[1]), new Person(data[2])));
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  vehicles;
    }
}