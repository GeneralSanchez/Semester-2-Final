public class Startrek
{
//some of the variables used
private String name;//String variable
private int years;// int variable
private double rating;// double variable
//these are the getter ans setters
public Startrek(String name,int years,double rating)//sets name
{
  this.name = name;//sets this 
  this.years = years;//sets this 
  this.rating = rating;//sets this 
}


public String Singalong(Starwars Wars)
{
  return "With a "+ Wars.getWeapon()+"on my hand and force on my side"+
        "\nI'll turn this tragegic Star Trek into dust"+
        "\nI give those forgotten Star Trek Fans a chance to be reborn"+
        "\nI hear their cries and alllow to tranform to"+ Wars.getName()+
        "\nSoon Star Trek will be destoryed,Soon its Star Wars time";
}
public String toString()
{
  String output = name+",I will win and I will rise "+
      "\nAll of Star Trek Destroyed "+
      "\nNo more Star Trek and no more science"+
      "\nStar Wars will be number one";
      return output;
}


}