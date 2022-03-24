package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.GestorDB;


public class ServletInsertData extends HttpServlet{

    GestorDB gbd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInsertData() {
        super();
		gbd = new GestorDB();

    }

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        try {

            gbd.insertData();

            RequestDispatcher rd = request.getRequestDispatcher("conf-datosInsertados.jsp");

            rd.forward(request, response);
            
        } catch (Exception e) {
            
            request.setAttribute("message", e.getMessage());

            RequestDispatcher rd = request.getRequestDispatcher("error-insercion-datos.jsp");

            rd.forward(request, response);

        }


		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
    
}
