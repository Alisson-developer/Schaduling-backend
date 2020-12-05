package com.snowplat.snowplat.Services;

import com.snowplat.snowplat.Repository.SchedulingRepository;
import com.snowplat.snowplat.model.Scheduling;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SchedulingServices {
    
    @Autowired
    SchedulingRepository schedulingRepository;
    
    public Scheduling createScheduling(Scheduling scheduling) {
        return schedulingRepository.save(scheduling);
    }
    
    public List<Scheduling> list() {
        return schedulingRepository.findAll();
    }
    
}
