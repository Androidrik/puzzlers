package chapter_2_expressive_puzzlers;

public class ItIsElementary {

	public static void main(String[] args) 
	{
		//fout(niet echt) omdat de laatste 1 eigenlijk een l is en dus is het een long
		System.out.println(12345+5432l);
		//beter(leesbaarder)
		System.out.println(12345+5432L);

	}

}
