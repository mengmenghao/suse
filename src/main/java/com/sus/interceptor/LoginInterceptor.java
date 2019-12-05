package com.sus.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
		String uri = req.getRequestURI();
		System.out.println(uri);
		if (uri.equals("/suse_war_exploded/loginController/login")||uri.equals("/suse_war_exploded/static/bootstrap-3.3.7-dist/css/bootstrap.min.css")
				||uri.equals("/suse_war_exploded/static/js/scripts.js")||uri.equals("/suse_war_exploded/static/font-awesome/css/font-awesome.min.css")
				|| uri.equals("/suse_war_exploded/static/css/form-elements.css")||uri.equals("/suse_war_exploded/static/js/jquery-1.11.1.js")
				||uri.equals("/suse_war_exploded/static/js/retina-1.1.0.min.js")|| uri.equals("/suse_war_exploded/static/css/styl.css")
				||uri.equals("/suse_war_exploded/static/ico/favicon.png")||uri.equals("/suse_war_exploded/static/js/jquery-3.4.1.js")
				||uri.equals("/suse_war_exploded/static/bootstrap-3.3.7-dist/js/bootstrap.min.js")||uri.equals("/suse_war_exploded/static/js/jquery.backstretch.js")
				||uri.equals("/suse_war_exploded/static/img/logo.png")||uri.equals("/suse_war_exploded/static/font-awesome/fonts/fontawesome-webfont.woff2")
				||uri.equals("/suse_war_exploded/static/font-awesome/fonts/fontawesome-webfont.woff")||uri.equals("/suse_war_exploded/static/font-awesome/fonts/fontawesome-webfont.ttf")
				||uri.equals(("/suse_war_exploded/static/css/styles.css"))) {
			System.out.println("通过拦截");
			return true;
		} else {
			Object obj = req.getSession().getAttribute("users");
			if (obj != null) {
				System.out.println("通过拦截");
				return true;
			}
			System.out.println("被拦截跳转到登录界面");
			res.sendRedirect("/suse_war_exploded/index.jsp");
			return false;

		}

	}
}

