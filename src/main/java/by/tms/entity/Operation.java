package by.tms.entity;

import java.util.List;
import java.util.Objects;

public class Operation {

    private double firstNum;
    private double secondNum;
    private double result;
    private String operation;
    private int idOperation;

    public Operation() {
    }

    public Operation(double firstNum, double secondNum, String operation) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
    }

    public Operation(double firstNum, double secondNum, double result, String operation) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = result;
        this.operation = operation;
    }

    public Operation(double firstNum, double secondNum, double result, String operation, int idOperation) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = result;
        this.operation = operation;
        this.idOperation = idOperation;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation1 = (Operation) o;
        return Double.compare(operation1.firstNum, firstNum) == 0 && Double.compare(operation1.secondNum, secondNum) == 0 && Double.compare(operation1.result, result) == 0 && idOperation == operation1.idOperation && Objects.equals(operation, operation1.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNum, secondNum, result, operation, idOperation);
    }

    @Override
    public String toString() {
        return firstNum + " " + operation + " " + secondNum + " = " + result;
    }
}
