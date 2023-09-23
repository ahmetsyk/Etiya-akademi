package business.category;

import core.logging.Logger;
import dataAccess.category.CategoryDao;
import dataAccess.course.CourseDao;
import entities.Category;
import entities.Course;

public class CategoryManager {
    private Category category;
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager( CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category){
        if (category.getCategoryName()==categoryDao.getById(category.getCategoryId()).getCategoryName()){
            System.out.println("Aynı isimde kategori eklenemez.");
        }else
            categoryDao.add(category);
            log("Kategori eklendi");

    }

    public void delete(Category category){
        if (category==categoryDao.getById(category.getCategoryId())){
            categoryDao.delete(category);
            log("Kategori silindi.");
        }else
            System.out.println(category.getCategoryName() + "isimde bir kayıt bulunamadı.");
    }

    public void update(Category category) {
        if (category == categoryDao.getById(category.getCategoryId())) {
            categoryDao.update(category);
            log("Kategori güncellendi.");
        } else
            System.out.println(category.getCategoryName() + "isimde bir kayıt bulunamadı.");

    }
    void log(String message){
        for (Logger logger:loggers) {
            logger.log(message);
        }
    }
}
