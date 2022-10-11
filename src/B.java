public class B {
   static void b(int x){
        System.out.println("Argument = "+x);
    }
   static void b(int y,int z){
        System.out.println("Argument = "+y+" & "+z);
    }

    public static void main(String[] args) {
        b(4,6);
        b(8);
    }
}
