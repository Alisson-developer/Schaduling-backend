package com.snowplat.snowplat.Services;

import com.snowplat.snowplat.Repository.TreatmentRepository;
import com.snowplat.snowplat.model.Treatment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TreatmentServices {
    
    @Autowired
    TreatmentRepository treatmentRepository;
    
    public Treatment createTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }
    
    public List<Treatment> listTreatment() {
        return treatmentRepository.findAll();
    }
    
}
