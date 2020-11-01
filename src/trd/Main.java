package trd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
            Scanner scanner=new Scanner((System.in));
        System.out.println("Array size:\n");
            int a[]=new int[scanner.nextInt()];
        System.out.println("insert array indexes:\n");
            for(int i=0;i<a.length;i++)
                a[i]=scanner.nextInt();
            Summation summation=new Summation(a,0,a.length);
        System.out.println("Thread[] size:\n");
            Thread[]t=new Thread[scanner.nextInt()];
        System.out.println("the summation is:\n");
        System.out.println(Summation.parallelSum(a,t.length));
        }
    }

