import java.util.Scanner;

public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        int int_array[] = new int[10];
        int sum = 0;
        int average = 0;
        int limit = 5;
        for (int i=0; i < int_array.length; i++)
        {
            int_array[i] = i;
        }

        for (int i=0; i < int_array.length; i++)
        {
            System.out.print(int_array[i] + ", ");
        }

        System.out.println(" ");

        for (int i=(int_array.length-1); i >= 0; i--)
        {
            System.out.print(int_array[i] + ", ");
        }

        System.out.println(" ");

        for (int i=0; i < int_array.length; i++)
        {
            sum += int_array[i];
            if (i == (int_array.length-1))
            {
                System.out.println("Sum of integers: " + sum);
            }
        }

        for (int i=0; i < int_array.length; i++)
        {
            if (limit < int_array[i])
            {
                System.out.print(int_array[i] + ", ");
            }
        }

        average = sum / int_array.length;
        System.out.println(" ");

        for (int i=0; i < int_array.length; i++)
        {
            if (average < int_array[i])
            {
                System.out.print(int_array[i] + ", ");
            }
        }
    }
}
