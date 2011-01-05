package chapter_2_expressive_puzzlers;

import java.math.BigDecimal;

public class TimeForAChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//fout omdat 1.10 niet uitgedrukt kan worden in binaire decimalen
		//System.out.println(2.00-1.10);
		System.out.println(200-110 + " cents.");
		//of
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}

}
