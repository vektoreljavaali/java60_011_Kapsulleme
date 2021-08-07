package com.muhammet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Connection {

	// eriþim belirteci
	private String connection_point;

	public String getConnection_point(long userid) {
		if(userid==9999)
			return connection_point;
		else
			return "Yetkisiz eriþim";
	}

	public void setConnection_point(String connection_point,long userid) {
		if(userid==9999) {
			System.out.println("idsi....:"+userid+"olan kiþi deðiþim yaptý");
			System.out.println(this.connection_point+" olan deðeri..: "
			+connection_point+ " olarak deðiþtirdi");
			System.out.println(LocalDateTime.now());
			this.connection_point = connection_point;
		}else {
			System.out.println("Yetkisiz Ýþlem");
		}
		
	}
	
	
}
