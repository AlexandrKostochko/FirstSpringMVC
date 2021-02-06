package by.tms.service;

import by.tms.entity.Operation;
import by.tms.storage.InMemoryHistoryStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CalculatorService {

    @Autowired
    InMemoryHistoryStorage inMemoryHistoryStorage;

//    private List<String> operations = Arrays.asList("sum", "div", "multi", "dev");

    public Operation getResult(Operation operation) {
        switch (operation.getOperation()){
            case "sum" :
                operation.setResult(sum(operation.getFirstNum(), operation.getSecondNum()));
                break;
            case "div" :
                operation.setResult(div(operation.getFirstNum(), operation.getSecondNum()));
                break;
            case "multi" :
                operation.setResult(multi(operation.getFirstNum(), operation.getSecondNum()));
                break;
            case "dev" :
                operation.setResult(dev(operation.getFirstNum(), operation.getSecondNum()));
                break;
        }
        inMemoryHistoryStorage.save(operation);
        return operation;
    }

//    public String oper(double first, double second, String oper) {
//        switch (oper) {
//            case "sum":
//                return first + " + " + second + " = " + sum(first, second);
//            case "div":
//                return first + " - " + second + " = " + div(first, second);
//            case "multi":
//                return first + " * " + second + " = " + multi(first, second);
//            case "dev":
//                return first + " / " + second + " = " + dev(first, second);
//        }
//        return null;
//    }

    private double sum(double first, double second) {
        return first + second;
    }

    private double div(double first, double second) {
        return first - second;
    }

    private double multi(double first, double second) {
        return first * second;
    }

    private double dev(double first, double second) {
        return first / second;
    }

//    public List<String> getOperations() {
//        return new ArrayList<>(operations);
//    }
}
