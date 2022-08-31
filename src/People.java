public class People {

    private String age;
    private double height;
    private double first_name;
    private double last_name;

    public People(String a, double h, double l){
        age = a;
        height = h;
        last_name = l;
    }

    public String getAge(){return age;}

    public double getHeight(){return height;}

    public double getFirst_name(){return first_name;}

    public double getLast_name(){return last_name;}

}
