
    class Demo {
         public int x, y , z;

        // Default constructor
        public Demo() 
        {
            this(10);   // calls parameterized constructor
            System.out.println("Default constructor");
        }

        // One parameter constructor
        public Demo(int a)
        {
            this(a, 20);   // calls another constructor
            System.out.println("One parameter constructor");
            System.out.println(a);

        }

        // Two parameter constructor
        public Demo(int a, int b) 
        {
            this(a , b , 30);
            x = a;
            y = b;
            System.out.println("Two parameter constructor");
            System.out.println(a);
            System.out.println(b);
        }

        public Demo(int a , int b , int c )
        {
            x = a;
            y = b;
            z = c ;
            System.out.println("Three parameter constructor");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
}

 class ThisConstructorCall  {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
