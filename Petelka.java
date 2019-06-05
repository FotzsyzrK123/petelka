public class Petelka {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("Przed wykonaniem petli");
		while (x < 100) {
			if (x != 40){
			System.out.println(x);
			}
			else{
			System.out.println("Fatal Error");
			}
			x = x + 5;
		
		}
		System.out.println("I juz po petli...");
	
	}
}			