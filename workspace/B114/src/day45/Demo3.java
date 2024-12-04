package day45;

public class Demo3 {

	public static void main(String[] args) {
		String url="https://aksharatraining.com";
		
		System.out.println(url.equals("https://aksharatraining.com"));//true
		
		System.out.println(url.startsWith("https"));//true
		System.out.println(url.startsWith("www"));//false
		
		System.out.println(url.contains("akshara"));//true
		System.out.println(url.contains("http"));//true
		System.out.println(url.contains("com"));//true
		
		System.out.println(url.endsWith(".com"));//true
		System.out.println(url.endsWith(".org"));//false
		
	
		
	}

}
