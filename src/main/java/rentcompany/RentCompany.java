package rentcompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    List<Car> cars;

    private RentCompany() {
        cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return null;
    }
}
