package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5", required = false) int count, ModelMap model) {
        CarServiceImpl carServiceImp = new CarServiceImpl();
        count  = count > 5? 5: count;
        List<Car> cars = carServiceImp.getCar(count);
        model.addAttribute("cars", cars);
        return "cars";
}



}
