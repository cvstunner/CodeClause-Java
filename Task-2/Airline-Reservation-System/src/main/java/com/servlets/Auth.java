package com.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.*;
import org.json.JSONObject;
import java.sql.*;
import com.db.QueryExecute;

// Servlet for URL pattern /api/user
public class Auth extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private int count = 0;
    private JSONObject resObj;
    private Gson gson = new Gson();
    ResultSet rs = null;
    ResultSet admin = null;
    QueryExecute queryExecute = new QueryExecute();
       
    // Public Class Constructor
    public Auth() {
        super();
    }

    // Handling requests from client
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	System.out.print("Ok");
        username = req.getParameter("u");
        password = req.getParameter("p");
    	res.setContentType("application/json");
    	res.setCharacterEncoding("UTF-8");
    	resObj = new JSONObject();
        try {
            admin = queryExecute.getData("SELECT username FROM admin WHERE username = ? AND password = ?;", new Object[]{username, password});
            if (admin.next()) {
                resObj.put("username", admin.getString("username"));
                resObj.put("status", "admin");
        	    String userJsonString = new Gson().toJson(resObj);
        	    System.out.println(userJsonString);
            	res.setStatus(200);
        	    res.getWriter().write(userJsonString);
            }
            else {
	            rs = queryExecute.getData("SELECT userid, username FROM users WHERE username = ? AND password = ?;", new Object[]{username, password});
            	if(rs.next()) {
	                resObj.put("userid", rs.getString("userid"));
	                resObj.put("status", "user");
	        	    String userJsonString = new Gson().toJson(resObj);
	        	    System.out.println(userJsonString);
	            	res.setStatus(200);
	        	    res.getWriter().write(userJsonString);
	            }
	            else {
	                resObj.put("userid", "null");
	        	    String userJsonString = new Gson().toJson(resObj);
	        	    System.out.println(userJsonString);
	            	res.setStatus(404);
	        	    res.getWriter().write(userJsonString);
	            }
        	}

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	resObj = new JSONObject();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        Creds creds = new Gson().fromJson(req.getReader(), Creds.class);
        try {
            queryExecute.setData("INSERT INTO users (name, age, gender, email, username, password) SELECT ?, ?, ?, ?, ?, ? WHERE NOT EXISTS(SELECT 1 FROM users WHERE username = ?);", new Object[]{creds.name, creds.age, creds.gender, creds.email, creds.username, creds.password, creds.username});
            rs = queryExecute.getData("SELECT max(userId) FROM users;", new Object[]{});
            rs.next();
	        resObj.put("userid", rs.getString("max(userId)"));
		    String userJsonString = new Gson().toJson(resObj);
		    res.getWriter().write(userJsonString);
	        res.setStatus(200); 
        } catch (Exception e) {
            // TODO Auto-generated catch block
			e.printStackTrace();
	        resObj.put("userid", "null");
		    String userJsonString = new Gson().toJson(resObj);
		    res.getWriter().write(userJsonString);
			res.setStatus(404); 
        }
    }
}

class Creds {
	public String name;
	public String age;
	public String gender;
	public String email;
	public String username;
	public String password;
}