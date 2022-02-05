package crud.web.controller;

import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import crud.service.UserServiceImp;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceImp userService;

    public UserController(UserServiceImp userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model/*, @RequestParam(value = "count", required = false) Integer count*/) {
//        List<User> userList;
//
//        if(count == null || count > 5 || count < 0) {
//            userList = userService.getAllUsers();
//        } else {
//            userList = userService.getSeveralUsers(count);
//        }
        model.addAttribute("users", userService.getAllUsers());
        return "users/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.show(id));
        return "users/show";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "users/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }
}

