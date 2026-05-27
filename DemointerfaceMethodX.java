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
    public float area ( float radius )
    {
        return circle.pi * radius * radius  ;
    }

    public float circumfarance( float radius )
    {
        return 2 * circle.pi * radius ;
    }
}

class DemointerfaceMethodX
{
    public static void main(String A[])
    {
       // circle cobj = new circle();     ----- not allowed 
       

        Marvellous mobj = new Marvellous();

        float ret = 0.0f ; 

        ret = mobj.area(10.5f);
        System.out.println("Area is :"+ ret );

        ret = mobj.circumfarance(10.5f);
        System.out.println("Circumfarance is :"+ ret );

    }
}