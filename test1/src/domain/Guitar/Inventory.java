package domain.Guitar;


import java.sql.*;


public class Inventory implements ID{
	public Guitar findserialNumber(double price1,double price2,String builder,String model,String type,String backwood,String topwood) 
	{
		// TODO Auto-generated method stub
		Guitar guitar = null ;
		String sql = " select * from guitar where price >= " + price1 + " and price <= " + price2 + " and builder = " + builder + " and model = " + model + " and type = " +type+ " and backwood = " + backwood + " and topwood = " + topwood ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		try{
			st = conn.createStatement() ;
			rs = st.executeQuery(sql);
			while(rs.next()){
				int serialNumber=rs.getInt("serialNumber");
				double price = rs.getDouble("price") ;
				String builder1 = rs.getString("builder") ;
				String model1 = rs.getString("model") ;
				String type1 = rs.getString("type") ;
				String backwood1 = rs.getString("backwood") ;
				String topwood1= rs.getString("topwood") ;
				guitar = new Guitar(serialNumber, price,builder1,model1,type1, backwood1, topwood1) ;
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitar ;
	}

	@Override
	public Guitar findguitar(int serialNumber) {
		// TODO Auto-generated method stub
		Guitar guitar = null ;
		String sql = " select * from guitar where serialNumber = " + serialNumber;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		try{
			st = conn.createStatement() ;
			rs = st.executeQuery(sql);
			while(rs.next()){
				double price = rs.getDouble("price") ;
				String builder = rs.getString("builder") ;
				String model = rs.getString("model") ;
				String type = rs.getString("type") ;
				String backwood = rs.getString("backwood") ;
				String topwood= rs.getString("topwood") ;
				guitar = new Guitar(serialNumber, price,builder,model,type, backwood, topwood) ;
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitar ;
	}
	

}
