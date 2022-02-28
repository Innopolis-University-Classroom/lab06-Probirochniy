package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter();
        System.out.println("Avaliable currencies: USD, RUB, EUR, JPY, CAD, AUD\n");
        double sum1, sum2;
        String firstcur, secondcur;
        Scanner scan = new Scanner(System.in);
        int i = 1;

        System.out.println("Input first currency: ");
        firstcur = scan.nextLine();
        System.out.println("Input first currency: ");
        secondcur = scan.nextLine();
        System.out.println("Input first amount: ");
        sum1 = scan.nextDouble();
        while (i > 0) {
            sum2 = converter.convert(sum1, firstcur, secondcur);
            System.out.println("\nResult: " + sum2+"\n");

        System.out.println("Next action:\n 1 - Swap first currency\n 2 - Swap second currency\n 3 - Change the sum\n 4 - End session");
        int k;
        k = scan.nextInt();
        if (k == 3) {
            System.out.println("Input new sum: ");
            sum1 = scan.nextDouble();
        }
        if(k == 1){
            System.out.println("Input first currency: ");
            firstcur = scan.nextLine();
        }
        if(k == 2){
            System.out.println("Input second currency: ");
            secondcur = scan.nextLine();
        }
        if(k == 4){
            i = 0;
        }

    }
        System.out.println("End of session. Bye!");
    }

}
