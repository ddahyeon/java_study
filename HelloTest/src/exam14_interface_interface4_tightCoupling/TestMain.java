package exam14_interface_interface4_tightCoupling;

public class TestMain {

	// TestMain -----> DBService ------->MySQLDAO. ------------>DB(MySQL)
	//								    OracleDAO ------------>DB(Oracle)   이렇게 연결한거임  
	public static void main(String[] args) {
		DBService service = new DBService();
		//service.setDao(new MySQLDAO());
		service.setDao(new OracleDAO());
		service.connect();
	}

}
