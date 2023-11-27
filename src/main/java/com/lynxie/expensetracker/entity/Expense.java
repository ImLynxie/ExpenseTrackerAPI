package com.lynxie.expensetracker.entity;

import com.lynxie.expensetracker.constants.CurrencyType;
import com.lynxie.expensetracker.constants.ExpenseType;
import com.sun.istack.NotNull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;

@Data
@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private ExpenseType type;
    @NotNull
    private int amount;
    @NotNull
    private CurrencyType currencyType;

    public Expense(String name, ExpenseType type, int amount, CurrencyType currencyType) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.currencyType = currencyType;
    }
}
