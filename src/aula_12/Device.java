package aula_12;

import aula_12.IMedia;

public abstract class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public abstract void turnOn();
    
    public abstract void turnOff();
    
    public void playMedia(IMedia media) {
        System.out.println("Dispositivo utilizado: " + model);
        media.play();
    }
    
}
