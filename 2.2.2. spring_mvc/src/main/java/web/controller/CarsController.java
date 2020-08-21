package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.ServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private ServiceImpl service;
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<Car> arrayList = service.getCarList();
        model.addAttribute("carList",arrayList);
        return "cars";
    }
}
