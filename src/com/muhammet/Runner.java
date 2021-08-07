package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		
		Connection con = new Connection();
		con.setConnection_point("Ýstanbul", 9999);
		System.out.println(con.getConnection_point(9999));

	}

}
