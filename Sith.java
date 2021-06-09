///this is a child of Starwars
public class Sith extends Starwars
{
  ///these are the set variables 
  private String powers;//asks for power
  private int orders;//asks for the order given

  //overloaded constructor that is used 
  public Sith (String name,String rank,boolean isfan, int ID,boolean hasside,String weapon,String powers,int orders)
  {
    //super used to access the parent variables
    super(name,rank,isfan,ID,hasside,weapon);
    this.powers = powers;//makes it equal
    this.orders = orders;//makes it equal
  }
  //all the getter and setters
  //getter and setter for powers in Sith class
  public String getPowers()//getter
  {
    return powers;//returns
  }
  public void setPowers(String powers)//setters
  {
    this.powers = powers;//sets it
  }
//getter and setter for orders in Sith class
  public int getOrders()//getter
  {
    return orders;//returns
  }
  public void setOrders(int orders)//setters
  {
    this.orders = orders;//sets it
  }
//end of all the getter and setter in Sith class
//this is the ovverriden method that gets changed 
   public String dailyhate()
    {
      //this gets changed from the one in Starwars class
      return super.getName() + "We have the power of the darkside get forced choked by Darth Vader Trekies!";
    }
//this fills what used to be abstract
  public String starcomment()
  {
    //this gets returned
    return "You don't know the power of the Dark Side of the force!";
  }
  //this is the toString that gets returned
  public String toString()
  {
    //returns everthing formated to see what is turned in
     String output = super.toString();
     output += "\nSith Power " +powers +
              "\nWhat are you're Orders " + orders;
    return output;
  }
}//end of the Sth Class