import java.util.Objects;

public class Car {
    private String brand; // марка автомобиля
    private String model; // модель автомобиля
    private double engineVolume; // двигатель объем
    private String color; // цвет автомобиля
    private int year; // год выпуска автомобиля
    private String country; // страна сборки автомобиля

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return " Марка автомобиля: " + brand + " Модель автомобиля: " + model + " объем двигателя: " + engineVolume +
                " Цвет автомобиля: " + color + " год выпуска автомобиля: " + year + " страна сборки автомобиля: " + country;
    }
}









