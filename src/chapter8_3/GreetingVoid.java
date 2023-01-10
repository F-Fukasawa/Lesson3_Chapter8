package chapter8_3;

@FunctionalInterface
public interface GreetingVoid {
	void hello(String word);  // ★★戻り値をvoidにする
}
