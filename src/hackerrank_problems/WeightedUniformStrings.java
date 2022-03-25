package hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WeightedUniformStrings {

	// -> initialization........
	static int count = 1;
	static int iplace = 0;
	static Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
	static Map<Character, Integer> charWeightages = new HashMap<Character, Integer>();
	static List<Integer> weightagesList = new ArrayList<Integer>();
	static List<String> answerList = new ArrayList<String>();
	static List<Character> charList = null;

	public static void main(String[] args) {

//		iplace -> used for standard return place of i and being used for main While loop.
//		i -> i is used locally. However, at the end length of all chars would be i+1.

		weightedUniformStrings(
				"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
				new ArrayList<>(Arrays.asList(2, 1, 12)));

		// just printing answer...
		for (String s : answerList) {
			System.out.println(s);
		}
	}

	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

		// -> initialization........
		// -> assigning weightages to each Alphabet.
		for (int i = 97; i < 123; i++) {
			charWeightages.put((char) i, i - 96);
		}

		// -> program starts here.
//		System.out.println(s.length());
		char[] charray = s.toCharArray();

		Stream<Character> myStreamOfCharacters = IntStream.range(0, charray.length).mapToObj(i -> charray[i]);

		charList = myStreamOfCharacters.collect(Collectors.toList());

		while (iplace < charList.size()) {
//			System.out.println("sending char: " + charray[iplace]);
			sendingChar(charList, iplace);

		}

		// -> to print Char Count HashMap only.
//		for (Character c : charCounts.keySet()) {
//			System.out.println("Character: " + c + " and count: " + charCounts.get(c));
//		}

		// -> method to check weightage of each Characters.
		calculateWeightage();

		// -> to print weightagesList -- actual weightage of our uniform SubStrings.
//		for (Integer i : weightagesList) {
//			System.out.println(i);
//		}

		for (int i : queries) {
			if (weightagesList.contains(i)) {
				answerList.add("Yes");
			} else {
				answerList.add("No");
			}
		}

		return answerList;

	}

	private static void calculateWeightage() {

		for (Character c : charCounts.keySet()) {

			for (int i = charCounts.get(c); i > 0; i--) {
				weightagesList.add(i * charWeightages.get(c));
			}

		}

	}

	private static void sendingChar(List<Character> charList, int i) {

		if (i + 1 < charList.size() && charList.get(i) == charList.get(i + 1)) {
			++count;

			if (i != charList.size() - 2) {
				sendingChar(charList, ++i);
			} else if (i == charList.size() - 2) {
//				System.out.println(charray[i] + "'s Count is: " + count);
				// either simply this...
				// charCounts.put(charray[i], count);

				// or to remove duplicates from String.
				// to have unified string's char counts.
				// use this...
				if (!charCounts.containsKey(charList.get(i))) {
					charCounts.put(charList.get(i), count);
				} else {
					charCounts.remove(charList.get(i));
				}

				count = 1;
				iplace = i + 1;
//				System.out.println("returning i is: " + (i + 1));
			}
		} else if (i > 0 && i == charList.size() - 1 && charList.get(i) == charList.get(i - 1)) {
			iplace = charList.size();
		} else {
//			System.out.println(charray[i] + "'s Count is: " + count);

			// either simply this...
			// charCounts.put(charray[i], count);

			// or to remove duplicates from String.
			// to have unified string's char counts.
			// use this...
			if (!charCounts.containsKey(charList.get(i))) {
				charCounts.put(charList.get(i), count);
			} else {
				charCounts.remove(charList.get(i));
			}

			count = 1;
//			System.out.println("returning i is: " + (i + 1));
			iplace = i + 1;
		}
	}
}

//***************************************************************************
//beta 1.0 -> running well 
//***************************************************************************

//static int count = 1;
//static int iplace = 0;
//
//public static void main(String[] args) {
//
//	weightedUniformStrings("abbcccddddf", null);
//
//}
//
//public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
//
//	char[] charray = s.toCharArray();
//
//	for (int i = 0; i < charray.length; i++) {
//		System.out.println("sending char: " + charray[i]);
//		sendingChar(charray, i);
//	}
//	return null;
//
//}
//
//private static void sendingChar(char[] charray, int i) {
//	System.out.println(charray[i]);
//	if (i + 1 < charray.length && charray[i] == charray[i + 1]) {
//		++count;
//
//		if (i != charray.length - 2) {
//			sendingChar(charray, ++i);
//		} else if (i == charray.length - 2) {
//			System.out.println("Count is: " + count);
//			count = 1;
//			System.out.println("returning i is: " + i);
//		}
//	} else {
//		System.out.println("Count is: " + count);
//		count = 1;
//		System.out.println("returning i is: " + i);
//	}
//}

// ***************************************************************************
//beta 1.1 -> running well and removed extra loop counts
// ***************************************************************************

