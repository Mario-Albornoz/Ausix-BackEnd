package com.Ausix.backEnd.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Month {
    private String month;
    private BigDecimal revenue;
    private BigDecimal expenses;
    private BigDecimal operationalExpenses;
    private BigDecimal nonOperationalExpenses;
}
