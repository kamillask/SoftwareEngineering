package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface{
	
	private String string;

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return string;
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	@Override
	public int countNumbers() {
		int count = 0;
		boolean numeric = false;
		boolean notNumeric = false;
		
		if(this.string == null) 
			throw new NullPointerException();
		else {
			for(int i = 0; i<this.string.length(); i++) {
				char current = this.string.charAt(i);
				if(Character.isDigit(current)) {
					numeric = true;
					
					} else {
						notNumeric = true;
						if(numeric == true && notNumeric == true) {
							count++;
							numeric = false;
						}
					} 
				if(i==this.string.length()-1 && numeric == true)
						count++;
				} 
			}	
		return count;
}
		

	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		if(this.string == null && n>0) 
			throw new NullPointerException();
		if(n<=0)
			throw new IllegalArgumentException();
		String result = "";
		String beforeSwap = "";
		
		if(startFromEnd) {
			if(this.string.length()<n)
				return result;
			for(int i = this.string.length()-n; i >= 0; i-=n) {
				beforeSwap+=this.string.charAt(i);
			}
			for(int i=beforeSwap.length()-1; i>=0; i--) {
				result+=beforeSwap.charAt(i);
			}
		} else {
			if(this.string.length()<n)
				return result;
			for(int i = n; i<=this.string.length(); i+=n) {
				result+=this.string.charAt(i-1);
			}
		}
		return result;

	}

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {

		String finalString = "";
		String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		
		
		if(startPosition>endPosition)
			throw new IllegalArgumentException();
		if(startPosition<=endPosition)
			if(startPosition<1 || startPosition>=this.string.length() || endPosition<1 || endPosition>this.string.length())
				throw new MyIndexOutOfBoundsException();
		if(startPosition<=endPosition && startPosition>0 && endPosition>0 && this.string==null)
			throw new NullPointerException();
			
		
		for(int i=0; i<startPosition-1;i++) {
			finalString+=this.string.charAt(i);
		}
		
		for(int i = startPosition-1; i<endPosition; i++) {
			char current = this.string.charAt(i);
			if(Character.isDigit(current)) {
				int value = Character.getNumericValue(current);
				String insert = digits[value];
				finalString+=insert;
				
			} else {
				finalString+=this.string.charAt(i);
				
			}
		}
		
		for(int i=endPosition; i<this.string.length();i++) {
			finalString+=this.string.charAt(i);
		}
		
		this.string=finalString;
		
	}
		
}




