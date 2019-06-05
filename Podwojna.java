public class Podwojna {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Przed wykonaniem petli");
		while (x < 100) {
			if (x != 40){
			System.out.println(x);
			}
			else{
			System.out.println("Fatal Error");
			}
			x = x + 3;
		
		}
		
		
		
		
		int i = 1;
		int j = 1;
		
		
		
			while (i <= 10){
				while (j <= 10) {
					System.out.println(i + " x "+ j + " = " + j * i);
				j = j + 1;
				}
			j = 1;
			i = i + 1;
			}
			
			
			System.out.println(j);
			System.out.println(i);

	}
}			