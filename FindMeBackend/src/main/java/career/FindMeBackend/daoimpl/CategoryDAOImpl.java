package career.FindMeBackend.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import career.FindMeBackend.dao.CategoryDAO;
import career.FindMeBackend.dto.Category;

@Transactional
@Repository("categoryDAO")


public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Category> list() {
		String selectHql="from Category where active=:active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectHql);
		query.setParameter("active", true);
		return query.getResultList();
	}

	
	
	public Category get(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));

	}
	

	public boolean add(Category category) {
		
		try {
			
			sessionFactory.getCurrentSession().persist(category);
			return true; 
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	
	
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	
	public boolean delete(Category category) {
		category.setActive(false);
		
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		
		catch (Exception e) {
			return false;
		}
		
		}



	
	

}
