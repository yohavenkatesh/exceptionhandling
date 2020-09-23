/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
class MinimumBalanceException extends Exception
{
    public MinimumBalanceException(String s)
    {
        super(s);
    }
}
class atm1
{
    void check(double a) throws MinimumBalanceException
    {
        if(a>5000.0)
        {
            throw new MinimumBalanceException("Sorry Insufficient balance in your account.");
        }
        else
        {
            System.out.println("your amount will be generated soon.");
            System.out.println("...THANK YOU...");
        }
           
        
    }
}
public class Atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        atm1 o=new atm1();
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number to be withdrawn:");
        double a=obj.nextDouble();
        try
        {
            o.check(a);
        }
        catch(MinimumBalanceException e)
        {
            System.out.println(e.getMessage());
            System.out.println("The minimum balance is:"+"5000.00");
            
        }
    }
    
}
