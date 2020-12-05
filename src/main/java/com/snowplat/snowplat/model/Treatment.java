package com.snowplat.snowplat.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treatment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameTreatment;
    private String priceTreatment;
    private String timeTreatment;
    
    public Treatment() {}
    
    public Treatment(String nameTreatment, String priceTreatment, String timeTreatment) {
        this.nameTreatment = nameTreatment;
        this.priceTreatment = priceTreatment;
        this.timeTreatment = timeTreatment;
    }
    
    public String getNameTreatment() {
        return this.nameTreatment;
    }
    
    public void setNameTreatment(String nameTreatment) {
        this.nameTreatment = nameTreatment;
    }
    
    public String getPriceTreatment() {
        return this.priceTreatment;
    }
    
    public void setPriceTreatment(String priceTreatment) {
        this.priceTreatment = priceTreatment;
    }
    
    public String getTimeTreatment() {
        return this.timeTreatment;
    }
    
    public void setTimeTreatment(String timeTreatment) {
        this.timeTreatment = timeTreatment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
