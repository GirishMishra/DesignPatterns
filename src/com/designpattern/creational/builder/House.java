package com.designpattern.creational.builder;

public class House implements IHouse {

    private String basement;
    private String roof;
    private String structure;
    private String interior;

    @Override
    public void setBasement(String basement) {
     this.basement = basement;
    }

    @Override
    public void setRoof(String roof) {
     this.roof = roof;
    }

    @Override
    public void setStructure(String structure) {
     this.structure = structure;
    }

    @Override
    public void setInterior(String interior) {
     this.interior =interior;
    }

    public String getBasement() {
        return basement;
    }

    public String getRoof() {
        return roof;
    }

    public String getStructure() {
        return structure;
    }

    public String getInterior() {
        return interior;
    }
}
