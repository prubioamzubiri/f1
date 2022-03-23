package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Piloto;
import persistencia.GestorDB;

/**
 * Servlet implementation class ServletPilotos
 */
public class ServletPilotos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private GestorDB gbd;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPilotos() {
        super();
		gbd = new GestorDB();

        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Piloto> listaPilotos = gbd.getGestorPilotos().getPilotos();

		

		request.setAttribute("pilotos", listaPilotos);

		RequestDispatcher rd = request.getRequestDispatcher("lista-pilotos.jsp");

		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}



	@Override
	public void init() throws ServletException {

		super.init();
		//gbd.getGestorPilotos().insertData();
				
	}

}
