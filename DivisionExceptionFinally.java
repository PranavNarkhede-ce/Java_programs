import java.util.*;

class DivisionExceptionFinally
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int  no1= 0 , no2 = 0 , ans = 0;

        System.out.println("Enter first number :");
        no1 = sobj.nextInt();

        System.out.println("Enter Second number :");
        no2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            ans = no1 / no2 ;
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch block");
            System.out.println("Exception occured:" +aobj);

        }
        catch(Exception eobj)
        {
            System.out.println("Inside generic catch :" +eobj);
        }
        finally
        {
            System.out.println("Inside finallly block");
            sobj = null ;                                   // resource deallocation
        }

        System.out.println("Division is : " + ans);
    }
}