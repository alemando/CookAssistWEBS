package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "createproduct", urlPatterns = {"/createproduct"})
public class createproduct extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {    
        RequestDispatcher view = request.getRequestDispatcher("createproduct.jsp");
        view.forward(request, response);        
    }

    //protected void doPost(HttpServletReq  uest request, HttpServletResponse response)
      //      throws ServletException, IOException {
       // processRequest(request, response);
    }
//}