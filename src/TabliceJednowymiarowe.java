//Utwórz tablicę jednowymiarową o rozmiarze pobranym od użytkownika. Tablicę
//        wypełniamy w następujący sposób: jeżeli indeks elementu jest podzielny przez 3
//        wartość elementu pod tym indeksem losujemy z przedziału <101,203>, jeżeli indeks
//        elementu przy dzieleniu przez 3 daje resztę 1 wartość elementu pod tym indeksem
//        wyznaczamy jako dwukrotną wartość elementu na poprzedniej pozycji. Pozostałe
//        elementy mają wartość zero. Dla tak wypełnionej tablicy wyznacz średnią
//        arytmetyczną tych elementów, których cyfra jedności jest większa od cyfry setek.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TabliceJednowymiarowe {
    public void deklaracjaRozmiaruTablicy() {
        int rozmiartablicy;
        Scanner skan1 = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        rozmiartablicy = skan1.nextInt();
        int counter = 0;
        int[] newArray = new int[rozmiartablicy];

        int[] tablica = new int[rozmiartablicy];
        for (int i = 0; i < tablica.length; i++) {  // dla elementow tablicy o indeksie zero i dla elementow mniejszych od dlugosci tablicy
            System.out.println("Podaj kolejna wartosc");

            int wartosc = skan1.nextInt();
            tablica[i] = wartosc; // wpisujac w kwadratowym nawiasie liczbe otrzymujemy wartosc pod podanym indexem
            //System.out.println(Arrays.toString(tablica));

            if (i % 3 == 0) {
                int lowerRange = 101;
                int upperRange = 203;
                int range = upperRange - lowerRange + lowerRange;
                int random = (int) (Math.random() * range) + lowerRange;
                // System.out.println(random);

                tablica[i] = random; // pieknie dziala
                // fajnie fajnie jest sie bawic tymi tablicami
            } else if (i % 3 == 1) {
                tablica[i] = tablica[i - 1] * 2;
            }
            System.out.println(Arrays.toString(tablica));

            if ((((tablica[i] / 1) % 10) > ((tablica[i] / 100) % 10))) {
                System.out.println(" Value under index : " + tablica[i] + " Matches the condition");
                newArray[i] = tablica[i];
//                System.out.println(Arrays.toString(newArray)+" New Array ");
//}
                System.out.println(Arrays.toString(newArray) + " New Array "); // no i działa kurwa
                System.out.println("Srednia Arytmetyczna wyrazow to : " + Arrays.stream(newArray).sum() / tablica.length);
            }
        }
    }
}







//                newArray[counter2]=tablica[i];
//                System.out.println(counter2+"Conter");







//                System.out.println(Arrays.toString(newArray));
//                for (i = 0; (((tablica[i] / 1) % 10) > ((tablica[i] / 100) % 10)); ) {
//                    int[] newArray = new int[tablica[i]];
////                    System.out.println(Arrays.stream(newArray));
//                    System.out.println(Arrays.toString(newArray));
//                    break;


            // TODO " Zebrac elementy spelniajace warunek i policzyc srednia arytmetyczna.


//    public static void main(String[] args) {
//        System.out.println("Podaj rozmiar tablicy");
//        Scanner skan1 = new Scanner(System.in);
//        int rozmiarTablicy = skan1.nextInt();
//
//        Integer[] tablica = new Integer[rozmiarTablicy]; // Uwagi : Czesto zdarza sie ze skrypt dziala nie od razu ale po kilku probach sklecenia go do kupy
//       // System.out.println(tablica.length);
//
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println("Podaj kolejna wartosc");
//            int wartosc = skan1.nextInt();
//            tablica[i] = wartosc;
//
//
//
//
//        }
//    }

