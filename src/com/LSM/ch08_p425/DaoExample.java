package com.LSM.ch08_p425;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) { 
		// TODO Auto-generated method stub
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	//어떤 문장을 쓸지
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao()); //업캐스팅 ->다형성
		dbWork(new MySqlDao());
	}
	//어떤 클래스를 가져올지
}
