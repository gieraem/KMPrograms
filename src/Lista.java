import java.util.*;
import java.util.LinkedList;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Lista {
    public void wprowadzanieLiczb() {
        System.out.println("Podaj ciag liczb ");
        Scanner skan1 = new Scanner(System.in);
        LinkedList<Double> list = new LinkedList<Double>();
        LinkedList<Double> list2 = new LinkedList<Double>();

            while (skan1.hasNextDouble()) {
                list.add(skan1.nextDouble());

                list.add(skan1.nextDouble());
                int licznik = 0;
                int licznik2 = 1;
                var liczba1 = list.get(licznik);
                var liczba2 = list.get(licznik2);
                int iloscCyfr = liczba1.toString().length();


                do {
                    list.add(skan1.nextDouble());
                    licznik++;
                    licznik2++;
                    liczba1 = list.get(licznik);
                    liczba2 = list.get(licznik2);

                } while (liczba2 < liczba1);



                List<Double> listaElementowZparzystaLiczbaZnakow = list.stream()
                        .filter(s -> s.longValue() % 2 == 0)
                        .collect(Collectors.toList());



                int liczbaWprowadzonychLiczb = listaElementowZparzystaLiczbaZnakow.size();


                ;
                int licznik3 = 0;
                do {
                    var valueof = list.get(licznik3);
                    int dlugosc = valueof.toString().length();


                    if (!(dlugosc % 2 == 0)) {
                        list2.add(valueof);
                        licznik3++;

                    } else {
                        licznik3++;

                    }
                } while ((licznik3 < liczbaWprowadzonychLiczb));


                double sum2=0;
                for (double i : list2) {
                    sum2 += i;
                }
                    System.out.println(list2);
                int srednia3 = Math.floorDiv((int) sum2, list2.size());

                System.out.println("Srednia liczb z nieparzysta liczba cyfr to : " + srednia3);





                //TODO literacja elementow i dodawanie tych z parzysta liczba
                //TODO jakie jeszcze funkcje ma java
                // TODO praktyka duzo uczy. otworz sie na nowosci


                break;


            }
        }
    }










