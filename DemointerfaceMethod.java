interface circle 
{
    // characteristics   (public static final by default)
    float pi = 3.14f ;              

    // Behaviours     ( public abstract )
    float area ( float radius );
    float circumfarance( float radius );
}

class Marvellous implements circle 
{
    // error due to missing body of area and circumfarance 
}

class DemointerfaceMethod 
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}