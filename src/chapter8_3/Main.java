package chapter8_3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for ( int i = 0; i < 5 ; i++) { list.add(i); }
		//ラムダ式の出力命令
		list.forEach ( data -> System.out.print(data));
		//メソッド参照を用いた出力命令
		list.forEach(System.out::print);
		
		
		//関数型インターフェイス　Greeting において、 helloメソッドが文字列の引数を取る場合
		//ラムダ式
		Greeting greeting = (String word) -> {
			System.out.println("\n" + word);
			return "テスト";
		};
		System.out.println(greeting.hello("こんちは"));
		
		//メソッド参照
		GreetingVoid greetingVoid = System.out::println;
		greetingVoid.hello("\nコンニチハ");
	}
}
