package com.snowplat.snowplat.Services;

import com.snowplat.snowplat.Repository.OwnerRepository;
import com.snowplat.snowplat.model.Owner;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OwnerServices {
    
    @Autowired
    OwnerRepository ownerRepository;
    
    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }
    
    public List<Owner> listOwner() {
        return ownerRepository.findAll();
    }
    
}
