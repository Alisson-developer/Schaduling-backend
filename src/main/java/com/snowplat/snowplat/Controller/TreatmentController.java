package com.snowplat.snowplat.Controller;

import com.snowplat.snowplat.Services.TreatmentServices;
import com.snowplat.snowplat.model.Treatment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("treatment")
public class TreatmentController {
    
    @Autowired
    TreatmentServices treatmentServices;

    @PostMapping
    public Treatment createTreatment(@RequestBody Treatment treatment) {
        return treatmentServices.createTreatment(treatment);
    }

    @GetMapping
    public List<Treatment> getTreatment() {
        return treatmentServices.listTreatment();
    }

    
}
