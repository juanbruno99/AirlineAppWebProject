package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.dictionary.Gender;
import com.airline.model.Passenger;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends BaseController {
	private static final long serialVersionUID = 1L;
	
	//Constant holds the view name (jsp) that this controller (servlet) works with
    private static final String URL = "/add_passenger.jsp";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPassenger() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Forward to the JSP file to render the html content + model (not yet in response)
		RequestDispatcher view = request.getRequestDispatcher(VIEWS_PATH + URL);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Retrieve the passenger details from the jsp form and populate a model object corresponding to it
		//Has to match the "name" attribute for the html tags in the form
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String dobRaw = request.getParameter("dob");
		
		//Split and convert to map to date object
		String[] dateParams = dobRaw.split("\\/");
		Calendar calDate = Calendar.getInstance();
		calDate.set(Integer.parseInt(dateParams[2]), Integer.parseInt(dateParams[1]), Integer.parseInt(dateParams[0]));
		
		//Finally get the gender
		String genderRaw = request.getParameter("gender");
		Gender gender = genderRaw.equals("male") ? Gender.Male : Gender.Female;
		
		//Create the Object model for a passenger and print
		Passenger passenger = new Passenger(firstName, lastName, calDate.getTime(), gender);
		System.out.println(passenger);

		//For now redirect back to doGet method for adding another passenger
		doGet(request, response);
	}

}
