package com.lynxie.expensetracker.constants;

import lombok.Getter;

public enum ExpenseType {
    DEBIT("DEBIT"),
    CREDIT("CREDIT"),
    CASH("CASH");

    @Getter
    private final String name;

    ExpenseType(String name) {
        this.name = name;
    }


}
