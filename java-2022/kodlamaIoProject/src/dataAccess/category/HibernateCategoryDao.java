package dataAccess.category;

import entities.Category;
import entities.Instructor;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao{

    List<Category> categories;

    public HibernateCategoryDao(List<Category> categories) {
        System.out.println("Hibernate: ");
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
