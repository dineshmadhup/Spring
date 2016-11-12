package com.mycode.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "application-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "application";
	}
	
	// new  a controller method to read form data and add data to the model
//	@RequestMapping("/processFormForAddDataToModel")
//	public String addDataToModel(HttpServletRequest request, Model model) {
//		
//		// read the request parameter from the html form
//		String pName = request.getParameter("personName");
//		
//		String pAddress = request.getParameter("personAddress");
//		
//		String pEmail = request.getParameter("personEmail");
//		
//		String pPhone = request.getParameter("personPhone");
//		
//		//convert the data to all caps
//		pName = pName.toUpperCase();
//		pAddress = pAddress.toUpperCase();
//		pEmail = pEmail.toUpperCase();
//		pPhone = pPhone.toUpperCase();
//		
//		// create a message
//		String result  = "Model Stored Data: \n" + pName + " | " + pAddress + " | " + pEmail + " | " + pPhone;
//		
//		// add message to the model
//		model.addAttribute("message", result);
//		
//		return "application";
//	}
	
	   // new  a controller method to read form data and add data to the model
		@RequestMapping("/processFormForAddDataToModelVersionTwo")
		public String addDataToModel(
				@RequestParam("personName") String pName,
				@RequestParam("personAddress") String pAddress,
				@RequestParam("personEmail") String pEmail,
				@RequestParam("personPhone") String pPhone,
				Model model) {
			
			// read the request parameter from the html form ==> not required
//			String pName = request.getParameter("personName");
//			
//			String pAddress = request.getParameter("personAddress");
//			
//			String pEmail = request.getParameter("personEmail");
//			
//			String pPhone = request.getParameter("personPhone");
			
			//convert the data to all caps
			pName = pName.toUpperCase();
			pAddress = pAddress.toUpperCase();
			pEmail = pEmail.toUpperCase();
			pPhone = pPhone.toUpperCase();
			
			// create a message
			String result  = "Model Stored Data: \n" + pName + " | " + pAddress + " | " + pEmail + " | " + pPhone;
			
			// add message to the model
			model.addAttribute("message", result);
			
			return "application";
		}

}
