package com.snowplat.snowplat.Repository;

import com.snowplat.snowplat.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OwnerRepository extends JpaRepository<Owner, Long> {
    
}
