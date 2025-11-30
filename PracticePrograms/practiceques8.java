package PracticePrograms;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class practiceques8 {
    public static void main(String[] args) {
        //problem 1
        Employee akriti = new Employee();
        akriti.setName("code with ak");
        akriti.salary = 400;
        System.out.println(akriti.getSalary());
        System.out.println(akriti.getName());
    }
}
