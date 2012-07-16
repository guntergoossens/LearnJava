public class StaticFun {
  static void incr() {
    StaticTest.i++;
  }
  public static void main (String [] args){
    StaticFun.incr();
    StaticFun.incr();
    StaticFun.incr();
    System.out.println(StaticTest.i);
  }
}
