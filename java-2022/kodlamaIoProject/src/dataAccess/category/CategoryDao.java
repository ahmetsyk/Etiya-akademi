package dataAccess.category;

import entities.Category;

public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
    Category getById(int id);
}
