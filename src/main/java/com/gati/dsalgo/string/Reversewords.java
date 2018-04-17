/**
 * 
 */
package com.gati.dsalgo.string;

/**
 * @author sahug
 *
 */
public class Reversewords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "i like this program very much";
		Reversewords reversewords = new Reversewords();
		reversewords.reverseWords(input);
		System.out.println(input);
	}

	private void reverseWords(String input) {
		char[] ch = input.toCharArray();
		boolean flag = false;
		int start = 0;
		int end = 0;
		for (int i = 0; i < input.length(); i++) {
			if (ch[i] == ' ' && !flag) {
				flag = true;
				end = i - 1;
				reverseWord(ch, start, end);
			}
			if (ch[i] != ' ' && flag) {
				start = i;
				flag = false;
			}
		}
		reverseWord(ch,start , ch.length-1);
		reverseWord(ch, 0, ch.length-1);
		System.out.println(String.valueOf(ch));
	}

	private void reverseWord(char[] ch, int i, int j) {
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
	}

}
