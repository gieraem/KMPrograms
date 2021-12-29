// Dzieki instrukcji import mozesz wskazac ktore dodatkowe klasy i inne typy chcesz uzywac
// w ramach klasy w ktorej aktualnie jestesmy
import java.util.Arrays;
import java.util.Random;

// Co to jest FRAMEWORK?
// Framework to zestaw klas i interfejsow ktore pozwalaja realizowac pewien cel, zalozenie
// lub pewne zagadnienie -> np.

public class Zbior {
    static int countPositiveNumbers(int[] a, int rangeFrom, int rangeTo) {
        var counter = 0;
        for (int element : a) {
            if (element > 0 && element >= rangeFrom && element <= rangeTo) {
                ++counter;
            }
        }
        return counter;
    }

    static int countNegativeNumbers(int[] a) {
        var counter = 0;
        // foreach
        // co obieg pod e podstawiasz kolejny element z tablicy a
        for (int e : a) {
            if (e < 0) {
                ++counter;
            }
        }
        return counter;
    }

    //    Przeglądaj przedział liczbowy <a, b>. Liczby a i b są losowane z przedziału <-10, 20>
//    dopóki nie zajdzie warunek a < b. Następnie dokonaj analizy, ile liczb w wyznaczonym
//    przedziale jest ujemnych, a ile dodatnich i zwróć stosunek uzyskanych wartości –
//    stosunek ilości liczb ujemnych do dodatnich
    public void przedzialy() {

        int[] przedzialA = new int[30];
        int[] przedzialB = new int[30];

        // Mozesz ustawic sie w () i nacisnac ctrl + p
        // Mozesz tez trzymajac wcisniety lewy ctrl ustawic sie np na klasie Random i w nia kliknac
        Random random = new Random();
        int min = -10;
        int max = 20;
        //System.out.println(random.nextInt(max-min));
        for (int i = 0; i < przedzialA.length; i++) {
            przedzialA[i] = random.nextInt(max - min); // storing random integers in an array
            int int1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            przedzialA[1] = int1;
        }
        System.out.println(Arrays.toString(przedzialA)); // wrap with
        int losowaLiczbaZprzedzialuA = przedzialA[max - min - 1];
        System.out.println(losowaLiczbaZprzedzialuA);

        for (int j = 0; j < przedzialB.length; j++) {
            przedzialB[j] = random.nextInt(max - min); // storing random integers in an array
            int int1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            przedzialB[1] = int1;
        }
        System.out.println(Arrays.toString(przedzialB));
        int losowaLiczbaZprzedzialuB = przedzialB[max - min - 1];
        System.out.println(losowaLiczbaZprzedzialuB);
       if (losowaLiczbaZprzedzialuA<losowaLiczbaZprzedzialuB){
        System.out.println(Arrays.stream(przedzialA).sum());}
       else przedzialy();


//        if (losowaLiczbaZprzedzialuA < losowaLiczbaZprzedzialuB) {
//            for (int n : przedzialA) {
//                if (n > 0) {
//                    System.out.println(n);


    }
}











