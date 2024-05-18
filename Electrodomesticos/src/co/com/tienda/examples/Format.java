package co.com.tienda.examples;

import java.util.Date;
import java.util.Locale;

import static java.lang.Math.PI;

public class Format {
    public static void main(String[] args) {
        System.out.printf("|%s|", "hola");
        System.out.printf("|%20s|", "hola");
        System.out.printf("|%-5s|", "hola");
        System.out.printf("|%2.1s|", "hola");
        System.out.printf("%nInicio%nlinea 1%nFin%n");


        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false); //String.ValueOf()
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "cualquier texto");


        System.out.printf("|%C|%n", 'h');
        System.out.printf("|%d|%n", 50_000L);
        System.out.printf("|%,d|%n", 50_000L);
        System.out.printf(Locale.CANADA,"|%,d|%n", 50_000L);
        System.out.printf(Locale.ITALY,"|%,d|%n", 50_000L);


        System.out.printf("|%f|%n", PI);
        System.out.printf("|%5.2f|%n", PI);
        System.out.printf("|%5.2e|%n", PI);


        Date date = new Date();
        System.out.printf("full %tT%nhours %tH: minutes %tM: seconds %tS%n", date, date, date, date);
        System.out.printf("full %1$tT%nhours %1$tH: minutes %1$tM: seconds %1$tS%n", date);
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$td-%1$tm-%1$ty %n", date);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", new Object[]{"1", "2", "3", "4", "5", "6", "7", "8","9", "10"});
    }
}
