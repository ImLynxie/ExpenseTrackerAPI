CREATE DATABASE IF NOT EXISTS expenses;

CREATE TABLE IF NOT EXISTS expense
(
    id   INT PRIMARY KEY AUTO_INCREMENT COMMENT 'The ID of the expense.',
    name TINYTEXT NOT NULL COMMENT 'The name of the expense',
    type ENUM ('DEBIT', 'CREDIT', 'CASH') NOT NULL COMMENT 'The type of the expense. i.e` Debit, Credit Cash',
    amount LONG NOT NULL COMMENT 'The amount of the expense.',
    currency_type ENUM ('USD', 'EUR', 'RUB') NOT NULL COMMENT 'The type of the currency.'
)
    COMMENT 'The table that holds all the users expenses.';