package com.Ausix.backEnd.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Document(collection = "kpis")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class KPI {
    @Id
    private String id;

    private BigDecimal totalProfit;

    private BigDecimal totalRevenue;

    private BigDecimal totalExpenses;

    private Map<String, BigDecimal> expensesByCategory;

    private List<Month> monthlyData;

    private List<Day> dailyData;
}
