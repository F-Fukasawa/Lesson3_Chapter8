package practice;

public class Main {
	public static void main(String[] args) {
		Func1 func1 = x -> x % 2 == 1;
		
		Func2 func2 = (male, name) ->{
			if(male) {
				return "Mr." + name;
			}else {
				return "Ms." + name;
			}
		};
		
		System.out.println(func1.isOdd(3));
		System.out.println(func2.addNamePrefix(true, "深澤"));
	}
}
