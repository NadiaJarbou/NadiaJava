import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in tal 1 ");

        int tal1 = scanner.nextInt();

        System.out.print("Skriv in tal 2 ");
        int tal2 = scanner.nextInt();

        Calculator calc = new Calculator(tal1,tal2);

        System.out.println("Vad vill du gära?");
        System.out.println(" 1 Addera");
        System.out.println(" 2 Subtrahera");
        System.out.println(" 3 Multiplicera");
        System.out.println(" 4 Dividera");
        int choice = scanner.nextInt();
        if (choice == 1) System.out.println(calc.add());
        if (choice == 2) System.out.println(calc.sub());
        if (choice == 3) System.out.println(calc.mult());
        if (choice == 4) System.out.println(calc.div());

        scanner.close();
        */

        BankAccount account = new BankAccount(100);

       System.out.println("your amount is: "+ account.getAmount());

       Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter the new amount");
         double newamount = scanner.nextDouble();
         account.add(newamount);
        System.out.println("your new amount is: "+ account.getAmount());

        System.out.println( "Draw this amount");
        double drawamount = scanner.nextDouble();
        account.draw(drawamount);
        System.out.println("your new amount is: "+ account.getAmount());



        


    }

}