package com.samco.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samco.model.Student;
import com.samco.persist.StudentDaoImplementation;

/**
 * Servlet implementation class JPAServlet
 */
@WebServlet("/JPAServlet")
public class JPAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	StudentDaoImplementation daoimpl = new StudentDaoImplementation();
    public JPAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stuName = request.getParameter("name");
		String stuDep = request.getParameter("department");
		int stuYear = Integer.parseInt(request.getParameter("collegeyear"));
		
		Student student = new Student();
		student.setStuName(stuName);
		student.setStuDep(stuDep);
		student.setStuYear(stuYear);
		daoimpl.insertStudent(student);
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
