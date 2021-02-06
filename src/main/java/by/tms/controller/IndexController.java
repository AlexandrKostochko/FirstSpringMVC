//package by.tms.controller;
//
//import by.tms.service.Calculator;
//import by.tms.storage.InMemoryHistoryStorage;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping(path = "/")
//public class IndexController {
//
//    @GetMapping
//    public String index(Model model) {
//        model.addAttribute("name", "Test");
//        InMemoryHistoryStorage inMemoryHistoryStorage = new InMemoryHistoryStorage();
//        model.addAttribute("history", inMemoryHistoryStorage.history());
//        return "history";
//    }
//
////    @GetMapping(path = "/index2")
////    public String index2(String numOne, String numTwo, String operation, Model model) {
////        model.addAttribute("numOne", numOne);
////        model.addAttribute("numTwo", numTwo);
////        model.addAttribute("operation", operation);
////        Calculator calculator = new Calculator();
////        model.addAttribute("result", calculator.oper(Double.parseDouble(numOne), Double.parseDouble(numTwo), operation));
////        InMemoryHistoryStorage inMemoryHistoryStorage = new InMemoryHistoryStorage();
////        inMemoryHistoryStorage.inc(calculator.oper(Double.parseDouble(numOne), Double.parseDouble(numTwo), operation));
////        return "index";
////    }
//
////    @GetMapping(path = "index1/{age}/{name}")
////    public ModelAndView index1(@Pa)
//}
