package day22;

import java.util.Scanner;

public class OdevAracFiyatları {

    /*String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

    dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
1. Honda
2. Toyota
...     şeklinde olacaktır.

    Listenin en altında kullanıcıdan seçim yapması istenilecektir.*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        System.out.println("\tHoşgeldiniz\t-----------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + " . : " + cars[i]);
        }

            int choise;

            do {

                System.out.print("Lütfen Seçim Yapınız :");
                 choise = input.nextInt();


                switch (choise) {
                    case 1, 2, 3 -> {
                        int fiyatAralıgı = (40000 - 20000) + 1;
                        double fiat = Math.round((20000 + (Math.random() * fiyatAralıgı)));
                        System.out.printf("İstediğiniz Araç :%s, %5.2f TL", cars[choise - 1], fiat);
                    }
                    case 4, 5 -> {
                        int fiyatAralıgı = (80000 - 50000) + 1;
                        double fiat = Math.round((20000 + (Math.random() * fiyatAralıgı)));
                        System.out.printf("İstediğiniz Araç :%s, %5.2f TL", cars[choise - 1], fiat);


                    }
                    case 6, 7 -> {
                        int fiyatAralıgı = (150000 - 100000) + 1;
                        double fiat = Math.round((20000 + (Math.random() * fiyatAralıgı)));
                        System.out.printf("İstediğiniz Araç Fiyatı :%s, %5.2f TL", cars[choise - 1], fiat);


                    }
                    default -> System.out.println("Yanlış Seçim Yapıldı");


                }


            } while (choise > 8);

    }
}