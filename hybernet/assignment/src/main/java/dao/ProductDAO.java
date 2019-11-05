package dao;
import java.util.List;

import mphasis.assignment.Product;
import mphasis.assignment.Status;
public interface ProductDAO {
   Product insert (Product product);
   Product update (Product product);
   Status delete (Product product);
   List<Product> view();

}
