package fr.univtours.polytech.tp_note_1.controlleur;

import java.io.IOException;

import fr.univtours.polytech.tp_note_1.business.LivreBusiness;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "EmpruntServlet", urlPatterns = { "/emprunt" })
public class EmprunterServlet extends HttpServlet {

    @Inject
    private LivreBusiness livre;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomLivre = request.getParameter("title");

        if (nomLivre != null) {
            livre.empruntRendu();
        }

    }

}
