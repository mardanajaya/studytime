package java8;

public class runnabledemo {
   public static void main(String[] args) {
	   Thread mythread = new Thread(new Runnable() {
		   public void run() {
			   System.out.println("runnabale thread");
		   }
	   });
	   mythread.run();
	   Thread myFunctionallambdathread = new Thread(()-> System.out.println("runnabale Functional thread"));
	   myFunctionallambdathread.run();
   }
}
