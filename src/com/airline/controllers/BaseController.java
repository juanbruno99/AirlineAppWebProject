package com.airline.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet represents the base controller for all the other servlets to inherit common functionality.
 * 
 * Also holds common constants to be shared by the response and requests objects.
 */
@WebServlet("/BaseController")
public abstract class BaseController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//HTML constants
	protected static final String VIEWS_PATH = "WEB-INF/views";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BaseController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected abstract void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected abstract void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
