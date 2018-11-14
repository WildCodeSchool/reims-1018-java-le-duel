public class Player
{

	private String name;
	private int life;
	private int sort;


	public Player (String name, int life, int sort)
	{
		this.name=name;
		this.life=life;
		this.sort=sort;
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

	public int getSort ()
	{
		return this.sort;
	}

	public void setSort (int sort)
	{
		this.sort=sort;
	}


	public void takeHit (int hit)
	{
		this.life=this.life - hit;
		if (this.life<=0)
		{
			this.life= 0;
		}
		System.out.println(this.name + " has "+ this.life + " points remaining!");
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
