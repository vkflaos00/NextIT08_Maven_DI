package di.step2;

import di.step2.dao.DataBaseDriver;
import di.step2.dao.MysqlDriver;
import di.step2.dao.OracleDriver;
import di.step2.service.FreeBoardService;

public class NextITProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DataBaseDriver driver = new OracleDriver();
		DataBaseDriver driver = new MysqlDriver();
		
		//글쓰기처리
		FreeBoardService free = new FreeBoardService(driver);
		free.insertBoard();
		
		
	}

}
