abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {	//인터페이스의 모든 메서드는 public abstract 예외없이
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
	public void move (int x, int y) {
		System.out.println("[" + x + "," + y + "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter(); //Fighter를 생성해서 반환
		return f;
	}
}

public class FighterTest {
    public static void main(String[] args) {
    	// Fighter f = new Fighter();
    	Unit2 u = new Fighter();
    	Fightable f = new Fighter();
    	
    	u.move(100, 200);
    	// u.attack(new Fighter()); // Unit2에는 attack()이 없어서 호출불가
    	u.stop();
    	
    	f.move(100,200);
    	f.attack(new Fighter());
    	// f.stop();	// Fightable에는 stop()이 없어서 호출 불가
    }
}
