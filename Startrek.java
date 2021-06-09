public class Startrek
{
//some of the variables used
private String name;//get name of a Star Trek character
private int years;// get years wit them 
private double rating;//gets rating 

//this is a for of a costructor 
public Startrek(String name,int years,double rating)
{
  this.name = name;//sets this 
  this.years = years;//sets this 
  this.rating = rating;//sets this 
}
//these are the getter ans setters

//A song that has acces to getter in Star Wars Class
public String Singalong(Starwars Wars)
{
  //returns part of this song 
  return "With a "+ Wars.getWeapon()+"on my hand and force on my side"+
        "\nI'll turn this tragegic Star Trek into dust"+
        "\nI give those forgotten Star Trek Fans a chance to be reborn"+
        "\nI hear their cries and allow to tranform to"+Wars.getRank()+","+ Wars.getName()+
        "\nSoon Star Trek will be destoryed,Soon its Star Wars time";
}

//This is the second part of the song 
public String toString()
{
  //this is returned agfter the first part og the song
  String output = name+",I will win and I will rise "+
      "\nAll of Star Trek Destroyed,all your"+years+"years of loyalty gone"+
      "\nNo more Star Trek and no more science"+
      "\nStar Wars will be number one,"+name;
      return output;//returns this
  }

}//end of the Startrek class 