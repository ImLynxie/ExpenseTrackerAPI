package com.lynxie.expensetracker.controller;

import com.lynxie.expensetracker.entity.Expense;
import com.lynxie.expensetracker.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/expenses")
    private List<Expense> all() {
        return (List<Expense>) repository.findAll();
    }

    @PostMapping("/expense")
    private Expense newExpense(@RequestBody Expense expense) {
        return repository.save(expense);
    }

    @DeleteMapping("/expense/{id}")
    private void deleteExpense(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
