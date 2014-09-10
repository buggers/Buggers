package buggers;


public enum Fight
{
   TO_DEATH (1000), ONCE(1), FIVE(5);
   
final private int fightRounds;

private Fight(int myval)
{
 this.fightRounds = myval;  
}

public boolean shouldContinue(final int counter)
{ if (counter < fightRounds)
	return true;
  else
	return false;

 }

}
