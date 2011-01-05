package chapter_2_expressive_puzzlers;

public class DosEquis {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		//hier wordt 88 geprint omdat i een variable is van type int en 
		//dus is het resultaat een int en wordt de System.out.print(int) methode aan geroepen 
		//die X als Unicode character print
		System.out.println(false ? i : x);
		
		
	}

}
