public class TwelveInts
{
    public static void main(String[] args)
    {
        int int_array[] = new int[12];
        for (int i=0; i < int_array.length; i++)
        {
            int_array[i] = i;
        }

        for (int i=0; i < int_array.length; i++)
        {
            System.out.print(int_array[i] + ", ");
        }

        System.out.println(" ");

        for (int i=11; i >= 0; i--)
        {
            System.out.print(int_array[i] + ", ");
        }
    }
}
