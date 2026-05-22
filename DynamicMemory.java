import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int size = 0 ;

        System.out.println("Enter number of elements "); 
        size = sobj.nextInt();

        // Dynamic memory allocation 
        float marks[] = new float[size];

        // use the memory 


        marks = null;
        System.gc();
    }
}