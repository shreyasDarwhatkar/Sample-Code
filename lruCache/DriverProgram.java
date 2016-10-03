package lruCache;

public class DriverProgram {

	public static void main(String[] args) {
		LruCache l =new LruCache(3);
		l.set(1, 10);
		l.set(2, 9);
		l.set(3, 8);
		l.set(7, 7);

	}

}
