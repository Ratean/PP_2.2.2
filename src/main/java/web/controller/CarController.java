package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;

import java.util.List;

@Controller
@RequestMapping("cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String index (@RequestParam(value = "count", required = false) String count, Model model) {

        List<Car> cars;
        if (count == null) {
            cars = carService.getCars();
        } else {
            cars = carService.getCars(Integer.valueOf(count));
        }
        model.addAttribute("cars", cars);
        return "cars";
    }

}
