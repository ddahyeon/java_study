package exam14_interface_interface4_tightCoupling;

public class DBService {
	//MySQLDAO dao; //null 값 있음  
	OracleDAO dao; //oracleDB로 변경될 때 바꿔줘야함  
	
	//set 메서드로 초기화  
	//public void setDao(MySQLDAO dao) {
	public void setDao(OracleDAO dao) {
		this.dao=dao;
		
	}
	// 연결하기 위해 호출  
	public void connect() {
		//dao.cinnectMySQL();
		dao.connectOracle();
	}

}
