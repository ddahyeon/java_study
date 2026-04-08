package exam14_interface_interface5_LooseCoupling;

public class OracleDAO implements DBDAO{
	
	//Oracle DB 연동
	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectOracle()");
	}


}
