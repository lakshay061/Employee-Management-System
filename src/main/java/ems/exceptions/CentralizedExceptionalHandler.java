package ems.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice					// This is the annotation that will tell the Spring that this is the centralized Controller to handle all the exceptions coming in all the Controllers..
public class CentralizedExceptionalHandler {
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)			// Ye Error code hum apni marzi se likh skte hai or ye logs humko browser ki console logs pr dikhai denge..
	@ExceptionHandler(value = ArithmeticException.class)		
	public String arithmeticExceptionHandler(Model m) {
		m.addAttribute("msg", "An Exception Occured");
		return "error_page";
	}
	
	
	@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(value = NumberFormatException.class)		
	public String numberFormatHandler(Model m) {
		m.addAttribute("msg", "An Exception Occured");
		return "error_page";
	}
	
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)		
	public String nullPointerExceptionHandler(Model m) {
		m.addAttribute("msg", "An Exception Occured");
		return "error_page";
	}
	
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)		
	public String allExceptionHandler(Model m) {
		m.addAttribute("msg", "An Exception Occured");
		return "error_page";
	}
	
}
