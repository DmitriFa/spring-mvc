package web.controller;


import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.ServiceCarImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model) {
        ServiceCarImp serviceCarImp = new ServiceCarImp();
        model.addAttribute("message",  serviceCarImp.getCar().get(0).getName());
        model.addAttribute("message1", serviceCarImp.getCar().get(0).getSeries());
        model.addAttribute("message2", serviceCarImp.getCar().get(0).getNumder());
        model.addAttribute("message3", serviceCarImp.getCar().get(1).getName());
        model.addAttribute("message4", serviceCarImp.getCar().get(1).getSeries());
        model.addAttribute("message5", serviceCarImp.getCar().get(1).getNumder());
        model.addAttribute("message6", serviceCarImp.getCar().get(2).getName());
        model.addAttribute("message7", serviceCarImp.getCar().get(2).getSeries());
        model.addAttribute("message8", serviceCarImp.getCar().get(2).getNumder());
        return "cars";
    }
}
