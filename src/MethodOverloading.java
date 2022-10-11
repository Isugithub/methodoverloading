public class MethodOverloading {
    static void display(int a, double b){
        System.out.println("Method 1 ");
    }
    static void display(int a, double b, double c){
        System.out.println("Method 2 ");
    }
    public static void main(String[] args) {
MethodOverloading methodOverloading = new MethodOverloading();
display(2,6.9);
display(3,5.8,9.879);
    }
}
