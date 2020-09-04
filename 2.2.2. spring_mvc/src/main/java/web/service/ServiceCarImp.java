package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class ServiceCarImp implements ServiseCar{

    private Car car;

    @Override
    public List<Car> getCar() {
        List<Car> car = new ArrayList<>();
        car.add(new Car("GAZ ","21 ","A117MK"));
        car.add(new Car("VAZ ","2107 ","P118PO"));
        car.add(new Car("BMW ","725 ","117ACZ"));
        return car;
    }
}
