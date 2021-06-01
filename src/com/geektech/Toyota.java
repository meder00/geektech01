package com.geektech;

public  final class Toyota extends Honda{

    public Toyota(int year, String color, double volume, BrandAvto brandAvto, int price, String additionallyInfo,
                  String producingCountry) {

        super(year, color, volume, brandAvto, price, additionallyInfo, producingCountry);

    }

    @Override
    public void bol(String additionallyInfo, int price, String producingCountry) {
        super.bol(additionallyInfo, price, producingCountry);
    }
}
