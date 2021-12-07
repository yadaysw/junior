package basics;

public class FactorialApp
{

	public static void main(String[] args)
	{
		for (long c = 0; c < 20; c++)
		{
			System.out.println("factorial(" + c + ") is " + fact(c));
		}
	}

	public static long fact(long num)
	{
		if (num == 0)
			return 1;
		return num * fact(num - 1);
	}

}
