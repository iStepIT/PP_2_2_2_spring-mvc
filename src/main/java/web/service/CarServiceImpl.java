package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    public static List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car(1, "V6", "Audi"));
        carsList.add(new Car(2, "V6", "BMW"));
        carsList.add(new Car(3, "V4", "Niva"));
        carsList.add(new Car(4, "V4", "Lada"));
        carsList.add(new Car(5, "V8", "Hummer"));
    }

    @Override
    public List<Car> carsList(int count) {
        if (count > 5) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
