public class Player{
	private String name;
	private int life;

	public Player (String name){
		this.name=name;
		this.life=3;
	}

	public String getName (){
		return this.name;
	}

	public void setName (String name){
		this.name=name;
	}

	public int getLife(){
		return this.life;
	}

	public void setLife (int life) {
		this.life=life;
	}

	public void takeHit (){
		this.life=this.life - 1;
		if (this.life<=0){
			this.life= 0;
		}
		System.out.println(this.name + " perd un point de vie!");
		System.out.println(this.name + " a encore "+ this.life + " points de vie!");
	}

	public boolean isKo (){
		if (this.life>0) {
			return false;
		}
		else{
			System.out.println(this.name+ " a été vaporisé!");
			return true;
		}
	}
}
