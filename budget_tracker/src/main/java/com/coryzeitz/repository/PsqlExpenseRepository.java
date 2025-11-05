package com.coryzeitz.repository;

import com.coryzeitz.model.*;
import java.util.*;

public class PsqlExpenseRepository implements ExpenseRepository{
    
public Boolean save(Expense expense) {
        // TODO: Implementation
        return true;
    }

    public Boolean saveAll(List<Expense> expenses) {
        // TODO: Implementation
        return true;
    }

    public List<Expense> findAll() {
        // TODO: Implementation
        return new ArrayList<>();
    }

    public Optional<Expense> findById(String id) {
        // TODO: Implementation
        return Optional.empty();
    }

    public Boolean update(Expense expense) {
        // TODO: Implementation
        return true;
    }

    public Boolean delete(int id) {
        // TODO: Implementation
        return true;
    }

    public Boolean deleteAll() {
        // TODO: Implementation
        return true;
    }

    public  List<Expense> loadAll() {
        return new ArrayList<>();
    }
}