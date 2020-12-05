package com.snowplat.snowplat.Controller;

import com.snowplat.snowplat.Services.OwnerServices;
import com.snowplat.snowplat.model.Owner;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("owner")
public class OwnerController {
    
    @Autowired
    OwnerServices ownerServices;
    
    @PostMapping
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerServices.createOwner(owner);
    }
    
    @GetMapping
    public List<Owner> listOwner() {
        return ownerServices.listOwner();
    }
    
}
