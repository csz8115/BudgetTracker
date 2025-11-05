package com.coryzeitz.repository;

import com.coryzeitz.model.*;
import java.util.*;

public interface ExpenseRepository {
    /**
     * Load all expenses from peristant memory store
     * 
     * @return List of all expense entries
     */
    List<Expense> loadAll();

    /**
     * Save an expense to persistant memory store
     * 
     * @param expense Expense entry to Save
     */
    Boolean save(Expense expense);

    /**
     * Save all expenses to persistant memory store
     * overwriting all previous expense entries
     * 
     * @param expenses Expense entries to Save
     */
    Boolean saveAll(List<Expense> expenses);

    /**
     * Delete an expense entry from persistant memory
     * 
     * @param id id of the expense entry to delete
     * 
     * @return List of all expense entries
     */
    Boolean delete(int id);

    /**
     * Delete all expensde entries from persistant memory
     * 
     * @return List of all expense entries
     */
    Boolean deleteAll();
}