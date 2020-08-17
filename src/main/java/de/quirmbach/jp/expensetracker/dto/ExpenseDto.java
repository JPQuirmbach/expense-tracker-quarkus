package de.quirmbach.jp.expensetracker.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ExpenseDto {

    private Long id;
    @NotBlank(message = "Name should not be blank")
    private String name;
    @NotNull(message = "Amount should not be null")
    private Double amount;
}
