package Array;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};

		Prob1 p1 = new Prob1();
		System.out.println("(배열 ia)");
		p1.check_odeven_sum(ia);
		System.out.println("(배열 ib)");
		p1.check_odeven_sum(ib);

	}
	public void check_odeven_sum(int[] numbers){
		int sum_even = 0;
		int sum_odd = 0;
		for(int n:numbers){
			if(n%2 == 0)
				sum_even += n;
			else
				sum_odd += n;
		}
		System.out.println("홀수의 합: " + sum_odd);
		System.out.println("짝수의 합: " + sum_even);
	}
	
}
