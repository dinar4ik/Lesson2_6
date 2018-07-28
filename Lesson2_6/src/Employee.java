public class Employee {
    int id;
    int year;
    String name;
    Employee (int i, int y, String n){
        id =  i;
        year = y;
        name = n;
    }

    void display(){
        System.out.println(id+" "+year+" "+name);
    }
}
    class workers {
    public static void main(String[] args) {
        Employee e = new Employee(15,1955,"Dinara");
        e.display();
    }
}