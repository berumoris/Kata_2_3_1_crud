package web.controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserServiceImp;

import java.util.List;

@Controller
public class UserController {
    UserServiceImp userService = new UserServiceImp();

    @GetMapping("/users")
    String getCarList(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<User> userList;

        if(count == null || count > 5 || count < 0) {
            userList = userService.getAllUsers();
        } else {
            userList = userService.getSeveralUsers(count);
        }

        model.addAttribute("users", userList);

        return "/users";
    }
}

