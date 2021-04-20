public class Startrek
{
//some of the variables used
private String name;//String variable
private int years;// int variable
private double rating;// double variable
//these are the getter ans setters
public Startrek(String name)//sets name
{
  this.name = name;//sets this 
}
public Startrek (int years)//sets years
{
  this.years = years;//sets this 
}
public Startrek (double rating)//sets rating
{
  this.rating = rating;//sets this 
}
public String Singalong(Starwars Wars)
{
  return "With a "+ Wars.getWeapon()+"on my hand and force on my side"+
        "I'll turn this tragegic Star Trek into dust"+
        "I give those forgotten Star Trek Fans a chance to be reborn"+
        "I hear their cries and alllow to tranform to"+ Wars.getName()+
        "Soon Star Trek will be destoryed,Soon its Star Wars time";
}
public String toString()
{
  String output = name+",I will win and I will rise "+
      "All of Star Trek Destroyed "+
      "No more Star Trek and no more science"+
      "Star Wars will be number one";
      return output;
}


}