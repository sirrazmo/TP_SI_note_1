package fr.univtours.polytech.tp_note_1.dao;

import java.util.List;

import fr.univtours.polytech.tp_note_1.model.BookBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class EmprunterDAOImpl implements EmprunterDAO {

    @PersistenceContext(unitName = "tp_note_1")
    private EntityManager em;

    @Override
    public List<BookBean> getBookList() {
        Query query = em.createQuery("SELECT * FROM BookBean");
        return query.getResultList();
    }

    @Override
    public void emprunter() {
        Query query = em.createQuery("SELECT COUNT(free) FROM BookBean WHERE free = true");
        int emprunt = query.getFirstResult();

        if (emprunt < 3) {
            // TO DO : voir comment faire pour obtennir l id du livre a emprunter
        }
    }

    public void rendre() {

    }

    @Override
    public BookBean insertBook(BookBean book) {
        em.persist(book);
        return book;
    }

}
