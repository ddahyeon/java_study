package exam14_interface_interface5_LooseCoupling;

public class DBService {

//	MySQLDAO dao;
//	OracleDAO dao;
	DBDAO dao;
	
	//set메서드로 초기화
//    public void setDao(MySQLDAO dao) {
//	public void setDao(OracleDAO dao) {
		public void setDao(DBDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
//		dao.connectMySQL();
//		dao.connectOracle();
		dao.connectDB();
	}

}
