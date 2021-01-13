package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int VALUE = -1;
	private static final int SIZEIFFULL = SIZE-1;//uzaleznic 11 od 12
	private int[] numbers = new int[SIZE];

	public int getTotal() {
		return total;
	}

	public int total = VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == VALUE;
	}

	public boolean isFull() {
		return total == SIZEIFFULL;
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
