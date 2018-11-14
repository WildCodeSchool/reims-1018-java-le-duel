public class Joueur
{

	private String name;
	private int life;
	private int attack;


	public Joueur (String name, int life, int attack)
	{
		this.name=name;
		this.life=life;
		this.attack=attack;
	}

	public String getName ()
	{
		return this.name;
	}

	public void setName (String name)
	{
		this.name=name;
	}

	public int getLife()
	{
		return this.life;
	}

	public void setLife (int life) 
	{
		this.life=life;
	}

	public int getAttack ()
	{
		return this.attack;
	}

	public void setAttack (int attack)
	{
		this.attack=attack;
	}


	public void takeHit (int hit)
	{
		this.life=this.life - hit;
		if (this.life<=0)
		{
			this.life= 0;
		}
		System.out.println(this.name + " has "+ this.life + " points remaining!")
	}

	public boolean isKo ()
	{
		if (this.life>0) 
		{
			return false;
		}
		else
		{
			System.out.println(this.name+ " is KO !");
			return true;
		}
	}
}