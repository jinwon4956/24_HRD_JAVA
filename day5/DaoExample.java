package day5;
interface DataAccessobject{
	public void select();
	public void insert();
	public void update();
	public void delete();
}
class OracleDao implements DataAccessObject{
	
}
class MysqlDao implements DataAccessObject{
	public void  select() {
		System.out.println("Oracle D8에서 검색");
	}
	
} 
public class DaoExample {
	static void dbWork(DataAccessObject dao) {
		static void dbWork(DataAccessObject) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDaio());
		dbwork(new mysqldao());

	}

}
