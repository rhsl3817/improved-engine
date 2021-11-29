package Web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Number1DAO;
import DTO.Number1DTO;

@WebServlet("/newfile")
public class Newfile extends HttpServlet {
	private static final long seriaVersionUID = 1L;
	public Newfile() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Number1DTO> list = new ArrayList<Number1DTO>();
		Number1DAO dao = new Number1DAO();
		list = dao.list();
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("./newfile.jsp");
		rd.forward(request, response);
	}
}
