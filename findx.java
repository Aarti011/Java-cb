public class Main{
    static void func1(){
          System.out.println("hello1");
          func2();
    }
    static void func2(){
          System.out.println("hello2");
          func3();
    }
    static void func3(){
          System.out.println("hello3");
    }  
  
    public static void main(String args[]){
      System.out.println("Started");
      func1();
      System.out.println("Over");  
  }
}
