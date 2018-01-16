package pages;

import java.io.FileReader;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;



public class WildCard {
	private static class Generic<K,V>{
		private K key;
		private V value;
		public K getKey(){
			return key;
		}
		public V getValue(){
			return value;
		}

		public Generic(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Generic{" +
					"key=" + key +
					", value=" + value +
					'}';
		}
	}

	public static void main(String[] args) {
		System.out.println( new Generic<>("asd",2));
		System.out.println( new Generic<>(2,"2"));
		System.out.println( new Generic<>("asd","5"));
		System.out.println( new Generic<>(4.7,42));

		ArrayList prediction = getPrediction(new ArrayList<>(), 4);



	}

	public static  <Z extends List,A> Z getPrediction(Z s,A a){
		return s;
	}
	public static String getPrediction2(WildCard.Generic<?,String> s, List<? super RuntimeException> a){
		return null;
	}
	public void sd(Map< ? extends Exception, ? super FileReader> a ){}



}
