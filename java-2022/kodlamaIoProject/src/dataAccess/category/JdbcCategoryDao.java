package dataAccess.category;

import entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{

    List<Category> categories;

    public JdbcCategoryDao(List<Category> categories) {
        System.out.println("JDBC: ");
        this.categories = categories;
    }

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
    }

    @Override
    public void update(Category category) {
        categories.set(category.getCategoryId(),category);
    }

    @Override
    public Category getById(int id) {
        return categories.get(id);
    }
}
