package com.geektech;

public class Honda extends Avto{
    private int price;
    private String additionallyInfo;
    private String producingCountry;

    public Honda(int year, String color, double volume, BrandAvto brandAvto, int price,String additionallyInfo,String producingCountry) {
        super(year, color, volume,brandAvto);
        this.price = price;
        this.additionallyInfo = additionallyInfo;
        this.producingCountry = producingCountry;
    }
    public final void bol( int price , String additionallyInfo){

        System.out.println("Цена машины: " + price + " Допольнительная информация: " + additionallyInfo);
    }
    public void bol(String additionallyInfo, int price, String producingCountry){

        System.out.println( " Допольнительная информация: " + additionallyInfo + " Цена машины: " + price +
                " Страна производства: " + producingCountry);
    }
    public String getInfo(){
        return " Год машины: " + getYear() + " Цвет машины: " + getColor() + " Обьём машины: " + getVolume() +
                " Цена машины: " + price + " Допольнительная информация: " + additionallyInfo +
                " Страна производства: " + producingCountry;
    }
}
