package uetec.filesystem.server.listener;

import javax.servlet.annotation.*;
import javax.servlet.*;
import uetec.filesystem.server.util.*;

@WebListener
public class H2DBinitListener implements ServletContextListener {
	public void contextInitialized(final ServletContextEvent sce) {
		FileNodeUtil.initNodeTableToDataBase();
	}

	public void contextDestroyed(final ServletContextEvent sce) {
	}
}
