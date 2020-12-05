package com.snowplat.snowplat.model;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scheduling {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nameClient;
    private String date;

    public Scheduling() {}
    
    public Scheduling(String nameClient, String date) {
        this.nameClient = nameClient;
        this.date = date;
    }
    
    public String getNameClient() {
        return this.nameClient;
    }
    
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String dateTime) {
        this.date = dateTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nameClient);
        hash = 67 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Scheduling other = (Scheduling) obj;
        
        if (!Objects.equals(this.nameClient, other.nameClient)) {
            return false;
        }
        
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        
        return true;
    }
    
}
