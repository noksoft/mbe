package mx.com.nok.core.log;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Log4jInit extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	Logger log;
	private static Properties props = new Properties();

	public Log4jInit(){
		this.log = Logger.getLogger(getClass());
	}

	public void init(){
		try{
			System.out.println("Cargando Servlet log4j");
			props.load(getServletContext().getResourceAsStream(getInitParameter("log4j-init-file")));
			LogManager.resetConfiguration();
			PropertyConfigurator.configure(props);
			getInfoProperties(props);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Error al configurar Log4j: " + e.toString());
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response){
		PrintWriter out;
		try{
			out = response.getWriter();
			try{
				System.out.println("Antes");
				out.println("Antes<hr>");
				getInfoProperties(props, response, out);
				if ((request.getParameter("method") != null) && (request.getParameter("method").equals("reset"))) {
					props = new Properties();
					props.load(getServletContext().getResourceAsStream(getInitParameter("log4j-init-file")));
				} else {
					props.setProperty(request.getParameter("package"), request.getParameter("level"));
				}
				LogManager.resetConfiguration();
				PropertyConfigurator.configure(props);

				System.out.println("Despues");
				out.println("<br><br>Despues<hr>");
				getInfoProperties(props, response, out);
			}catch (Exception e){
				e.printStackTrace();
			}finally{
				out.flush();
				out.close();
			}
		}catch (IOException e1){
			e1.printStackTrace();
		}
	}

	public void getInfoProperties(Properties prop){
		Enumeration enm = prop.keys();

		System.out.println("Inicio Log4J.properties");
		while (enm.hasMoreElements()) {
			String llave = (String)enm.nextElement();
			System.out.println(llave + " = " + prop.getProperty(llave));
		}
		System.out.println("Fin Log4J.properties");
	}

	public void getInfoProperties(Properties prop, HttpServletResponse response, PrintWriter out){
		Enumeration enm;
		try{
			enm = prop.keys();

			while (enm.hasMoreElements()) {
				String llave = (String)enm.nextElement();
				out.println(llave + " = " + prop.getProperty(llave) + "<br>");
				System.out.println(llave + " = " + prop.getProperty(llave));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
