package de.quirmbach.jp.expensetracker.mapper;

import de.quirmbach.jp.expensetracker.dto.ExpenseDto;
import de.quirmbach.jp.expensetracker.entity.ExpenseEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ExpenseMapper {

    ExpenseDto convertToDto(ExpenseEntity expenseEntity);

    ExpenseEntity convertToEntity(ExpenseDto expenseDto);
}
