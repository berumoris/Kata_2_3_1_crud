package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImp;
import java.util.List;

@Controller
public class CarController {
    CarServiceImp carService = new CarServiceImp();

    @GetMapping("/cars")
    String getCarList(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> carList;

        if(count == null || count > 5 || count < 0) {
            carList = carService.getAllCars();
        } else {
            carList = carService.getSeveralCars(count);
        }

        model.addAttribute("cars", carList);

        return "/cars";
    }


}
