public class main
{
    public static void main (String[] args)
    {
        forSomething();
    }//end main method

    public static void forSomething()
    {
       final int bruh = 10;
       for (int i = 0; i <= bruh; i++)
       {
        for (int p = 0; p <= i; p++)
        {
            System.out.print("*");
        }
        System.out.println();
       }

        final int MAX_ROWS =10;
        for (int v = 1; v <= MAX_ROWS; v++)
        {
            for (int star = 1; star <=v; star++)
            {
                System.out.print("*");
            }//end inner loop
            System.out.println();
        }//end outer loop
    }//end method forSomething
}
