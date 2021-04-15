public class Sith extends Starwars
{
  ///these are the set variables 
  private String powers;
  private int orders;
  //overloaded constructor that is used 
  public Sith (String name,String rank,boolean hasfan, int ID,boolean hasside,String powers,int orders)
  {
    super(name,rank,hasfan,ID,hasside);
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
}