public class Test{
	public static void main(String[] args){
		Army a = new Army(20,15);//����ͨ�����޸������������
		
		a.addWeapon(new Flighter());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		
		a.attackAll();
		a.moveAll();
	}
}


