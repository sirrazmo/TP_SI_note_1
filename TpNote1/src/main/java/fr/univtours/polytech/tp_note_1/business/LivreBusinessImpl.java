package fr.univtours.polytech.tp_note_1.business;

import java.util.ArrayList;
import java.util.List;

import fr.univtours.polytech.tp_note_1.dao.EmprunterDAO;
import fr.univtours.polytech.tp_note_1.model.BookBean;
import jakarta.inject.Inject;

public class LivreBusinessImpl implements LivreBusiness {

    @Inject
    private EmprunterDAO EmprunterDAO;

    @Override
    public List<BookBean> getResultsList() {
        List<BookBean> bookList = new ArrayList<BookBean>();
        bookList = this.EmprunterDAO.getBookList();
        return bookList;
    }

    @Override
    public boolean empruntRendu() {
        return false;
    }

    @Override
    public BookBean insertBook(BookBean bookBean) {
        return (this.EmprunterDAO.insertBook(bookBean));
    }

}
