package mphasis.assignment;
import java.util.List;
import java.util.Scanner;

import dao.ProductDAOImpl;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
		ProductDAOImpl impl = new ProductDAOImpl();
		
		int doChoice = 0;
		
		
		do {
			System.out.println("1.Insert\t2.Update\t3.Delete\t4.View");
			int choice = scan.nextInt();
			scan.nextLine();
			Product p = new Product();
			switch (choice) {
			case 1:
				System.out.println("Enter product name  quantity and price");
				p = new Product(0, scan.next(),scan.nextInt(),scan.nextFloat());
				Product res = impl.insert(p);
				System.out.println(res);
				break;

			case 2:
				System.out.println("Enter product  id,name,quantity and price");
				p = new Product();
				p.setId(scan.nextInt());
				p.setProduct_name(scan.next());
				p.setQuantity(scan.nextInt());
				p.setPrice(scan.nextFloat());
				
				Product res1 = impl.update(p);
				System.out.println(res1);
				break;

			case 3:
				System.out.println("Enter  product id");
				p = new Product();
				p.setId(scan.nextInt());
				scan.nextLine();
				Status s = impl.delete(p);
				System.out.println(s);
				break;

			case 4:
				List<Product> list = impl.view();
				for (Product product : list) {
					System.out.println(product);
				}
				break;

			default:
				break;
			}

			System.out.println("1.Re Run\t\t2.Exit");
			doChoice = scan.nextInt();
			scan.nextLine();
		} while (doChoice == 1);

		System.out.println("********Good Bye For Now********");

    }
}
