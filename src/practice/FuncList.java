package practice;

public class FuncList {
	public boolean isOdd(int x) {
		return x % 2 == 1;
	}
	public String addNamePrefix(boolean male, String name) {
		if(male) {
			return "Mr." + name;
		} else {
			return "Ms." + name;
		}
	}
}
