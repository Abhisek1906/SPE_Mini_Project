package Calculator;

import java.util.Calendar;
import java.util.Scanner;

public class Calculator {

    public Calculator(){

    }

    public long add(long a,long b){
        return a+b;
    }

    public long sub(long a,long b)
    {
        return a-b;
    }

    public long mul(long a ,long b){
        return a*b;
    }
    public long div(long a,long b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.sub(a,b));
        System.out.println(calculator.mul(a,b));
        System.out.println(calculator.div(a,b));
    }
}
