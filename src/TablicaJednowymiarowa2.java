//Utwórz tablicę jednowymiarową o rozmiarze losowanym z przedziału <20, 40>.
//        Elementy tablicy to kolejne elementy ciągu opisanego wzorem xn = x0 + 2∙r∙i. Wartości
//        x0 oraz r są losowane z przedziału <1,5>, parametr i oznacza kolejny wyraz ciągu,
//        zaczynamy od i = 1 i to będzie pierwszy element tablicy. Oblicz sumę elementów
//        tablicy, które są podzielne przez 4.


import java.util.Arrays;
import java.util.Scanner;

public class TablicaJednowymiarowa2 {
    int lowerRange = 20;
    int upperRange = 40;
    int rangeOfArray = upperRange - lowerRange + lowerRange;


    int lowerRangeOfx0AndR = 1;
    int upperRangeOfx0AndR = 5;
    int range = upperRangeOfx0AndR - lowerRangeOfx0AndR + lowerRangeOfx0AndR;

    int x0 = (int) (Math.random() * range);
    int r = (int) (Math.random() * range);
    int rozmiarTablicy = (int) (Math.random() * rangeOfArray);
    int[] newArray = new int[rozmiarTablicy];
    int[] arrayOfValuesDivideableBy4 = new int[rozmiarTablicy];


    public void tablicaJednowymiarowa2() {


//        System.out.println(Arrays.toString(newArray));
        System.out.println(newArray.length + " Lenght of the array ");
    }

    public void defaultValuesOfEquasionDeclaration() {
        int lowerRangeOfFirstElement = 1;
        int upperRangeOfFirstElement = 5;


    }

    public void equasionAndFulfillingArrayWithValues() {
        for (int j = 0; j < 1; j++) {
            newArray[0] = 1;

        }
        for (int j = 1; j < newArray.length - 1; j++) {
            int lowerRangeOfx0AndR = 1;
            int upperRangeOfx0AndR = 5;
            int range = upperRangeOfx0AndR - lowerRangeOfx0AndR + lowerRangeOfx0AndR;
            int x0 = (int) (Math.random() * range);
            int r = (int) (Math.random() * range);
            int xn = (x0 + (2 * r) + newArray[j - 1]);
            newArray[j] = xn;
            newArray[j + 1] = xn;
//            System.out.println(" x0 Element of equasion " + x0);
//            System.out.println(" r Element of equasion " + r);
//            System.out.println(xn + "(xn)" + "= " + x0 + "(x0)" + "+" + " (2*r) " + " + " + newArray[j - 1] + "i");

            if (newArray[j] % 4 == 0 ) {
                arrayOfValuesDivideableBy4[j] = newArray[j];

            }


        }


        System.out.println( " Fulfilled Array " + Arrays.toString(newArray) );
        System.out.println(" Array of elements divideable by 4 " +Arrays.toString(arrayOfValuesDivideableBy4) );
        System.out.println(" Average value of elements divideable by 4 is : " + Arrays.stream(arrayOfValuesDivideableBy4).sum() / arrayOfValuesDivideableBy4.length);
        System.out.println( " RANGE TO :" + range );
    }
}