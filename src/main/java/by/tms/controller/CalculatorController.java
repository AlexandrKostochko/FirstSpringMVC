package by.tms.controller;

import by.tms.entity.Operation;
import by.tms.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping(path = "/calc")
    public ModelAndView calculate(ModelAndView modelAndView) {
        modelAndView.setViewName("calculator");
        return modelAndView;
    }

    @PostMapping(path = "/calc")
    public ModelAndView calculate(ModelAndView modelAndView, Operation operation) {
        Operation result = calculatorService.getResult(operation);
        modelAndView.addObject("calculate", result);
        modelAndView.setViewName("calculator");
        return modelAndView;
    }
}
