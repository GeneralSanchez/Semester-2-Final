public class Sith extends Starwars
{
  ///these are the set variables 
  private String powers;
  private int orders;
  //overloaded constructor that is used 
  public Sith (String name,String rank,boolean isfan, int ID,boolean hasside,String weapon,String powers,int orders)
  {
    super(name,rank,isfan,ID,hasside,weapon);
    this.powers = powers;
    this.orders = orders;
  }
  //all the getter and setters
  public String getPowers()//getter
  {
    return powers;
  }
  public void setPowers(String powers)//setters
  {
    this.powers = powers;
  }

  public int getOrders()//getter
  {
    return orders;
  }
  public void setOrders(int orders)//setters
  {
    this.orders = orders;
  }

   public String dailyhate()
    {
      return super.getName() + "We have the power of the darkside get forced choked by Darth Vader Trekies!";
    }

  public String starcomment()
  {
    return "You don't know the power of the Dark Side of the force!";
  }
  
  public String toString()
  {
     String output = super.toString();
     output += "\n Sith Power " +powers +
            "\nWhat are you're Orders " + orders;
    return output;
  }
}