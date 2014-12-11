public abstract class Weapon implements Assaultable,Mobile{
    public void attack(){}
	public void move(){}
}
class Tank extends Weapon{
  public void attack(){
   System.out.println("Tank attack!!!");//new attack()
  }
  public void move(){
   System.out.println("Tank move!!!");  
  }
}
class Flighter extends Weapon{
	public void attack(){
		System.out.println("Flighter attack!");
		
	}
	
	public void move(){
		System.out.println("Flighter move!");
	}
}
class WarShip extends Weapon{
	public void attack(){
		System.out.println("WarShip attack!");
	}
	
	public void move(){
		System.out.println("WarShip move!");
	}
}
class Army{
  Weapon[] w;
  int maxsum,sum,temp;
  Army(int maxsum, int sum){
   
	  System.out.println("武器库最大存储："+maxsum);
	 this.temp = sum;
	this.maxsum = maxsum;
	this.sum = sum;
	w = new Weapon[maxsum];
  }
  public void addWeapon(Weapon wa){
    //for(int i=sum+1;i<maxsum;i++){
	  if(sum>=maxsum){System.out.println("已达最大，无法添加");}
	  else{
	    w[sum]=wa;
	 
	  sum+=1;
	  
	  System.out .println("武器库再入一件.库存为："+sum);
	  }
	//}
  }
  public void attackAll(){
		for(int i = temp ; i < sum; i++)
			w[i].attack();
	}
	public void moveAll(){
		for(int i = temp ; i <sum; i++)
			w[i].move();
	}

}
/*
Army a = new Army(15,0);
a.addWeapon(new Tank());
a.attackAll();
		a.moveAll();
	}
}*/


