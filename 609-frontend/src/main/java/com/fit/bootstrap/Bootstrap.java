package com.fit.bootstrap;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Bootstrap {

	public static void main(String[] args) {
		try {
			Server server = new Server(8080);
			WebAppContext context = new WebAppContext();
			context.setContextPath("/");
			context.setDescriptor("F:/my-git/609/609-frontend/target/609-frontend/WEB-INF/web.xml");
			context.setResourceBase("F:/my-git/609/609-frontend/target/609-frontend");
			context.setParentLoaderPriority(true);
			server.setHandler(context);
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
