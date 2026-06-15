package in.cdac.dao;

import java.util.Iterator;

import in.cdac.entity.Category;

public interface CategoryDAO {
    public Iterator<Category> getAllCategories();
    public boolean addCategory(Category category);
    public boolean deleteCategory(int categoryId);
}