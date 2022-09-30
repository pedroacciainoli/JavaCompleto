package pedrodev.live.maratonajava.javacore.Oexception.runtime.test;


public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
      try{
          divisible(1,0);
      }catch(RuntimeException e){
          e.printStackTrace();
      }
        System.out.println("Final code");
    }
    private static int divisible(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Invalid Argument =  " + b);
        }
//        try {
//            return a/b;
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
       return a/b;
    }
}
