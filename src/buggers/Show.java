
package buggers;
import static buggers.Buggers.*;

public class Show
{
   static public void attack(Bug attacker, Bug defender, final int damage)
{ //Shows this on the screen
 System.out.println("The " + attacker.getName() + " " +getAttackWord() +
         " the " + defender.getName() + " for " + damage + " doohickeys.");
 if (defender.isDead())
 {   System.out.println("The poor " + defender.getName() + " is dead.");
     System.out.println("The victorious " + attacker.getName() + " has "
             + attacker.getHealth()
             + " doohickeys left.");
 }
}
   


   
   
   static String getAttackWord()
   { final int index = (int)  (   rand.nextDouble() *  (double) attackWords.length);
      return  attackWords[index];
      
   }
   
   
   static public final String [] attackWords = /*new String[]*/
   {"bashed", "stomped",
      "spit", "hit", "whacked", "crushed", "kicked", "pushed", "touched",
      "egged", "threw", "head butted", "drop kicked", "glared at"};
   
}
