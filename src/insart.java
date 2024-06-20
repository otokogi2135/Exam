
public class insart {

	
import javax. servlet.ServletException;
import javax.servlet.http.HttpSession;

import tool. Page;

@Override
project void doPost (HttpServetRequest) red

public class CarGet extends HttpServlet {
	
	HttpSession session = req.getSession();
	
	List<Product> cart = (List<Product>)Session.get Attribute("cart");
	
	session.setAttribute("cart, cart);"
			
	        out.println("カートに追加しましたよ。")
	        
	        out.println("<a href='cart-get'>カートを確認する</a>")
	        
	        Page.footer(out);
}




