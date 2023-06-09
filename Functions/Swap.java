package Functions;

public class Swap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//swap numbers code 
		int temp=a;
		a=b;
		b=temp;
		
		swap(a,b);
		
		System.out.println(a + " " + b);
		
		String name = "Kunal Kushwaha";
		changeName(name);
		System.out.println(name);

	}
	//in java there is no pass by reference..
		static void changeName(String naam)
		{
			naam = "Shoeb Iqbal";// here we are not changing the String just creating a new object
		}
		
		static void swap(int num1,int num2)
		{
			int temp = num1;
			num1=num2;
			num2 = temp;
		}

}
//its not a pass by reference it just a pass by the copy of the value of the reference

