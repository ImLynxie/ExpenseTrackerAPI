create table expense
(
    id   LONG auto_increment comment 'The ID of the expense.',
    name TINYTEXT                         not null comment 'The name of the expense',
    type ENUM ('DEBIT', 'CREDIT', 'CASH') null comment 'The type of the expense. i.e` Debit, Credit Cash',
    constraint expense_id
        primary key (id)
)
    comment 'The table that holds all the users expenses.';