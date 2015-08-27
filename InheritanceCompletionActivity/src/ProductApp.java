import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a product name.");
		String p = sc.nextLine();
		
		if (p.equalsIgnoreCase("book")) {
			Book book = new Book();
			System.out.println(book.className());
		} else if (p.equalsIgnoreCase("software")) {		
			Software software = new Software();
			System.out.println(software.className());
		} else {
			System.out.println("Invalid product type.");
		}
	}

}