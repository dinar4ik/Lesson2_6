public class Student {
    int id;
    String name;

    void insert(int i, String n){
        id = i;
        name = n;
    }

    void display (){
        System.out.println(id+" "+ name);
    }

}
   class TestStudent {
       public static void main(String[] args) {

           Student tanir = new Student();
           Student aigerim = new Student();
           Student dinara = new Student();

           tanir.insert(15,"Tanir");

           tanir.display();

//           tanir.id = 17;
//           tanir.name = "tanir";
//
//           aigerim.id = 20;
//           aigerim.name = "aigerim";
//
//           dinara.id = 17;
//           dinara.name = "dinara";
//
//           System.out.println(tanir.id+" "+tanir.name);
//           System.out.println(aigerim.id+ " "+aigerim.name);
//           System.out.println(dinara.id+" "+dinara.name);

       }
   }
