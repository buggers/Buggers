package buggers;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;



public class Buggers

{
   public final static Random rand = new SecureRandom();
   
   static public void main (String []args)
   {//Bug (String bugName, int h (mm), int weight (grams), int strength (ant is 15 )
    Bug rabbit = new Bug("rabbit", 2400, 15, 500);
    Bug centipede = new Bug("centipede", 5, 2, 40);
    Bug ant = new Bug("ant", 3, 1, 15);
    Bug spider = new Bug("spider", 7, 1, 20);
    int roundNumber = 1;
    ArrayList<Bug> fighters = new ArrayList<Bug>();
    fighters.add(ant);
    fighters.add(centipede);
    
    System.out.println("Round " + roundNumber++ + ": " + fighters.get(0)
            + " vs. " + fighters.get(1) + ".");
    System.out.println("FIGHT!");
    fight (fighters.get(0), fighters.get(1), Fight.TO_DEATH);
    
    fighters.clear();
    fighters.add(spider);
    fighters.add(centipede);
    
        System.out.println("Round " + roundNumber++ + ": " + fighters.get(0)
            + " vs. " + fighters.get(1) + ".");
    System.out.println("FIGHT!");
    fight (fighters.get(0), fighters.get(1), Fight.TO_DEATH);
    
    fighters.clear();
    fighters.add(rabbit);
    fighters.add(centipede);
      
            System.out.println("Round " + roundNumber++ + ": " + fighters.get(0)
            + " vs. " + fighters.get(1) + ".");
    System.out.println("FIGHT!");
    fight (fighters.get(0), fighters.get(1), Fight.TO_DEATH);
    
   }
   
   
   
static void fight (Bug aBug, Bug otherBug, Fight fightType)
{ if ( (aBug.isDead()) || (otherBug.isDead()) )
	return;

ArrayList<Bug> fighters = new ArrayList<Bug>();
boolean deadBug = false;

 if (rand.nextDouble() >= 0.5)
{ fighters.add(aBug); fighters.add(otherBug); }
else
{ fighters.add(otherBug); fighters.add(aBug);
}

int fightCounter = 0;
int damage;
while (fightType.shouldContinue(fightCounter) && !deadBug)
{	damage = fighters.get(0).hurtMe(fighters.get(1).iHit() );
	Show.attack(fighters.get(1), fighters.get(0), damage);
	if (fighters.get(0).isDead())
		{deadBug = true; continue; }

	damage = fighters.get(1).hurtMe(fighters.get(0).iHit() );
	Show.attack(fighters.get(0), fighters.get(1), damage);
	if (fighters.get(1).isDead())
		{deadBug = true; continue; }

}


}












}