//static int count = 1;
//static int iplace = 0;
//
//public static void main(String[] args) {
//
//	weightedUniformStrings("abbcccddddfgghiijklmnopppppqr", null);
//
//}
//
//public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
//
//	char[] charray = s.toCharArray();
//
//	while (iplace < charray.length) {
//		System.out.println("sending char: " + charray[iplace]);
//		sendingChar(charray, iplace);
//	}
//	return null;
//
//}
//
//private static void sendingChar(char[] charray, int i) {
//	System.out.println(charray[i]);
//	if (i + 1 < charray.length && charray[i] == charray[i + 1]) {
//		++count;
//
//		if (i != charray.length - 2) {
//			sendingChar(charray, ++i);
//		} else if (i == charray.length - 2) {
//			System.out.println(charray[i] + "'s Count is: " + count);
//			count = 1;
//			iplace = i + 1;
//			System.out.println("returning i is: " + i);
//		}
//	} else {
//		System.out.println(charray[i] + "'s Count is: " + count);
//		count = 1;
//		System.out.println("returning i is: " + i);
//		iplace = i + 1;
//	}
//}
//}

//***************************************************************************
//beta 1.2 -> successfully does the char counts and stores it in hashmap
//***************************************************************************

//static int count = 1;
//static int iplace = 0;
//static Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
//
//public static void main(String[] args) {
//
////	iplace -> used for standard return place of i and being used for main While loop.
////	i -> i is used locally. However, at the end length of all chars would be i+1.
//
//	weightedUniformStrings("abbcccddddeeeeeffffffghhhhhhhkkkkkkkl", null);
//
//}
//
//public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
//	System.out.println(s.length());
//	char[] charray = s.toCharArray();
//
//	while (iplace < charray.length) {
//		System.out.println("sending char: " + charray[iplace]);
//		sendingChar(charray, iplace);
//
//	}
//	for (Character c : charCounts.keySet()) {
//		System.out.println("Character: " + c + " and count: " + charCounts.get(c));
//	}
//	return null;
//
//}
//
//private static void sendingChar(char[] charray, int i) {
//
//	if (i + 1 < charray.length && charray[i] == charray[i + 1]) {
//		++count;
//
//		if (i != charray.length - 2) {
//			sendingChar(charray, ++i);
//		} else if (i == charray.length - 2) {
//			System.out.println(charray[i] + "'s Count is: " + count);
//			// either simply this...
//			// charCounts.put(charray[i], count);
//
//			// or to remove duplicates from String.
//			// to have unified string's char counts.
//			// use this...
//			if (!charCounts.containsKey(charray[i])) {
//				charCounts.put(charray[i], count);
//			} else {
//				charCounts.remove(charray[i]);
//			}
//
//			count = 1;
//			iplace = i + 1;
//			System.out.println("returning i is: " + (i + 1));
//		}
//	} else if (i == charray.length - 1 && charray[i] == charray[i - 1]) {
//		iplace = charray.length;
//	} else {
//		System.out.println(charray[i] + "'s Count is: " + count);
//
//		// either simply this...
//		// charCounts.put(charray[i], count);
//
//		// or to remove duplicates from String.
//		// to have unified string's char counts.
//		// use this...
//		if (!charCounts.containsKey(charray[i])) {
//			charCounts.put(charray[i], count);
//		} else {
//			charCounts.remove(charray[i]);
//		}
//
//		count = 1;
//		System.out.println("returning i is: " + (i + 1));
//		iplace = i + 1;
//	}
//}
//}

//***************************************************************************
//final 1.0 -> returns Successful results.
//***************************************************************************

