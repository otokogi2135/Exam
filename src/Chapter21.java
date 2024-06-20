
public class Chapter21 {
	
import bean.Product;
import java.io.IOException;
import javax.servlet.ServletEXcption;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter21/el"})
public class EL extends HttpServlet {
	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws Servlet Exception, IOException {
		
		Product p=new Product();
		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);
		
		request.getRequestDispatcher("el.jsp")
		     .forward(request, response);
	}

}



