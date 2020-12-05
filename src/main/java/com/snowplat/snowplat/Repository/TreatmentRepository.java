package com.snowplat.snowplat.Repository;

import com.snowplat.snowplat.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
    
}
