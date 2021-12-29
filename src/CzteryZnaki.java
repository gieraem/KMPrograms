//Pobieraj od użytkownika osobno cztery znaki (zmienne typu char), dopóki nie utworzą
//        w kolejności, w której są pobierane jednego z wyrazów ABCD, BCAD, BADC.

import java.util.Arrays;
import java.util.Scanner;

public class CzteryZnaki {

    public boolean isExpression(String expression) {

        Scanner skan1 = new Scanner(System.in);
        String st1 = skan1.next();
        String st2 = skan1.next();
        String st3 = skan1.next();
        String[] tab1 = new String[]{st1,st2,st3};


        // Tablica posortowana rosnaco zebym mogl zastosowac algorytm wyszukiwania
        // binarnego ---> POCZYTAJ O NIM
        var expectedExpressions = new String[]{"ABCD", "BADC", "BCAD"};
        // metoda binarySearch jezeli w posortowanej tablicy wyszuka podany jako
        // drugi argument expression to zwroci indeks z tej tablicy pod ktorym wystapil
        // ten element, czyli jezeli bedzie indeks >= 0 to jest to dla Ciebie
        // informacja ze expression jest jednym z pozadanych napisow
        System.out.println(skan1);
        return Arrays.binarySearch(expectedExpressions, expression) >= 0;

    }



    }

