package day04;

public class GameCharacterTest {
	/*
	 * 상속을 이용하여 다음 요구사항(중복코드 제거)을 해결하싱.
	 * 게임 캐릭터의 초기 작업을 위한 초심자(Novice) 클래스와
	 * 초심자의 다음 작업인 마법사(Wizard)클래스를 다음과같이 설계했다고 가정
	 * Wizard 클래스가 Novice 클래스위 모든 필드와 메소드를 가직 있ㄱ
	 * 추가로 마력 필드 mp와 불 공격 메소드 fireball()의 더해져있음
	 */
	import java.util.ArrayList;
class Novice{
	String name;
	int hp;

	String fireball;
	void punch() {
		System.out.printf("%s(Hp: %d)의 펀치!\n",name,hp);
	}
}

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		wizard.name="간달프";
		wizard.hp=100;
		wizard.mp= 80;
		
		knight knight = new knight ();
		knight.name = "킹아서";
		knight.hp=150;
		knight.stamina =70;
		
		wizard.fireball();
		knight.slash();
		
		wizard.punch();
		knight.punch();
		
		ArrayList<>gamelist = new ArrayList<Novice>();
		gamelist.add(knight);
		gamelist.add(wizard);
		
		for(Novice n: gamelist) {
			if(n instanceof Wizard) {
				((knight) n).slash();
				else if(n instanceof knight) {
				
				}
		

	}

}

class Wizard extends Novice{
	int mp;
	
	
	public void fireball() {
		System.out.printf("%s(MP:%d)의 불공격!\n", name, Mp);
		
		
	}
	class knight extends Novice{
		int stamina;
		public void slash()
	}
	
}

