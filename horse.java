abstract class animal
{
	abstract public void dogsound();
	abstract public void lionsound();
	abstract public void horsesound();
}
abstract class dog extends animal
{
	public void dogsound()
	{
	System.out.println("The dog sound is Waaw Waaw");
	}	
}
abstract class lion extends dog
{
	public void lionsound()
	{
	System.out.println("The lion sound is Ooorrr Ooorrr");
	}

}
class horse extends lion
{
	public void horsesound()
	{
	System.out.println("The horse sound is Tuuuurrr Tuurrrr");
	}
	public static void main(String agrs[])
	{
		horse abs=new horse();
		abs.dogsound();
		abs.lionsound();
		abs.horsesound();		
	}

}


