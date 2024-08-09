package day04;
import java.util.ArrayList;
/**
 * 상속을 이용하여 다음 요구사항을 해결하시오.
 * 게임 캐릭터의 초기 작업을 위한 초심자(Novice) 클래스와
 * 초심자의 다음 작업인 마법사(Wizard) 클래스를 다음과 같이 설계했다고 가정
 * Wizard 클래스가 Novice 클래스의 모든 필드와 메소드를 가지고 있고 
 * 추가로 마력필드 mp와 불 공격 메소드 fireball()이 더해져 있음
 */

class Novice{
	String name;
	int hp;
	
	public void punch() {
		System.out.println(name + "(HP: " + hp + ")의 펀치!");
	}
}

class Wizard extends Novice{
	int mp;
	
	public void fireball() {
		System.out.println(name + "(MP: " + mp + ")의 불 공격");
	}
}

class Knight extends Novice{
	int stamina;
	
	public void slash() {
		System.out.println(name + "(stamina: " + stamina + ")의 베기 공격");
	}
}

public class GameCharacterTest {

	public static void main(String[] args) {
		
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 100;
		wizard.mp = 80;
		
		Knight knight = new Knight();
		knight.name = "킹아서";
		knight.hp = 150;
		knight.stamina = 70;
		
		wizard.fireball();
		knight.slash();
		wizard.punch();
		knight.punch();
		
		//////////////////////////////////////////////////////
		ArrayList<Novice> arr = new ArrayList<Novice>();
		////////////////////////////////////////////////////
		arr.add(wizard);
		arr.add(knight);
		
		for(Novice n : arr) {
			if(n instanceof Wizard) {
				((Wizard) n).fireball();
			}else if(n instanceof Knight) {
				((Knight) n).slash();
			}
		}
	}

}
