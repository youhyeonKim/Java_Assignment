import Array.SortUtil;

public class Prob1 {

	public static void main(String[] args){
		
		Drink coffee = new Drink("커피",1500,4);
		Drink tea = new Drink("녹차",1100,7);
		Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);
		
		System.out.println("***** 매 출 전 표 ***** ");
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alcohol.printTitle();
		wine.printData();
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + wine.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
class Drink{
	String name;
	int price;
	int count;
	Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getTotalPrice(){
		return price*count;
	}
	public static void printTitle(){
		System.out.println("상품명\t단가\t수량\t금액\t");
	}
	public void printData(){
		System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
}
class Alcohol extends Drink{
	double alcper;

	Alcohol(String name, int price, int count, double al) {
		super(name, price, count);
		alcper = al;
	}
	public static void printTitle(){
		System.out.println("상품명(도수[%])\t단가\t수량\t금액");
	}
	public void printData(){
		System.out.println(name+"("+alcper+")\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
}
