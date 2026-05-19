// practice code of constructor in java 

class Myconstructor 
{
    public static void main(String []A)
    {
        int ans = 0;
        int ans1 = 0;

        System.out.println("inside main function");

        Demo dobj = new Demo();
        Demo dobj1 = new Demo(33,34);
        Demo dobj2 = new Demo(10,11); 
       
        ans =dobj1.calculate();
        ans1 = dobj2.calculate();
        
        System.out.println("Addition is :"+ans );
        System.out.println("Addition is :"+ans1 );

    }
}

class Demo
{
    public int i ;
    public int j;

    public Demo()
    {
        i =0;
        j = 0;
        
        System.out.println("inside default constructor ");
    }

    public Demo(int no1 , int no2)
    {
        this.i = no1;
        this.j = no2;
        System.out.println("inside parameterised constructor");
        System.out.println("value of i :"+i +"   value of j :"+j);

    }

    public int calculate()
    {
        return  i +j;
       
    }
}