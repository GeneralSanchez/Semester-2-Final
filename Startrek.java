//outside of the parent-child relationship
public class Startrek
{
  //some of the variables used
  private String label;//get name of a Star Trek character
  private int time;// get years wit them 
  private double rating;//gets rating 

  //this is a for of a costructor 
  public Startrek(String label,int time,double rating)
  {
    this.label = label;//sets this 
    this.time = time;//sets this 
    this.rating = rating;//sets this 
  }
  //these are the getter and setters
  //getter and setters for names in Startrek
  public String getLabel()//getter
  {
    return label;//returns
  }
  public void setNames(String label)//setter
  {
    this.label = label;//sets it
  }
  //getter and setters for years in Startrek
  public int getTime()//getter
  {
    return time;//returns
  }
  public void setTime (int time)//seter
  {
    this.time = time;//sets it
  }
  //getter and setters for rating in Startrek
  public double getRating()//getter
  {
    return rating;//returns
  }
  public void setRating(double rating)//seter
  { 
    this.rating = rating;//sets it
  }
  //end of getter and setters
  //A song that has acces to getter in Star Wars Class
  //Not a parent-child relationship (to make clear)
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
      String output = label+",I will win and I will rise "+
       "\nAll of Star Trek Destroyed,all your"+time+"years   of loyalty gone"+
        "\nNo more Star Trek and no more science"+
        "\nStar Wars will be number one,"+label;
        return output;//returns this
    }

}//end of the Startrek class 