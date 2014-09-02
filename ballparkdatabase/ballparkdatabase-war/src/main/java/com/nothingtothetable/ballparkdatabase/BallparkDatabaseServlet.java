package main.java.com.nothingtothetable.ballparkdatabase;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BallparkDatabaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8017395179446030699L; // find out what this is

	@Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws IOException {
	    if (req.getParameter("testing") == null) {
	      resp.setContentType("text/plain");
	      resp.getWriter().println("Hello, this is a testing servlet. \n\n");
	      Properties p = System.getProperties();
	      p.list(resp.getWriter());

	    } else {
	    	resp.setContentType("text/plain");
	    	resp.getWriter().println("Hello, Dan.");
	      //UserService userService = UserServiceFactory.getUserService();
	      //User currentUser = userService.getCurrentUser();

	      //if (currentUser != null) {
//	        resp.setContentType("text/plain");
	        //resp.getWriter().println("Hello, " + currentUser.getNickname());
	      //} else {
//	        resp.sendRedirect(userService.createLoginURL(req.getRequestURI()));
	      //}
	    }
	  }
}