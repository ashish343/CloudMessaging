package com.cloud.messaging;

import javax.servlet.http.HttpServletRequest;

public class CustomerRegisteration {


	public CustomerData getCustomerData(HttpServletRequest request) {
		return extractCustomerData(request);
	}
	private CustomerData extractCustomerData(HttpServletRequest request) {
		CustomerData customerData = null;
		try {
			customerData = new CustomerData();
			String email = Utilities.getParameter(request, Constants.PARAMETER_EMAIL);
			String name = Utilities.getParameter(request, Constants.PARAMETER_NAME);
			String phoneNumber = Utilities.getParameter(request, Constants.PARAMETER_PHONE_NO);
			String registerationID = Utilities.getParameter(request, Constants.PARAMETER_REG_ID);
		
			customerData.setEmail(email);
			customerData.setName(name);
			customerData.setPhoneNumber(phoneNumber);
			customerData.setRegisterationID(registerationID);
		} catch (Exception e) {
			
		}
		return customerData;
	}
}
