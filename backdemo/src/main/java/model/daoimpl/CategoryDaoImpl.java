package model.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.dao.CategoryDao;
import model.entity.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<>();

	@Override
	public List<Category> list() {
		
		String selectActiveCategory = "FROM Category where active=:active";
		
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active",true);

		return query.getResultList();
	}

//Getting single category based on ID
	@Override
	public Category get(int id) {

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub

		try {
			// adding category to database table
			sessionFactory.getCurrentSession().persist(category);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	// updating single category
	@Override
	public boolean update(Category category) {

		try {
			// adding category to database table
			sessionFactory.getCurrentSession().update(category);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public boolean delete(Category category) {
            category.setActive(false);
		try {
			// adding category to database table
			sessionFactory.getCurrentSession().update(category);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

}
