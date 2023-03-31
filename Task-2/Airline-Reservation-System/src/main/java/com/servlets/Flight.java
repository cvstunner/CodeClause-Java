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
public class Flight extends HttpServlet {
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
    public Flight() {
        super();
    }

    // Handling requests from client
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	System.out.print("Ok");
    	res.setContentType("application/json");
    	res.setCharacterEncoding("UTF-8");
    	resObj = new JSONObject();
        try {
            rs = queryExecute.getData("SELECT * FROM flights;", new Object[]{});
            while(rs.next()) {
                resObj.put("airlineId", rs.getString("airlineId"));
                resObj.put("airlineName", rs.getString("airline_name"));
                resObj.put("trip", rs.getString("trip_type"));
                resObj.put("from", rs.getString("from_location"));
                resObj.put("to", rs.getString("to_location"));
                resObj.put("depDate", rs.getString("departure_date"));
                resObj.put("depTime", rs.getString("departure_time"));
                resObj.put("retDate", rs.getString("return_date"));
                resObj.put("retTime", rs.getString("return_time"));
                resObj.put("total_seats", rs.getString("total_seats"));````
                resObj.put("duration", rs.getString("duration"));
            }
            // else {
            //     resObj.put("userid", "null");
        	//     String userJsonString = new Gson().toJson(resObj);
        	//     System.out.println(userJsonString);
            // 	res.setStatus(404);
        	//     res.getWriter().write(userJsonString);
        	// }

            res.setStatus(200);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            resObj.put("status", "404");
            String userJsonString = new Gson().toJson(resObj);
            System.out.println(userJsonString);
            res.setStatus(404);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	resObj = new JSONObject();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        Details details = new Gson().fromJson(req.getReader(), Details.class);
        try {
            queryExecute.setData("INSERT INTO flights (airlineId, airline_name, trip_type, from_location, to_location, departure_time, return_time, duration, total_seats, departure_date, return_date) SELECT ?, ?, ?, ?, ?, ?, ?, ?, ?;", new Object[]{details.airlineId, details.airlineName, details.trip, details.from, details.to, details.depTime, details.retTime, details.duration, details.firstSeats + details.bizSeats + details.ecoSeats, details.depDate, details.retDate});
	        res.setStatus(200); 
        } catch (Exception e) {
            // TODO Auto-generated catch block
			e.printStackTrace();
			res.setStatus(404); 
        }
    }
}

class Details {
	public String airlineId;
	public String airlineName;
	public String trip;
	public String from;
    public String to;
	public String depDate;
    public String depTime;
    public String retDate;
    public String retTime;
	public String firstSeats;
    public String bizSeats;
    public String ecoSeats;
    public String duration;
}