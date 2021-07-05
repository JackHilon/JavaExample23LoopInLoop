
package javaexample23loopinloop;

import java.util.Scanner;


public class JavaExample23LoopInLoop {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int counterFor=0, counterWhile=0;
        int j=1;
        
        System.out.print("Enter counter of For-Loop: ");
        counterFor=GetInteger(input);
        System.out.print("Enter counter of While-Loop: ");
        counterWhile=GetInteger(input);
        
        System.out.println("Here we will begin....");
        while(j<=counterWhile)
        {
            System.out.println("round #"+j);
            for (int i = 1; i <= counterFor; i++) {
                System.out.println("Hi here! This program is running: "+i);
            }
            j++;
        }// end while-loop
        
        input.close();
        
    }// end main()
    
    private static int GetInteger(Scanner in)
    {
        int res=0;
        try{
            res=in.nextInt();
            return res;
        }catch(Exception e)
        {
            in.nextLine();
            System.out.println(e.toString());
            return GetInteger(in);
        }// end catch
    }// end GetInteger()
}
