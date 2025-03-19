package com.Ausix.backEnd.services;

import com.Ausix.backEnd.models.KPI;
import com.Ausix.backEnd.repositories.KPIRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KPIService {
    private final KPIRepository kpiRepository;

    public KPIService(KPIRepository kpiRepository){
        this.kpiRepository = kpiRepository;
    }

    public List<KPI> getAllKPIs() {
        return kpiRepository.findAll();
    }
}
