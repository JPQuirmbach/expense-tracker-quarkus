package de.quirmbach.jp.expensetracker.repository;

import de.quirmbach.jp.expensetracker.entity.ExpenseEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExpenseRepository implements PanacheRepository<ExpenseEntity> {
}
