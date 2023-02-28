import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number (Non negative): ");

        int num = reader.nextInt();

        try
        {
            if (num < 0)
                throw new NegativeException("Number must be greater than zero.");

            System.out.printf("%d! --> ", num);

            for (int i = num; i > 1; i--)
            {
                System.out.printf("%d * ", i);
            }

            System.out.print("1");
        }
        catch (NegativeException except)
        {
            System.out.println(except.getMessage());
        }
        finally
        {
            reader.close();
        }
    }
}
