package _00_Text_Funkifier;

import java.util.Stack;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		Stack<Character> letters = new Stack<Character>();
		String text = "";
		for(int i =0; i<s.length(); i++){
			letters.push(s.charAt(i));
		}
		for(int u = 0; u<s.length(); u++){
			text += letters.pop();
		}
		return text;
	}

}
