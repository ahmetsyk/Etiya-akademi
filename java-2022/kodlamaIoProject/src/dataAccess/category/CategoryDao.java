package dataAccess.category;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
    Category getById(int id);
    List<Category> getAll();
}
