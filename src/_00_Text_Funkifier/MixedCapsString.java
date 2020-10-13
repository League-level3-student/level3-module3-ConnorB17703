package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String str = s.toLowerCase();
		char letter;
		String text = "";
		for(int i =0; i<str.length();i++){
			if(i%2 != 0){
				letter = Character.toUpperCase(str.charAt(i));
				text += letter;
			}
			else{
				text += str.charAt(i);
			}
			
		}
	
		return text;
	}

}
