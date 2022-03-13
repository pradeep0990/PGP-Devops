package com.practise.dao;

import com.mysql.cj.protocol.Resultset;
import com.practise.model.Account;

import java.sql.*;

public class AccountDao {
    public Account getAccountDetails(String email,String password){
	Account acc=new Account();
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://www.remotemysql.com:3306/9vSqWPQkCb?autoReconnect=true&useSSL=false","9vSqWPQkCb","UG0ej6NBeM");
	
	//Connection Check
	/*if(con!=null){
	    System.out.println("Connection Established");
	}
	else{
	    System.out.print("Error");
	}*/
	PreparedStatement ins=con.prepareStatement("select * from User_Details where email=?");
	ins.setString(1,email);
	ResultSet rs=ins.executeQuery();
	while(rs.next()){ 
	    if(rs.getString(4).equals(password)){
		acc.setUserName(rs.getString(1));
		acc.setCumAmountDebt(rs.getInt(2));
		acc.setCumAmountInvested(rs.getInt(3));
		acc.setPassword(rs.getString(4));
		acc.setEmail(rs.getString(5));
		acc.setPhno(rs.getLong(6));
		acc.setRoom_Name(rs.getString(7));
	    }
	    break;
	}
	con.close();
	System.out.println(acc);
	return acc;
	}
	catch(Exception e){ 
	   e.printStackTrace();
	}
	return acc;
	}
    
    public String insertAccountDetails(String name,String password,String email,long phno,String room){
	try{
	    if(!verifyUser(email)){
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://www.remotemysql.com:3306/9vSqWPQkCb?autoReconnect=true&useSSL=false","9vSqWPQkCb","UG0ej6NBeM");
	PreparedStatement ins=con.prepareStatement("insert into User_Details values(?,0,0,?,?,?,?)");
	ins.setString(1,name);
	ins.setString(2,password);
	ins.setString(3,email);
	ins.setLong(4,phno);
	ins.setString(5,room);
	ins.execute();
	con.close();
	System.out.print("inserted");
	return "Inserted";
	    }
	    else{
		return "created User";
	    }
	}
	catch(Exception e){ 
	   e.printStackTrace();
	   return "Data Error";
	}

	}
    public boolean verifyUser(String email){
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://www.remotemysql.com:3306/9vSqWPQkCb?autoReconnect=true&useSSL=false","9vSqWPQkCb","UG0ej6NBeM");
	PreparedStatement ins=con.prepareStatement("select * from User_Details where email=?");
	ins.setString(1,email);
	ResultSet rs=ins.executeQuery();
	while(rs.next()){
	    return true;
	}
	return false;
	}
	catch(Exception e){
	    e.printStackTrace();
	}
	return false;
    }
    
}
