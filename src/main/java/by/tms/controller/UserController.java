package by.tms.controller;

import by.tms.entity.User;
import by.tms.service.UserService;
import by.tms.storage.InMemoryUserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    InMemoryUserStorage inMemoryUserStorage;

    @GetMapping(path = "/reg")
    public ModelAndView registration(ModelAndView modelAndView) {
        modelAndView.setViewName("reg");
        return modelAndView;
    }

    @PostMapping (path = "/reg")
    public ModelAndView registration(User user, ModelAndView modelAndView) {
        if (userService.add(user)) {
            modelAndView.addObject("result", "registration is complete");
        } else {
            modelAndView.addObject("wrongResult", "Registration is not complete");
        }
        modelAndView.setViewName("reg");
        return modelAndView;
    }

    @GetMapping(path = "/auth")
    public ModelAndView authorization(ModelAndView modelAndView) {
        modelAndView.setViewName("auth");
        return modelAndView;
    }

    @PostMapping(path = "/auth")
    public ModelAndView authorization(ModelAndView modelAndView, HttpSession httpSession, User user, String password) {
        User byLogin = userService.getByLogin(user.getLogin());
        modelAndView.addObject("password", password);
        if (byLogin != null && userService.checkPassword(user, password)) {
            httpSession.setAttribute("user", byLogin);
            modelAndView.setViewName("redirect:/");
        } else {
            modelAndView.addObject("wrongResult", "Wrong login or password");
            modelAndView.setViewName("auth");
        }
        return modelAndView;
    }

    @GetMapping(path = "/logout")
    public ModelAndView logout(ModelAndView modelAndView, HttpSession httpSession) {
        httpSession.invalidate();
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @GetMapping(path = "/allInfo")
    public ModelAndView allInfo(ModelAndView modelAndView) {
        modelAndView.addObject("users", inMemoryUserStorage.getAllUsers());
        modelAndView.setViewName("allInfo");
        return modelAndView;
    }
}
