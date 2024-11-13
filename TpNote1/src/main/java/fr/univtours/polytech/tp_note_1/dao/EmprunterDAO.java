package fr.univtours.polytech.tp_note_1.dao;

import java.util.List;

import fr.univtours.polytech.tp_note_1.model.BookBean;

public interface EmprunterDAO {

    public List<BookBean> getBookList();

    public void emprunter();

    public void rendre();

    public BookBean insertBook(BookBean book);

}
