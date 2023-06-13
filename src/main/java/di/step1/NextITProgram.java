package di.step1;

import di.step1.service.FreeBoardService;

public class NextITProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//글쓰기처리
		FreeBoardService free = new FreeBoardService();
		free.insertBoard();
		
		
	}

}
