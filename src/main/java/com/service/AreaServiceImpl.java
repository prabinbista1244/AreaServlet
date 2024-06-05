package com.service;


import java.sql.SQLException;
import java.sql.Statement;

import com.db.Database;
import com.model.Area;

public class AreaServiceImpl implements AreaService{

	@Override
	public void calculateArea(Area a) {
		
		String sql = "insert into Area(length,breadth,Arearesult) values('"+a.getLength()+"','"+a.getBreadth()+"','"+a.getAresult()+"')";
		try {
			Statement  stm = Database.getConnection().createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
