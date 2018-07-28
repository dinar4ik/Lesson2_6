
    public class Rectangle {
        int length1;
        int length2;
        
        void insert(int l1, int l2){
            length1 = l1;
            length2 = l2;
        }
        void display(){
            int result = length1*length2;
            System.out.println("Area = "+result);
        }
    }
    class square{    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.insert(3, 5);
        r.display();
        
        

        }
    }

