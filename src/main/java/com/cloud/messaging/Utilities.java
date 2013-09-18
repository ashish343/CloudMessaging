package com.cloud.messaging;

import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class Utilities {
	
	protected static final boolean DEBUG = true;
	private static final Logger logger = Logger.getLogger(Utilities.class.getName());
	
	public static String getParameter(HttpServletRequest req, String parameter)
		throws ServletException {
		String value = req.getParameter(parameter);
		if (isEmptyOrNull(value)) {
		if (DEBUG) {
		    StringBuilder parameters = new StringBuilder();
		    Enumeration<String> names = req.getParameterNames();
		    while (names.hasMoreElements()) {
		        String name = names.nextElement();
		        String param = req.getParameter(name);
	            parameters.append(name).append("=").append(param).append("\n");
	        }
	        logger.fine("parameters: " + parameters);
	        }
	        throw new ServletException("Parameter " + parameter + " not found");
		}
		return value.trim();
	}
	
	public static boolean isEmptyOrNull(String value) {
	    return value == null || value.trim().length() == 0;
	}
	
	public static String getHostName(HttpServletRequest request) {
		return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
	}
}
