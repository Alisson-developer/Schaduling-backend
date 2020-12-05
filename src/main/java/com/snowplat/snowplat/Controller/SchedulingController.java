package com.snowplat.snowplat.Controller;

import com.snowplat.snowplat.Services.SchedulingServices;
import com.snowplat.snowplat.model.Scheduling;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("scheduling")
public class SchedulingController {
    
    @Autowired
    SchedulingServices schedulingServices;
    
    @PostMapping
    public Scheduling createScheduling(@RequestBody Scheduling scheduling) {
        return schedulingServices.createScheduling(scheduling);
    }
    
    @GetMapping
    public List<Scheduling> listSchedules() {
        return schedulingServices.list();
    }
    
}
