package by.tms.controller;

import by.tms.entity.Operation;
import by.tms.storage.InMemoryHistoryStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class HistoryController {

    @Autowired
    InMemoryHistoryStorage inMemoryHistoryStorage;

    @GetMapping(path = "/history")
    public ModelAndView getHistory(ModelAndView modelAndView) {
        modelAndView.addObject("operations", inMemoryHistoryStorage.history());
        return modelAndView;
    }
}
