package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("A4", "Audi", 155));
        cars.add(new Car("Q7", "Audi", 260));
        cars.add(new Car("M5", "BMV", 350));
        cars.add(new Car("Priora", "LADA", 109));
        cars.add(new Car("Passat", "Volkswagen", 149));
    }

    @Override
    public List<Car> getCars(int numberOf) {
        if (numberOf < 5) {
            return cars.stream().limit(numberOf).collect(Collectors.toList());
        } else {
            return cars;
        }
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
