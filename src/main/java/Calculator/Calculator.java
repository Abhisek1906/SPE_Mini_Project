package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    Logger logger= LogManager.getLogger(Calculator.class);
    public Calculator(){

    }

    public long add(long a,long b){
        logger.info("Inputs" + a + " " + b);
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
        //BasicConfigurator.configure();
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
