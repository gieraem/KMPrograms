import java.util.Scanner;

// Pobieraj od użytkownika trzy liczby a, b, c typu całkowitego, które są jednocześnie
// liczbami pierwszymi mniejszymi od 15 i stanowią ciąg rosnący, czyli zachodzi warunek
// a < b < c. Następnie wyznacz odchylenie standardowe tak pozyskanych liczb.

public class Ciag {

    static int getNumber(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    // Liczba pierwsza to taka ktora dzieli sie TYLKO przez siebie i 1
    // Nalezy sprawdzic czy nie dzieli sie przez cos innego niz 1 i ta liczba i wtedy jest pierwsza
    // Rozpatrzmy dzielniki liczby 12: 1, 2, 3, 4, 6, 12
    // Rozpatrzmy pierwiastek z liczby 12 - jest on liczba z przedzialu (3, 4)
    // Pierwiastek z liczby 12 dzieli dzielniki liczby 12 na dwie grupy:
    // Grupa 1 --> 1, 2, 3 ( dzielnki mniejsze od pierwiastka z 12 )
    // Grupa 2 -> 4, 6, 12 ( dzielniki wieksze od pierwiastka z 12 )
    // Dzielniki z grupa 2 to wielokrotrnosci dzielnikow z grupa 1
    // Jezeli nie ma dzielnikow w grupa 1 to nie ma dzielnikow w grupa 2
    // W takim razie zeby sprawdzic czy liczba jest pierwsza musisz zbadac czy nie ma ona
    // dzielnikow w przedziale <2, sqrt z liczby>

    // Dokumentowanie metody poprzez napisanie nad nia /** i wcisniecie enter

    /**
     * TUTAJ PO ANGIELSKU WPISUJESZ PRZEZNACZENIE METODY
     * @param number @param oznacza ze opisujesz kolejny argument metody
     * @return po @return piszesz co zwraca Twoja metoda
     */




    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        var sq = Math.sqrt(number);
        for (int i = 2; i <= sq; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Pozyskiwanie konkretnej cyfry z liczby
    /*
        123

        Jednosci        -> (123 / 1) % 10       --> (123 / 10 ^ 0) % 10
        Dziesiatki      -> (123 / 10) % 10      --> (123 / 10 ^ 1) % 10
        Setki           -> (123 / 100) % 10     --> (123 / 10 ^ 2) % 10
        Mozesz podac ogolny wzor na cyfre z liczby:
        (LICZBA / 10 ^ POZYCJA_CYFRY) % 10
        POZYCJA_CYFRY to 0 dla cyfry jednosci, 1 dla cyfry dziesiatek, ...
    */
    static int getNthDigit(int number, int position) {
        int numberAbs = Math.abs(number); // Eliminujesz ryzyko podania liczby ujemnej

        // Nalezy sprawdzic czy podano prawidlowe argumenty
        // Zostalo nam do zbadania juz tylko position
        // Position musi miec wartosc z przedzialu od 0 do ilosc cyfr w liczbie
        int numberLength = ("" + numberAbs).length();
        if (position < 0 || position >= numberLength) {
            throw new IllegalArgumentException("Position is out of range");
        }
        // (LICZBA / 10 ^ POZYCJA_CYFRY) % 10
        // Math.pow zwraca nam wynik typu double
        // Nas interesuje dzielenie calkowitoliczbowe
        // Musze rzutowac wynik Math.pow na int
        return (number / (int)Math.pow(10, position)) % 10; // ==> rzutowanie
    }

    static boolean shouldRepeat(int number1, int number2, int number3) {
        return number1 >= number2 ||
               number2 >= number3 ||
               number1 >= 15 ||
               !isPrime(number1) ||
               !isPrime(number2) ||
               !isPrime(number3);
    }

    static double standardDeviation(int number1, int number2, int number3) {
        var avg = (number1 + number2 + number3) / 3.0;
        return Math.sqrt(Math.pow(number1 - avg, 2) + Math.pow(number1 - avg, 2) + Math.pow(number1 - avg, 2) / 3);
    }

    public static void main(String[] args) {

        System.out.println(getNthDigit(123, 0));
        System.out.println(getNthDigit(123, 1));
        System.out.println(getNthDigit(123, 2));

        // TWOJE ROZWIAZANIE

        /*
        float liczba1;
        float liczba2;
        float liczba3;
        Scanner skan3 = new Scanner(System.in);

        do {
            System.out.println("Wprowadz liczbe pierwsza  mniejsza od 15 ");
            liczba1=skan3.nextFloat();
            liczba2=skan3.nextFloat();
            liczba3=skan3.nextFloat();

        } while (!(liczba1<liczba2 && liczba2<liczba3 ));
        if (((liczba1==2)||(!(liczba1%2==0)))&&(!(liczba2%2==0))&&(!(liczba3%2==0))){
        System.out.println("Spelniono warunek ciagu rosnacego");}
        else ciagLiczbPierwszych();
        float srednia = ((liczba1+liczba2+liczba3)/3);
        System.out.println("Srednia to " + srednia);

        System.out.println("Odhylenie standardowe z populacji  to : " + (Math.pow((liczba1-srednia),2)+Math.pow((liczba2-srednia),2)+Math.pow((liczba3-srednia),2))/3);
        */

        int number1, number2, number3;
        do {
            number1 = getNumber("Enter number 1:");
            number2 = getNumber("Enter number 2:");
            number3 = getNumber("Enter number 3:");
        } while (shouldRepeat(number1, number2, number3));

        System.out.println("Stand. Dev. = " + standardDeviation(number1, number2, number3));

        // TODO Masz dzielic na metody !!!
        // Wejdz tutaj: https://whereby.com/km-programs-indywidualne


        /*if (((number1 == 2) || (!(number1 % 2 == 0))) && (!(number3 % 2 == 0)) && (!(number2 % 2 == 0))) {
            System.out.println("Spelniono warunek ciagu rosnacego");
        } else ciagLiczbPierwszych();
        float srednia = ((number1 + number3 + number2) / 3);
        System.out.println("Srednia to " + srednia);

        System.out.println("Odhylenie standardowe z populacji  to : " + (Math.pow((number1 - srednia), 2) + Math.pow((number3 - srednia), 2) + Math.pow((number2 - srednia), 2)) / 3);*/

    }
}

/*
    1. Podzial kodu na metody - przemuyslane metody - rozdzielasz poszczegolne akcje do osobnych metod

    2. Dbalosc o nazewnictwo ( poprawne nazwy po angielski zgodne z camel case ) ale rowniez kosmetyke kodu czyli odstepy pomiedzy np przecinkami

    3. Stosowanie odpowiednich typow czyli np zamiast float uzywaj double

    4. Skracanie kodu, tak zeby zachowac jego przejrzystosc, czyli masz zmienne, ktore piszesz tak:
       double a;
       double b;
       double c;
       A mozesz zapisac tak:
       double a, b, c;

    5. Stosowanie PRAWIDLPWYCH algoprytmow czyli np algorytm na wyznaczanie liczby pierwszej wg teorii a nie
       "ze tak mi sie wydaje"

    6. Dokumentowanie kodu + dokumentowanie metod

    7. Kiedy piszesz metode sprawdzasz czy argumenty sa prawidlowe o ile jest to konieczne
*/



