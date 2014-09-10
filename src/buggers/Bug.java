/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buggers;



public class Bug
{
private int health, weight, strength, height;
private String name;

   public int getHealth()
   {
      return health;
   }
   public int getWeight()
   {
      return weight;
   }
   public int getStrength()
   {
      return strength;
   }
   public int getHeight()
   {
      return height;
   }
   public String getName()
   {
      return name;
   }


Bug (String bugName, int h, int w, int s)
{
   name = bugName;
health = h; weight = w; strength = s;
health = h*w*s;
}

@Override
public String toString()
{
 return name;  
}
public boolean isDead()
{ if (health <= 0)
	return true;
  else return false;

}

public int hurtMe(final int damage)
{
if (damage >= weight)
{	health -= (damage -weight);
	return (damage - weight);
}
else
	return 0;
}

public int iHit()
{
final int maxDam = 2 *(height+strength) - weight;

return (int) (Buggers.rand.nextDouble() * ( (double) maxDam) );
}


}
