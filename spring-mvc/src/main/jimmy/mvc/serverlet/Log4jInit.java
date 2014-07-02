package jimmy.mvc.serverlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.apache.log4j.PropertyConfigurator;

public class Log4jInit extends HttpServlet {

	private static final long serialVersionUID = -304296018933479132L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		String prefix = config.getServletContext().getRealPath("/");
		String file = config.getInitParameter("log4j");
		String filePath = prefix + file;
		Properties props = new Properties();
		try {
			FileInputStream istream = new FileInputStream(filePath);
			props.load(istream);
			istream.close();
			Set<Object> keys = props.keySet();
			for (Object key : keys) {
				if (key.toString().endsWith(".File")) {
					String logFile = prefix + "resources/logs/"
							+ props.getProperty(key.toString());// 设置路径
					logFile = logFile.replace('\\', '/');
					System.out.println(logFile);
					props.setProperty(key.toString(), logFile);// 设置路径
				}
			}
			PropertyConfigurator.configure(props);// 装入log4j配置信息

		} catch (IOException e) {
			System.out.println("Could not read configuration file [" + filePath
					+ "].");
			System.out.println("Ignoring configuration file [" + filePath
					+ "].");
			return;
		}
	}

}
