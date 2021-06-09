//this is the child class that has as parent Starwars 
public class Army extends Starwars
{
  //these are the variables
  private String type;//String varible
  private double year;//double variable
  private String ship;//String variable

  //over loaded constructor that is created
  public Army (String name,String rank,boolean isfan, int ID,boolean hasside,String weapon,String type,double year,String ship)
  {
    //super used to acess things in Starwars
    super(name,rank,isfan,ID,hasside,weapon);
    this.type = type;
    this.year = year;
    this.ship = ship;
  }
  //this is the constructor
  public Army(String type,String ship)//parameters
  {
    //set to each thing 
    this.type = type;
    this.year = 0;
    this.ship = ship;
  }
  //this is constructor
  public Army ()//empty
  {
    //all of these are set to nothing
    type = "nothing";
    year = 0;
    ship = "none";
  }
  //all getters and setter for the Army class
  //getters and setter for type in Army class
  public String getType()//getter
  {
    return type;//returns
  }
  public void setType(String type)//setter
  {
    this.type = type;//sets it
  }
//getters and setter for year in Army class
  public double getYear()//getter
  {
    return year;//returns
  }
  public void setYear(double year)//setter
  {
    this.year = year;//sets it
  }
//getters and setter for ship in Army class
  public String getShip()//getter
  {
    return ship;//returns
  }
  public void setShip(String ship)//setter
  {
    this.ship = ship;//sets it
  }
//end of all getters and setters in Army class
//this is brain method/overriden method
  public String dailyhate()
  {
    //this is replaced for what was here before
    return super.getName() + " We ha armies for everyones liking not like those science nerds";
  }
//this is getting filled of what was in abstract
  public String starcomment()
  {
    //this is the message that is set
    return "GOOD SOLDIERS FOLLOW ORDERS!";
  }
  //This is the toString that Shows the information that is printed out
  public String toString()
  {
    //this is set and organized for others to see
     String output = super.toString();//acess Starwars
     //this formatswhat is going to be returned
     output += "\nWhat army? " +type +
            "\nTime Period: " + year+
            "\nWhat ship?" + ship;
    return output;//return this
  }
}//this is the end of Army class