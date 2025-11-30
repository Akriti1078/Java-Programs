package PracticePrograms;

import java.util.Scanner;

public class practiceset2 {
    public static void main(String[] args) {

//example2
      /*  byte m1, m2, m3;

        Scanner sc = new Scanner(System.in);
        System.out.println("marks sub 1");
        m1 = sc.nextByte();
        System.out.println("marks sub 2");
        m2 = sc.nextByte();
        System.out.println("marks sub 3");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;

        System.out.println("your overall percentage is:" + avg);

        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("you have passed");

        } else {
            System.out.println("you have failed");
        }

    }

}










       /* if(total per> 40){
            System.out.println("you have passed");
        }
            else{
            System.out.println("you have failed");
        }

        }

    }
}

        */

        //example 4
        Scanner sc = new Scanner(System.in);
       /* System.out.println("enter the number 1-7");

         int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no day");
        }
    }
}


        */

        System.out.println("enter the year");
        int a = sc.nextInt();
        int years=a%4;

        if( years==0 ){
            System.out.println("leap year");
        }
            else {
            System.out.println("not leap year");
        }
        }
        }



