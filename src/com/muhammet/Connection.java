package com.muhammet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Connection {

	// eri�im belirteci
	private String connection_point;

	public String getConnection_point(long userid) {
		if(userid==9999)
			return connection_point;
		else
			return "Yetkisiz eri�im";
	}

	public void setConnection_point(String connection_point,long userid) {
		if(userid==9999) {
			System.out.println("idsi....:"+userid+"olan ki�i de�i�im yapt�");
			System.out.println(this.connection_point+" olan de�eri..: "
			+connection_point+ " olarak de�i�tirdi");
			System.out.println(LocalDateTime.now());
			this.connection_point = connection_point;
		}else {
			System.out.println("Yetkisiz ��lem");
		}
		
	}
	
	
}
