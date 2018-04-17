package dao;

import to.Book;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
@Stateless
public class BookDao {
    @Inject
    private EntityManager entityManager;

    public Book save(Book book){
        entityManager.persist(book);
        return book;
    }
}
