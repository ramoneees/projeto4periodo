package seguranca;

import gui.LoginBean;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("*.xhtml")
public class LoginAutenticadoFilter implements Filter{
	private static final String[] arquivosEscape = { "javax.faces.resource","index.xhtml", "index2.xhtml", "novo-usuario.xhtml" };
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession sessao = req.getSession();
		
		
		
		if (verificaPaginaInicial(request)) {
			chain.doFilter(request, response);
		} else {

			if (sessao == null || sessao.getAttribute("loginBean") == null || ((LoginBean) sessao.getAttribute("loginBean")).getUsuarioLogado() == null) {
				
				RequestDispatcher dis = request
						.getRequestDispatcher("/index.xhtml");
				dis.forward(request, response);
			} else {
				
				// pass the request along the filter chain
				chain.doFilter(request, response);

			}
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	protected boolean verificaPaginaInicial(ServletRequest request) {

		String resource = ((HttpServletRequest) request).getRequestURI();

		for (String esc : arquivosEscape) {
			if (resource.contains(esc)) {
				return true;
			}
		}
		System.out.println(resource);
		return false;
	}
}
