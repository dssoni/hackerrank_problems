package hired;

import java.util.ArrayList;
import java.util.List;

public class GoogleStock {

	public static void main(String args[]) {
		List<Integer> stock = new ArrayList<Integer>();
		stock.add(5);
		stock.add(10);
		stock.add(4);
		stock.add(6);
//		stock.add(-5);
//		stock.add(1);

		System.out.println(profitCheck(stock));
	}

	public static int profitCheck(List<Integer> stocks) {
		int min = 0, max = 0, result = 0;
		boolean flag = false;

		if (stocks.size() < 2) {
			return 0;
		}

		int j = 0;
		for (j = 0; j + 1 < stocks.size(); j++) {
			if (stocks.get(j) < stocks.get(j + 1)) {
				min = stocks.get(j);
				max = stocks.get(j + 1);
				result = max - min;
				flag = true;
				break;
			}
		}

		if (!flag) {
			return 0;
		}

		for (int i = j + 1; i < stocks.size(); i++) {
			if (max < stocks.get(i)) {
				max = stocks.get(i);
				if (max - min > result) {
					result = max - min;
				}
			}
			if (min > stocks.get(i)) {
				min = stocks.get(i);
				max = min;
				continue;
			}
		}

		return result;
	}
}