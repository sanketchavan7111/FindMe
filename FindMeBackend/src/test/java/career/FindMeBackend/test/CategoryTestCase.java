package career.FindMeBackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import career.FindMeBackend.dao.CategoryDAO;
import career.FindMeBackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private static Category category;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("career.FindMeBackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	
	/*@Test
	public void testGetCategory()
	{
	category=categoryDAO.get(1);
	
	assertEquals("successfully fetched Single Category ",
	"laptop",category.getName());
	}*/

	
/*	@Test
	public void testUpdateCategory()
	{
	category=categoryDAO.get(3);
	category.setName("RadoMatrix");
	assertEquals(" Successfully updated a single category in the table ",true, categoryDAO.update(category));
	}
	*/
	
	/*@Test
	public void testDeleteCategory()
	{
	category=categoryDAO.get(33);
	
	assertEquals("Successfully deleted a single category ",
	true,categoryDAO.delete(category));
	}*/

	
/*	@Test
	public void ListCategory()
	{
	assertEquals("Successfully fetched query ",5,
	categoryDAO.list().size());
	}
*/
	/*@Test
	public void testCRUDCategory()
	{
		//Adding Category
		category=new Category();
		category.setName("Radio");
		category.setDescription("This is Description of for Radio!");
		category.setImageURL("radio.png");
		assertEquals("Successfull added the category", true, categoryDAO.add(category));	
		
		category=new Category();
		category.setName("Laptop");
		category.setDescription("This is Description of for Laptop!");
		category.setImageURL("laptop.png");
		assertEquals("Successfull added the category", true, categoryDAO.add(category));
		
		category=new Category();
		category.setName("Television");
		category.setDescription("This is Description of for Television!");
		category.setImageURL("televion.png");
		assertEquals("Successfull added the category", true, categoryDAO.add(category));		
		
		category=new Category();
		category.setName("Computer");
		category.setDescription("This is Description of for Computer!");
		category.setImageURL("computer.png");
		assertEquals("Successfull added the category", true, categoryDAO.add(category));
		
		
		//Fetching and updating category
		
		category=categoryDAO.get(3);
		category.setName("TV");
		assertEquals(" Successfully updated a single category in the table ",true, categoryDAO.update(category));
		
		
		//Delete the category
		assertEquals("Successfully deleted a single category ",
		true,categoryDAO.delete(category));

		
		//Fetching the list
		assertEquals("Successfully fetched query ",28,
		categoryDAO.list().size());

		
	}
	*/
	
	

}
