package chapter8_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 並び替え対象のリスト
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		List<Integer> numbers2 = Arrays.asList(10, -8, -5, 2);
		List<Integer> numbers3 = Arrays.asList(3, -2, 0, 5);
		
		//元々の記述
		/*
		Collections.sort(
			numbers,
			new Comparator<Integer>() {
				@Override
				public int compare(Integer x, Integer y) {
					// 数値が小さい順に並べる
					return Integer.compare(x, y);
				}
			}
		);
		*/
		
		//ラムダ式
		Collections.sort(
			numbers,
			(Integer x, Integer y) -> {
				return Integer.compare(x, y);
			}
		);
		System.out.println(numbers);
		
		//変数に格納するVer
		Comparator<Integer> c = (Integer x, Integer y) -> {
		    return Integer.compare(x, y);
		};
		Collections.sort(numbers2,c);
		System.out.println(numbers2);
		
		//メソッド参照
		Comparator<Integer> d = Integer::compare;
		Collections.sort(numbers3,d);
		System.out.println(numbers3);
	}
}
