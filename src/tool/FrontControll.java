package tool;

public class FrontControll {

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet .ServletExption;
import.javax.servlet.http.*;
import javax.servlet.annotation.webServlet;

@WebServlet(urlPatterns={"*.action"})
public class FrontControler extends HttpServlet {

	public void doPost(
		HttpServletException request, HttpServletResponse response
	) throws ServletException, IOExption {
		PrintWriter out=response.getWriter();
		servletPath().substring(1);
		String name=path.revletPath().substring
		{
			String path= request.getServletPath().substring(1);

		}
	}
}


}
