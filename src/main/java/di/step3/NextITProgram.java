package di.step3;

import di.step3.dao.DataBaseDriver;
import di.step3.dao.MysqlDriver;
import di.step3.dao.OracleDriver;
import di.step3.service.FreeBoardService;

public class NextITProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DataBaseDriver driver = new OracleDriver();
		DataBaseDriver driver = new MysqlDriver();
		
		
		//글쓰기처리
		FreeBoardService free = new FreeBoardService();
		free.setDriver(driver);
		free.insertBoard();
		
		
	}

}
