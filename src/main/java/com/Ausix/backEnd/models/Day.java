package com.Ausix.backEnd.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Day {
    private String date;
    private BigDecimal revenue;
    private BigDecimal expenses;
}
