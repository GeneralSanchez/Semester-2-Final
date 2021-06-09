public class Army extends Starwars
{
  //these are the variables
private String type;//String varible
private double year;//double variable
private String ship;//String variable

//over loaded constructor that is created
public Army (String name,String rank,boolean isfan, int ID,boolean hasside,String weapon,String type,double year,String ship)
{
  super(name,rank,isfan,ID,hasside,weapon);
  this.type = type;
  this.year = year;
  this.ship = ship;
}
public Army(String type,String ship)
{
  this.type = type;
  this.year = 0;
  this.ship = ship;
}
public Army ()
{
  type = "nothing";
  year = 0;
  ship = "none";
}

//getter and setters that are ser
public String getType()//getter
{
  return type;
}
public void setType(String type)//setter
{
  this.type = type;
}

public double getYear()//getter
{
  return year;
}
public void setYear(double year)//setter
{
  this.year = year;
}

public String getShip()//getter
{
  return ship;
}
public void setShip(String ship)//setter
{
  this.ship = ship;
}

  public String dailyhate()
    {
      return super.getName() + " We ha armies for everyones liking not like those science nerds";
    }

  public String starcomment()
  {
    return "GOOD SOLDIERS FOLLOW ORDERS!";
  }
//This is the toString that Shows the information that is printed out
  public String toString()
  {
     String output = super.toString();//acess Starwars
     //this formatswhat is going to be returned
     output += "\n What army? " +type +
            "\nTime Period: " + year+
            "\nWhat ship?" + ship;
    return output;
  }
}