class Fibonacci
{
    public static void main(String args[])
    {
        int intNumero1=0;
        int intNumero2=1;
        int intX = 0;

        System.out.println("S e r i e   d e   F i b o n a c c i");
        System.out.println(intNumero1);
        System.out.println(intNumero2);

        do
        {
            int intSuma = intNumero1 + intNumero2;
            System.out.println(intSuma);

            intNumero1 = intNumero2;
            intNumero2 = intSuma;

            intX ++;
        } while(intX <= 10);
    }
}