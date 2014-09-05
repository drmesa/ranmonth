/*package com.nothingtothetable.ballparkdatabase;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BallparkDatabaseServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		LocalData database = new LocalData();
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println(database.getTeamMap().get(1).getName());
	}
}
*/