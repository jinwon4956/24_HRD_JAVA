package day5;
interface 무기{
	void 작동();
}
interface 부엌도구{
	public void 작동();
}

class 활 implements 무기{
	public void 작동() {
		System.out.println("활 작동");
}
}
class 칼 implements 부엌도구{

	@Override
	public void 작동() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		활 무기1= new 활();
		칼 무기2= new 칼();
		
		무기1.작동();
		무기2.작동();
		
		무기 [] 무기들  = new 무기[2];
		무기들[0] = 무기1;
		무기들[1]=  무기2;
		for(int i=0; i<무기들.length; i++) {
			무기들[i].작동();
		}
	}

	

}
