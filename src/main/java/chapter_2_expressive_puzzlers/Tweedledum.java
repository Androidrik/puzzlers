package chapter_2_expressive_puzzlers;

public class Tweedledum {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//is fout omdat een simple assignment operator NIET impliciet een cast doet
		byte x = 0;
		char i = 0;
		x += i;
		//x = x + i;
		
		//x =  x + (byte)i;
		
	}

}
