package LearningPrograms;

public class methods {
    static void sentence(){
        System.out.println("hello \n" + "ak");
    }
    static int varunkutta(int x,int y) {

        int z;
        if (x > y) {
            z = (x + y) * 5;
        } else {
            z = x + y;
        }
        return z;
    }
    public static void main(String[] args) {
        sentence();
        int a = 4;
        int b = 6;
        int c;
        c=varunkutta(a,b);
        System.out.println(c);
        int a1=7;
        int b1=2;
        int c1;
        c1=varunkutta(a1,b1);

        System.out.println(c1);



    }
}
