package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {}

    {   cars.add(new Car("Mercedes", "White", 777));
        cars.add(new Car("RangeRover", "Black", 333));
        cars.add(new Car("BMW", "Grey", 139));
        cars.add(new Car("Lada", "Red", 999));
        cars.add(new Car("Ford", "White", 347));
    }

    @Override
    public List<Car> getCarCount(int count) {
        for (int i = 0; i < count; i++) {
            if (count < 5) {
            return  cars.subList(0, count);
            }
        }
        return cars;

    }
}
