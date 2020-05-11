package hackerrank_problems;

public class TaumBday {
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		long bl = b, wl = w, bcl = bc, wcl = wc, zl = z;
		long actualCost = (bl * bcl) + (wl * wcl);
		if (bcl == wcl) {
			return actualCost;
		} else if (bcl < wcl) {
			if (actualCost <= (((bl + wl) * bcl) + (wl * zl))) {
				return actualCost;
			} else {
				return (((bl + wl) * bcl) + (wl * zl));
			}

		} else {
			if (actualCost <= (((bl + wl) * wcl) + (bl * zl))) {
				return actualCost;
			} else {
				return (((bl + wl) * wcl) + (bl * zl));
			}
		}

	}

	public static void main(String args[]) {
		System.out.println(taumBday(94419985, 25938418, 969098, 809449, 472449));
	}
}
