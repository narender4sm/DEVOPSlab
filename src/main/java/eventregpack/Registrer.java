package eventregpack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Registrer
 */
@WebServlet("/Register")
public class Registrer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrer() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String fullname = request.getParameter("fullname");
        String htnumber = request.getParameter("htnumber");
        String branch = request.getParameter("branch");
        String section = request.getParameter("section");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String address = request.getParameter("freeform");
		
            
		Member member = new Member(fullname, htnumber, branch, section, email, password, phone, gender, address);
		
		RegistrarDbo rDbo = new RegistrarDbo();
		String result = rDbo.insert(member);
		response.getWriter().print(result);
		
	}

}