//// -> initialization........
//static int count = 1;
//static int iplace = 0;
//static Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
//static Map<Character, Integer> charWeightages = new HashMap<Character, Integer>();
//static List<Integer> weightagesList = new ArrayList<Integer>();
//static List<String> answerList = new ArrayList<String>();
//
//public static void main(String[] args) {
//
////	iplace -> used for standard return place of i and being used for main While loop.
////	i -> i is used locally. However, at the end length of all chars would be i+1.
//
//	weightedUniformStrings("abbcccdddd", new ArrayList<>(Arrays.asList(1, 7, 5, 4, 14)));
//
////	// just printing answer...
////	for (String s : answerList) {
////		System.out.println(s);
////	}
//}
//
//public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
//
//	// -> initialization........
//	// -> assigning weightages to each Alphabet.
//	for (int i = 97; i < 123; i++) {
//		charWeightages.put((char) i, i - 96);
//	}
//
//	// -> program starts here.
////	System.out.println(s.length());
//	char[] charray = s.toCharArray();
//
//	while (iplace < charray.length) {
//		System.out.println("sending char: " + charray[iplace]);
//		sendingChar(charray, iplace);
//
//	}
//
//	// -> to print Char Count HashMap only.
//	for (Character c : charCounts.keySet()) {
//		System.out.println("Character: " + c + " and count: " + charCounts.get(c));
//	}
//
//	// -> method to check weightage of each Characters.
//	calculateWeightage();
//
//	// -> to print weightagesList -- actual weightage of our uniform SubStrings.
//	for (Integer i : weightagesList) {
//		System.out.println(i);
//	}
//
//	for (int i : queries) {
//		if (weightagesList.contains(i)) {
//			answerList.add("Yes");
//		} else {
//			answerList.add("No");
//		}
//	}
//
//	return answerList;
//
//}
//
//private static void calculateWeightage() {
//
//	for (Character c : charCounts.keySet()) {
//
//		for (int i = charCounts.get(c); i > 0; i--) {
//			weightagesList.add(i * charWeightages.get(c));
//		}
//
//	}
//
//}
//
//private static void sendingChar(char[] charray, int i) {
//
//	if (i + 1 < charray.length && charray[i] == charray[i + 1]) {
//		++count;
//
//		if (i != charray.length - 2) {
//			sendingChar(charray, ++i);
//		} else if (i == charray.length - 2) {
//			System.out.println(charray[i] + "'s Count is: " + count);
//			// either simply this...
//			// charCounts.put(charray[i], count);
//
//			// or to remove duplicates from String.
//			// to have unified string's char counts.
//			// use this...
//			if (!charCounts.containsKey(charray[i])) {
//				charCounts.put(charray[i], count);
//			} else {
//				charCounts.remove(charray[i]);
//			}
//
//			count = 1;
//			iplace = i + 1;
//			System.out.println("returning i is: " + (i + 1));
//		}
//	} else if (i == charray.length - 1 && charray[i] == charray[i - 1]) {
//		iplace = charray.length;
//	} else {
//		System.out.println(charray[i] + "'s Count is: " + count);
//
//		// either simply this...
//		// charCounts.put(charray[i], count);
//
//		// or to remove duplicates from String.
//		// to have unified string's char counts.
//		// use this...
//		if (!charCounts.containsKey(charray[i])) {
//			charCounts.put(charray[i], count);
//		} else {
//			charCounts.remove(charray[i]);
//		}
//
//		count = 1;
//		System.out.println("returning i is: " + (i + 1));
//		iplace = i + 1;
//	}
//}
//}

//***************************************************************************
//final 1.2 -> Hackerrank Upload sussful -> 0.67 score achieved!
//***************************************************************************

//class Result {
//
//    /*
//     * Complete the 'weightedUniformStrings' function below.
//     *
//     * The function is expected to return a STRING_ARRAY.
//     * The function accepts following parameters:
//     *  1. STRING s
//     *  2. INTEGER_ARRAY queries
//     */
//     
//    static int count = 1;
//    static int iplace = 0;
//    static Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
//    static Map<Character, Integer> charWeightages = new HashMap<Character, Integer>();
//    static List<Integer> weightagesList = new ArrayList<Integer>();
//    static List<String> answerList = new ArrayList<String>();
//
//    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
//   
//        for (int i = 97; i < 123; i++) {
//            charWeightages.put((char) i, (i-96));
//        }
//
//        char[] charray = s.toCharArray();
//
//        while (iplace < charray.length) {
//            sendingChar(charray, iplace);
//        }
//        
//        calculateWeightage();
//        
//        for (int i : queries) {
//            if (weightagesList.contains(i)) {
//                answerList.add("Yes");
//            } else {
//                answerList.add("No");
//            }
//        }
//
//        return answerList;
//
//    }
//    private static void calculateWeightage() {
//
//        for (Character c : charCounts.keySet()) {
//            for (int i = charCounts.get(c); i > 0; i--) {
//                weightagesList.add(i * charWeightages.get(c));
//            }
//        }
//
//    }
//
//    private static void sendingChar(char[] charray, int i) {
//
//        if (i + 1 < charray.length && charray[i] == charray[i + 1]) {
//            ++count;
//
//            if (i != charray.length - 2) {
//                sendingChar(charray, ++i);
//            } else if (i == charray.length - 2) {
////                System.out.println(charray[i] + "'s Count is: " + count);
//                // either simply this...
//                // charCounts.put(charray[i], count);
//
//                // or to remove duplicates from String.
//                // to have unified string's char counts.
//                // use this...
//                if (!charCounts.containsKey(charray[i])) {
//                    charCounts.put(charray[i], count);
//                } else {
//                    charCounts.remove(charray[i]);
//                }
//
//                count = 1;
//                iplace = i + 1;
////                System.out.println("returning i is: " + (i + 1));
//            }
//        } else if (i > 0 && i == charray.length - 1 && charray[i] == charray[i - 1]) {
//            iplace = charray.length;
//        } else {
////            System.out.println(charray[i] + "'s Count is: " + count);
//
//            // either simply this...
//            // charCounts.put(charray[i], count);
//
//            // or to remove duplicates from String.
//            // to have unified string's char counts.
//            // use this...
//            if (!charCounts.containsKey(charray[i])) {
//                charCounts.put(charray[i], count);
//            } else {
//                charCounts.remove(charray[i]);
//            }
//
//            count = 1;
////            System.out.println("returning i is: " + (i + 1));
//            iplace = i + 1;
//        }
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<String> result = Result.weightedUniformStrings(s, queries);
//
//        bufferedWriter.write(
//            result.stream()
//                .collect(joining("\n"))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
