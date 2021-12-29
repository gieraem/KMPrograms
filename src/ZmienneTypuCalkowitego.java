import java.util.Scanner;

public class ZmienneTypuCalkowitego {
    public void Ztp(){
    int zmiennaX;
    int zmiennaY;
    Scanner skan2 = new Scanner(System.in);

    do {
        System.out.println("Wprowadz Zmienna X ");
        zmiennaX=skan2.nextInt();
        System.out.println("Wprowadz Zmienna Y ");
        zmiennaY=skan2.nextInt();
    }while (!(zmiennaY % zmiennaX ==0));

        System.out.println(zmiennaX + " Zmienna  X ");
        System.out.println(zmiennaY + " Zmienna Y ");

}
}