class ArrayDemo
{
    public static void main(String A[])
    {                                               // ways to create
        int arr []= { 10,20,30,40};                 // 1

        int [] brr= { 10,20,30,40};                 // 2

        int crr [] = new int [4];                   // 3

        crr[0] = 10;
        crr[1] = 20;
        crr[2] = 30;
        crr[3] = 40;

        System.out.println(arr.length );
        
        System.out.println(brr.length );
        System.out.println(crr.length );
        

    }
}