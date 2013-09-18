package com.cloud.messaging;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(
        name = "RegisterServlet", 
        urlPatterns = {"/register"}
    )
public class RegisterSevlet extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		try {
			CustomerRegisteration customer = new CustomerRegisteration();
			CustomerData customerData = customer.getCustomerData(request);
			if(customerData != null) {
				out.write("Everything went well".getBytes());
				out.write("\n\n\n".getBytes());
				out.write(("Email::"+customerData.getEmail()).getBytes());
				out.write("\n\n\n".getBytes());
				out.write(("Name::"+customerData.getName()).getBytes());
				out.write("\n\n\n".getBytes());
				out.write(("Phone Number::"+customerData.getPhoneNumber()).getBytes());
				out.write("\n\n\n".getBytes());
				out.write(("Registeration ID::"+customerData.getRegisterationID()).getBytes());
			} else {
				out.write("Something is wrong".getBytes());
			}
			
			//TODO: 
			/*
			 * Add Data to DB.
			 */
			//TODO:
			/*
			 * Open Authorization page.
			 * Maybe SMS.
			 */
			//ServletContext servletContext = getServletContext();
			//RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/error");
			//requestDispatcher.forward(request, response);
			
			//TODO:
			/*
			 * Every thing went ok. Open Event page.
			 */
			
		} catch (Exception e) {
			String error = e.getStackTrace().toString();
			out.write(error.getBytes());
			out.write("Something is wrong".getBytes());
			
			//Maybe inform Customer that Registeration failed and ask to do it again.
			ServletContext servletContext = getServletContext();
			RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/error");
			requestDispatcher.forward(request, response);
		}
		out.flush();
		out.close();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	doGet(request, response);
    }
}
