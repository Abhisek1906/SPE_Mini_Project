package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Logger logger= LogManager.getLogger(Calculator.class);
    public Calculator(){



    }

//    public long add(long a,long b){
//        logger.info("Inputs" + a + " " + b);
//        return a+b;
//    }
//
//    public long sub(long a,long b)
//    {
//        return a-b;
//    }
//
//    public long mul(long a ,long b){
//        return a*b;
//    }
//    public long div(long a,long b){
//        return a/b;
//    }

    public  double squareRoot(int num)
    {
        logger.info("[Sqaure Root- NUMBER] : " + num);
        double ans =Math.sqrt((double) num);
        logger.info("[Square Root- ANSWER] : "  + ans);
        return ans;
    }
    
    public double fact(int num){
        logger.info("[Factorial- NUMBER] : " + num);
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        logger.info("[Factorial- ANSWER] : "  + factorial.doubleValue());
        return factorial.doubleValue();
    }

    public double naturalLog(double number1) {
        logger.info("[Natural Log- NUMBER] : " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[Natural Log- ANSWER] : "  + result);
        return result;
    }

    public double power(int number1, int number2) {
        logger.info("[POWER- NUMBER 1] : " + number1);
        logger.info("[POWER- NUMBER 2] : " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[POWER- ANSWER] : "  + result);
        return result;
    }
    public static void main(String[] args){
        //BasicConfigurator.configure();
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();
        do{
            System.out.println("Scientific Calculator using DevOps. \n Choose operation:");
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice){
                case 1: //Factorial
                        System.out.println("Enter a number : ");
                        int number=sc.nextInt();
                        System.out.println("Factorial of"+ number+ ":"+ calculator.fact(number));
                        System.out.println("\n");
                        break;

                case 2: // Square root
                        System.out.println("Enter a number:");
                        int num=sc.nextInt();
                        System.out.println("Square Root of"+num+":"+calculator.squareRoot(num));
                        System.out.println("\n");
                        break;

                case 3: //Power of two numbers
                        System.out.println("Enter the first number:");
                        int num1=sc.nextInt();
                        System.out.println("Enter the second number:");
                        int num2= sc.nextInt();
                        System.out.println(num1+ " raised to power "+num2+" is : " + calculator.power(num1,num2));
                        System.out.println("\n");
                        break;

                case 4: // Natural log of a number
                        System.out.println("Enter the number:");
                        double number1 = sc.nextDouble();
                        System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                        System.out.println("\n");
                        break;
                default:
                        System.out.println("Exiting...");
                        return;
            }

        }while(true);

    }
}
