package de.quirmbach.jp.expensetracker.controller;

import de.quirmbach.jp.expensetracker.dto.ExpenseDto;
import de.quirmbach.jp.expensetracker.entity.ExpenseEntity;
import de.quirmbach.jp.expensetracker.mapper.ExpenseMapper;
import de.quirmbach.jp.expensetracker.service.ExpenseService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/expense")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExpenseTrackerController {

    @Inject
    ExpenseService expenseService;

    @Inject
    ExpenseMapper expenseMapper;

    @POST
    public ExpenseDto createExpense(@Valid ExpenseDto expenseDto) {
        ExpenseEntity expenseEntity = expenseMapper.convertToEntity(expenseDto);
        expenseEntity = expenseService.createExpense(expenseEntity);
        return expenseMapper.convertToDto( expenseEntity );
    }
}