package chapter_2_expressive_puzzlers;

public class LongDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//fout omdat het bovenste product een int overflow geeft(pas na de vermenigvuldiging wordt er gepromote naar een long)
//		final long MICROS_PER_DAY = 24  * 60 * 60 * 1000 * 1000;
//		final long MILLIS_PER_DAY = 24  * 60 * 60 * 1000;
		//goed omdat de eerste factor gelijk een long is waardoor de verdere vermeningvuldigingen ook long-vermenigv. worden
		final long MICROS_PER_DAY = 24L  * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24L  * 60 * 60 * 1000;

		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		

	}

}
