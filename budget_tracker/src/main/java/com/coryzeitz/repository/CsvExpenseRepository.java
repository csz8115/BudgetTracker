package com.coryzeitz.repository;

import com.coryzeitz.model.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class CsvExpenseRepository implements ExpenseRepository {
    private static final Path filePath = Paths.get("expenses.csv");
    private static final String[] HEADERS = { "ID", "Date", "Category", "Amount", "Description" };

    public CsvExpenseRepository() {
        ensureFileExists();
    }

    public void ensureFileExists() {
        try {
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
                    writer.write(String.join(",", HEADERS));
                    writer.newLine();
                }
            }
        } catch (IOException error) {
            throw new RuntimeException("Could not find CSV file, " + error);
        }
    }

    public Boolean save(Expense expense) {
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
            // TODO: write logic
        } catch (IOException error) {
            error.printStackTrace();
            return false;
        }
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

    public List<Expense> loadAll() {
        // TODO: Implementation
        return new ArrayList<>();
    }
}
