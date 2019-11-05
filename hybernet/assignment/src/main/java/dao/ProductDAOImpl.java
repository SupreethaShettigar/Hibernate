package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mphasis.assignment.Product;
import mphasis.assignment.Status;

public class ProductDAOImpl implements ProductDAO{

	private SessionFactory factory;
	private Session session;
	private Transaction transaction;

	public ProductDAOImpl() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		factory = config.buildSessionFactory();
	}

	public Product insert(Product product) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		return product;
	}

	public Product update(Product product) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		Product temp = session.get(Product.class, product.getId());
		temp.setProduct_name(product.getProduct_name());
		temp.setPrice(product.getPrice());
		temp.setQuantity(product.getQuantity());
		session.update(temp);
		transaction.commit();
		session.close();
		return temp;
	}

	public Status delete(Product product) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		Product temp = session.get(Product.class, product.getId());
		session.delete(temp);
		transaction.commit();
		session.close();
		return new Status(true);
	}

	public List<Product> view() {
		session = factory.openSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product> list = query.list();
		transaction.commit();
		session.close();
		return list;
	}

	
}
