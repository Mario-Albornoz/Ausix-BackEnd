package com.Ausix.backEnd.repositories;

import com.Ausix.backEnd.models.KPI;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KPIRepository extends MongoRepository<KPI, String> {

}
