package com.snowplat.snowplat.Repository;

import com.snowplat.snowplat.model.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
    
}
