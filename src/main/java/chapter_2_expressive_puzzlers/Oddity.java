package chapter_2_expressive_puzzlers;

public class Oddity
{
	public static void main(String[] args)
	{
		System.out.println(isOdd(1));
		System.out.println(isOdd(-1));
		System.out.println(isOdd(0));
		System.out.println(isOdd(-0));

	}

	public static boolean isOdd(int i)
	{
		// fout
		// return i % 2 == 1;(een getal is oneven als getal modulo 2 rest 1 oplevert,
		// echter een negatief getal levert een negatieve rest op met de modulo operator van Java
		return i % 2 != 0;

	}

}
