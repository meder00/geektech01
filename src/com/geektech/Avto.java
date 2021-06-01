package com.geektech;

public class Avto {
    private int year;
    private String color;
    private double volume;
    private BrandAvto brandAvto;



    public Avto(int year, String color, double volume, BrandAvto brandAvto) {
        this.year = year;
        this.color = color;
        this.volume = volume;
        this.brandAvto = brandAvto;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {

        return color;
    }

    public double getVolume() {

        return volume;
    }
    public BrandAvto getBrandAvto() {
        return brandAvto;
    }
}
