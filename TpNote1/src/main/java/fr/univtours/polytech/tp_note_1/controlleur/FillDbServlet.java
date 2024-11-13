package fr.univtours.polytech.tp_note_1.controlleur;

import java.io.IOException;

import fr.univtours.polytech.tp_note_1.business.LivreBusiness;
import fr.univtours.polytech.tp_note_1.model.BookBean;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "fillDBServlet", urlPatterns = { "/fillDB" })
public class FillDbServlet extends HttpServlet {

    @Inject
    private LivreBusiness empruntBusiness;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookBean livre1 = new BookBean();
        livre1.setTitle("livre1");
        livre1.setAuthor("auteur1");
        livre1.setFree(false);

        BookBean livre2 = new BookBean();
        livre2.setTitle("livre2");
        livre2.setAuthor("auteur2");
        livre2.setFree(false);

        BookBean livre3 = new BookBean();
        livre3.setTitle("livre3");
        livre3.setAuthor("auteur3");
        livre3.setFree(false);

        BookBean livre4 = new BookBean();
        livre4.setTitle("livre4");
        livre4.setAuthor("auteur4");
        livre4.setFree(false);

        livre1 = empruntBusiness.insertBook(livre1);
        livre2 = empruntBusiness.insertBook(livre2);
        livre3 = empruntBusiness.insertBook(livre3);
        livre4 = empruntBusiness.insertBook(livre4);
    }
}