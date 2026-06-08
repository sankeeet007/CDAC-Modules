package in.cdac.interfaces;

import java.util.Iterator;

import in.cdac.entity.Category;

public interface CategoryDAO {
	public Iterator<Category> getAllCategories();
}
