package fr.univtours.polytech.tp_note_1.business;

import java.util.List;

import fr.univtours.polytech.tp_note_1.model.BookBean;

public interface LivreBusiness {

    public List<BookBean> getResultsList();

    public boolean empruntRendu(); 

    public BookBean insertBook(BookBean bookBean); 
}