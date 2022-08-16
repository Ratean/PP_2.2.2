package web.models;

public class Car {
    private String model;
    private String carBrand;
    private int power;

    public Car() {
    }

    public Car(String model, String carBrand, int power) {
        this.model = model;
        this.carBrand = carBrand;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
