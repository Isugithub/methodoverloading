public class Anything {
   static void text(){
int a = 4;
int b = 7;
     int c = a+b;
       System.out.println(c);
    }
  static int text(int p){
p = 3+5+7+8;
return p;
    }
  static   void text(int q, String r){
q= 13;
r = "Millions";
      System.out.println(q+r);
    }

    public static void main(String[] args) {
Anything anything = new Anything();
text();
text(7,"isu");
        System.out.println(text(2));
    }
}
