package LearningPrograms;

class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}
    public class getter_setter {
        public static void main(String[] args) {

            MyEmployee Akriti = new MyEmployee();

            // Akriti.id = 45;        // ❌ error: id has private access
            // Akriti.name = "CodeWithAkriti"; // ❌ error: name has private access

            Akriti.setName("CodeWithAkriti");
            System.out.println(Akriti.getName());
        }
    }


