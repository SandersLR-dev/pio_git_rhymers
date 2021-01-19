package edu.kis.vh.nursery;

/**
 * Domyslny Rhymer - Posiada podstawowe klasy,które beda dziedziczone przez klasy wewnetrzne
 */

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int VALUE = -1;
	private static final int SIZEIFFULL = SIZE-1;//uzaleznic 11 od 12
	private int[] numbers = new int[SIZE];

	/**
	 * @return total - zwraca ilosc elementow
	 */
	public int getTotal() {
		return total;
	}

	private int total = VALUE;


	/**
	 * @param in - dodaje element do tablicy
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return - zwraca informacje true gdy tablica jest pusta
	 */
	public boolean callCheck() {
		return total == VALUE;
	}

	/**
	 * @return - zwraca true gdy tablica jest pelna
	 */
	public boolean isFull() {
		return total == SIZEIFFULL;
	}

	/**
	 * @return -zwraca wartosc ostatniego elementu tablicy
	 */
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	/**
	 * @return - zwraca wartosc ostatniego elementu i usuwaa go
	 */
	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}


}
