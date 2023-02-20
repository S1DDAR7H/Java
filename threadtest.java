/*
Write a Java program that implements a multi-threaded program which has three threads.
First thread generates a random integer every 1 second. If the value is even, 
second thread computes the square of the number and prints. 
If the value is odd the third thread will print the value of cube of the number.
 */ 
import java.util.Random;

 public class threadtest extends Thread{
    public static void main(String args[]) {
        Random random = new Random();
        Thread t1 = new Thread(() -> {
            while(true){
                int num = random.nextInt(100);
                System.out.println("Generated Number : "+num);

                if(num % 2 == 0){
                    Thread t2 = new Thread(() -> {
                        System.out.println(num * num);
                    });
                    t2.start();
                }

                else{
                    Thread t3 = new Thread(() -> {
                        System.out.println(num * num * num);
                    });
                    t3.start();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }
 }