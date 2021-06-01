package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Honda fit = new Honda(2015,"Белый",1.5,BrandAvto.FIT,350000,
                "Машина хорошим состаяние не битый родной краска ", "Япония");
        System.out.println("____________________");
        System.out.println(fit.getInfo());

        Honda step = new Honda(2003,"серебристый",2.4,BrandAvto.STEPWGN,600000,
                "Машина хорошим состаяние не битый родной краска 7 мест ","Япония");
        System.out.println("____________________");
        System.out.println(step.getInfo());

        Honda odyssiy = new Honda(2004,"серый",2.3,BrandAvto.ODYSSEY,450000,
                "Машина хорошим состаяние не битый родной краска 7 мест","Япония");
        System.out.println("____________________");
        System.out.println(odyssiy.getInfo());

        Toyota ipsum = new Toyota(2003,"серый",2.4,BrandAvto.IPSUM,430000,
                "Машина хорошим состаяние не битый родной краска 7 мест","Япония");
        System.out.println("____________________");
        System.out.println(ipsum.getInfo());

        Toyota camry70 = new Toyota(2021,"красный",3.5,BrandAvto.CAMRY,30000000,
                "Машина находится в авто салоне toyota","Америка");
        System.out.println("____________________");
        System.out.println(camry70.getInfo());


        Toyota corolloa = new Toyota(2020,"чёрный",2.5,BrandAvto.CORROLOA,10000000,
                "Машина находится в авто салоне toyota","Америка");
        System.out.println("____________________");
        System.out.println(corolloa.getInfo());
    }
}
