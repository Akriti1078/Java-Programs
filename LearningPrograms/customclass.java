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
        employee harry= new employee();
        employee akriti = new employee();

        //setting attributes
        harry.id= 12;
        harry.name="code with harry";
        akriti.id=21;
        akriti.name="akriti pandey";




        //printing the attributes
        harry.printdetails();
        akriti.printdetails();


    }
}
