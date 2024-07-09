package StringEx.String03;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber1(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber2(number, 4));//2를 리턴
	}
	
	/*  이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumber1(long num1, int num2){
		int count = 0;
		while(num1>0){
			if(num1%10 == num2)
				count++;
			num1 /=10;
		}
		return count;
	}

	public int countNumber2(long num1, int num2){
		int count = 0;
		String origin = Long.toString(num1);
		String change= origin.replaceAll(Integer.toString(num2), "");
		count = origin.length() - change.length();
		return count;
	}
	
}
