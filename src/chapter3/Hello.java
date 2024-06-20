//パッケージ（ディレクトリ）の指定
package chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//クラスと対応するURLを指定
//パッケージ名とクラス名になるようにする
@WebServlet(urlPatterns={"/chapter3/hello"})
public class Hello extends HttpServlet {
	public void doGet (
		HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
//      レスポンスに書き込む為のライターを取得
		    PrintWriter out=response.getWriter();
		    out.println("otokogi2135");
		    out.println(new java.util.Date());
	}
}

<context reloadable= "true">
   <Resource>
        name="jdbc/book"
        
        
        ✕✕
        〇〇
    