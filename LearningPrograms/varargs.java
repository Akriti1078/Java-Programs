package LearningPrograms;

public class varargs {
    static int add(int...arr){
        int result = 0;
        for (int a :arr){
            result= result +a ;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(5, 6, 7));
        System.out.println(add(7, 8, 9));
    }
}
