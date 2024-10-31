package Övning;
/*Skriv ut alla tal ifrån 1-100

Skriv ut alla jämna tal ifrån 1-100

Skriv ut alla fibonnacci-tal ifrån 1-100.
 Fibonnacci-tal är de två senaste talen adderat och börjar med 1, 1 som första två tal.
  Exempel: 1, 1, 2, 3, 5, 8, 13, 21…*/

public class övning4 {
    public static void main(String[] args) {

        int num = 1;
        while (num <=100){
            System.out.println(num + "");
            num = num +1;
        }
        int num2= 2;

        while (num2 <= 100){
            System.out.println(num2 + " ");
            num2+=2;
        }

        int first = 1;
        System.out.println(first + " ");

        int second = 1;

        while (second <= 100){
            System.out.println(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
