package chap13.book.example.s1307;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
