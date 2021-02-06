package by.tms.storage;

import by.tms.entity.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryHistoryStorage {
    private static List<Operation> operations = new ArrayList<>();
    private static int id = 1;

    public void save(Operation operation) {
        operation.setIdOperation(id++);
        operations.add(operation);
    }
    public List<Operation> history() {
        return new ArrayList<>(operations);
    }
}
