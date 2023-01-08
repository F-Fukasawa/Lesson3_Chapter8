package chapter8_2;

public class Main {
	public static void main(String[] args) {
		Greeting greeting = () -> {
			return "こんにちは";
		};
		System.out.println(greeting.hello());
		
		Greeting gree = () ->{
			return "こにゃにゃちは～";
		};
		sayHello(gree);
	}
	
	public static void sayHello(Greeting g) {	// 引数で渡す Greeting の実装によって、sayHelloの挙動も変わる
		System.out.println(g.hello());	//このような、g.helloを用いた何らかの処理を書く
	}
}
