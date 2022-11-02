package Day20;

import java.util.Scanner;

public class MaxMin {



        /*Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.*/
        public static void main(String[] args) {


            int[] numbers = new int[10];

            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {

                System.out.print((i + 1) + ".  Numara Giriniz : ");

                numbers[i] = input.nextInt();
            }
            int max=numbers[0];
            int min=numbers[0];

            for (int num:
                    numbers) {
                if (num>max){
                    max=num;

                } else if (num<min) {
                    min=num;

                }



            }
            System.out.printf("Büyük Sayı : %d \n ", max);
            System.out.printf("Küçük sayı Sayı : %d  ", min);
}
