package LearningPrograms;

class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);

    }
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee Akriti= new employee();
        employee akriti = new employee();

        //setting attributes
        Akriti.id= 12;
        Akriti.name="code with Akriti";
        akriti.id=21;
        akriti.name="akriti pandey";




        //printing the attributes
        Akriti.printdetails();
        akriti.printdetails();


    }
}
