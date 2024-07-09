package StringEx.String01;

public class Prob1 {

	public static void main(String args[]) {
		
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SSG", 6, '#') );
		System.out.println( prob1.leftPad("SSG", 5, '$') ); 
		System.out.println( prob1.leftPad("SSG", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		String result = "";
		StringBuilder sb = new StringBuilder(str);
		if(str.length() >= size)
			result = str;
		else{
			String remain = Character.toString(padChar).repeat(size-str.length());
			sb.insert(0, remain);
			result = sb.toString();
		}
		return result;
		/*  여기에 프로그램을 완성하십시오. */
		
	}
	
}
