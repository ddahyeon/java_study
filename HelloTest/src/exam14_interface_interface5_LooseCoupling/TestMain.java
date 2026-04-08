package exam14_interface_interface5_LooseCoupling;

public class TestMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
//		service.setDao(new MySQLDAO());
		service.setDao(new OracleDAO());
		service.connect();
	}

}
