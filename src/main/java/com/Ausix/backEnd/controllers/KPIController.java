package com.Ausix.backEnd.controllers;

import com.Ausix.backEnd.models.KPI;
import com.Ausix.backEnd.services.KPIService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kpis")
@CrossOrigin(origins = "http://localhost:5173")
public class KPIController {
    private final KPIService kpiService;

    public KPIController(KPIService kpiService){
        this.kpiService = kpiService;
    }

    @GetMapping
    public List<KPI> getAllKPIs(){
        return kpiService.getAllKPIs();
    }
}
