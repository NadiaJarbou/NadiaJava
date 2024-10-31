public class MyInteger {

    public static void main(String[] args) {

        int number = 5;
        int  nextNumber = 6;


       number = 5 + 3;

        System.out.println(number);
        System.out.println(nextNumber);



        //number = number + 3
        number +=3;
        System.out.println(number);
        //nextNumber = nextNumber - 2
        nextNumber -=2;
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("Now uppdetad to:  ");

// number +=1; number = number + 1;
      number++;
        System.out.println(number);

// number -=1; number = number - 1;
        nextNumber--;
        System.out.println(nextNumber);


    }


}
