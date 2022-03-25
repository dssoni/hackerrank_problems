package hackerrank_problems;

import java.math.BigInteger;

class Forloop {
	public static void main(String[] args) {
		int[] allInputs = new int[] { 10000, 50000, 100000, 500000, 1000000 };
		for (int i = 0; i < allInputs.length; i++) {
			BigInteger number = BigInteger.valueOf(allInputs[i]);
			BigInteger result = BigInteger.valueOf(1);
			long before = System.currentTimeMillis();
			for (int j = 1; j <= allInputs[i]; j++) {
				result = result.multiply(BigInteger.valueOf(j));
			}
			long after = System.currentTimeMillis();
			System.out.println("Elapsed Time: " + (after - before));
		}
	}
}