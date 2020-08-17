package de.quirmbach.jp.expensetracker.service;

import de.quirmbach.jp.expensetracker.entity.ExpenseEntity;
import de.quirmbach.jp.expensetracker.repository.ExpenseRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class ExpenseService {

    @Inject
    private ExpenseRepository expenseRepository;

    @Transactional
    public ExpenseEntity createExpense(ExpenseEntity expenseEntity) {
        expenseRepository.persist(expenseEntity);
        return expenseEntity;
    }
}