package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TWELVE = 12;
	public static final int MINUSJEDEN = -1;
	public static final int JEDENASCIE = 11;
	private int[] numbers = new int[TWELVE];

	public int getTotal() {
		return total;
	}

	public int total = MINUSJEDEN;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == MINUSJEDEN;
	}

	public boolean isFull() {
		return total == JEDENASCIE;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
