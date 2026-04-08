package exam14_interface_interface5_LooseCoupling;

public class MySQLDAO implements DBDAO{

	//MySQL DB 연동
	@Override
	public void connectDB() {
		System.out.println("MySQLDAO.connectMySQL()");
	}

}
