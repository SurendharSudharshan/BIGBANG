package model.daoimpl;

import org.hibernate.Session;

import model.config.HibernateUtil;
import model.dao.IProductDao;
import model.entity.Product;

public class ProductDaoImpl implements IProductDao {
	
	private Session sess;
	public ProductDaoImpl()
	{
		sess=HibernateUtil.getSessionFactory().openSession();
	}
	@Override
	public boolean insertProduct(Product p) {
		
		boolean b=true;
		try
		{
			sess.beginTransaction();
			sess.save(p);
			sess.getTransaction().commit();
		}
		catch(Exception e)
		{
			b=false;
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
		
		return b;
	}
	
	

}
