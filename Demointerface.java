interface circle 
{
    // characteristics 
    float pi = 3.14f ;              // public static final by default 

}

class Demointerface
{
    public static void main(String A[])
    {
        System.out.println(circle.pi);

        circle.pi = 7.12f ;                     // error due to final 
    }
}