package temaClaseQAcurs1;

import java.util.Scanner;

public class Clase {


    public static String sayHello() {
        return "Hello, World!";
    }

    //2. Scrie o metodă findMax() care primește un array de numere cu virgulă și îl returnează pe
    //cel mai mare. Testează metoda.

    public static double findMax(double x) {
        double[] arrayTest = {1.0, 2.0, 3.9, 4.9, 5.9, 6.7};

        for (int i = 0; i < arrayTest.length; i++) {
            if (arrayTest[i] == 6.7) {
                System.out.println(arrayTest[i]);
            }
        }
        return x;
    }

    //3. Scrie o metodă makeCube() care primește un număr întreg și returnează un long. Testează
    //metoda.
    public static long makeCube(int x) {
        long l = x;
        return l;
    }

    //4. Scrie o metodă reverseWord() care primește un string și îl returnează întors. Testează
    //metoda.
    public static String reverseWord(String str) {
        //System. out. println("Enter string to reverse:");
        //Scanner read = new Scanner(System. in);
        //str = read.nextLine();
        //str = "124";
        String reverse = "";
        for(int i = str. length() - 1; i >= 0; i--) {
            reverse = reverse + str. charAt(i);
           }
        //System.out.println(reverse);
        return reverse;
    }

    //
}









