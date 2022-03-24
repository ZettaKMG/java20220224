package chap13.book.exercise.p03;

public class Container<T1, T2> {
	private T1 key;
	private T2 value;
	public void set(T1 param1, T2 param2) {
		key = param1;
		value = param2;
	}
	public T1 getKey() {
		return key;
	}
	public T2 getValue() {
		return value;
	}	
}
