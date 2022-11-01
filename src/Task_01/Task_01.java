package Task_01;

//Kor kerulete es terulete a sugarbol


import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args){
        System.out.println("A kor atmeroje: ");
        Scanner scanner = new Scanner(System.in);
        float atmero = scanner.nextFloat();
        System.out.println("Kerulete: " + atmero * Math.PI + "\nTerulete: "+ (atmero / 2) * (atmero / 2) * Math.PI);
    }
}
