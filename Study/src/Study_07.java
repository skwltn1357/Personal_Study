
public class Study_07 {
	public static void main(String[] args) {
		
		String fruits = "apple|banana|orange|apple|orange|apple|pineapple|strawberry"; 
		 
		int start = -1;
		while((start = fruits.indexOf("apple", start + 1)) != -1) {
			System.out.println("apple À§Ä¡ : " + start);
			}
		}
		
	}

