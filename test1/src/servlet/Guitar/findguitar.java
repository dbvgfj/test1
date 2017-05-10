package servlet.Guitar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Guitar.Guitar;
import domain.Guitar.ID;
import domain.Guitar.Inventory;

public class findguitar extends HttpServlet{
	
	    private static final long serialVersionUID = 1L ; 
public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
			ServletException,IOException{
			doPost(request,response);
		}
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws
			ServletException,IOException{
			request.setCharacterEncoding("utf-8");
			
			
			double price1 =Double.parseDouble(request.getParameter("price1"));
			double price2 =Double.parseDouble(request.getParameter("price2"));
			String builder =request.getParameter("builder");
			String model =request.getParameter("model");
			String type =request.getParameter("type");
			String backwood =request.getParameter("backwood");
			String topwood =request.getParameter("topwood");
			 ID r=new Inventory();
     		Guitar g = new Guitar();
     		g=r.findserialNumber(price1,price2,builder,model,type,backwood,topwood);
     		int serialNumber=g.getSerialNumber();
			request.setAttribute("serialNumber",serialNumber);
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}

	}

