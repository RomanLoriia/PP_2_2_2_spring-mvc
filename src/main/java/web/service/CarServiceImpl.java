package web.service;

import org.springframework.stereotype.Component;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl  implements CarService{

    public static List<Car> carList() {
        List<Car> car_List = new ArrayList<>();

        for (int a = 1; a <= 5; a++){
            Car car = new Car();
            car.setCompany("BMW");
            car.setCost(a * 1000);
            car.setModel(a);
            car_List.add(car);
        }
        return car_List;
    }


    @Override
    public List<Car> getCar(int num) {
        if(num >= 5){
            return carList().subList(0, 5);
        }
        return carList().subList(0, num);
    }
}
