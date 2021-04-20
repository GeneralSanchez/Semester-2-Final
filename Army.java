public class Army extends Starwars
{
  //these are the variables
private String type;//String varible
private double year;//double variable
private String ship;//String variable
//over loaded constructor that is created
public Army (String name,String rank,boolean hasfan, int ID,boolean hasside,String weapon,String type,double year,String ship)
{
  super(name,rank,hasfan,ID,hasside,weapon);
  this.type = type;
  this.year = year;
  this.ship = ship;
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
      return super.getName() + " We ha armies for everyone liking not like those science nerds";
    }
  public String starcomment()
  {
    return "GOOD SOLDIERS FOLLOW ORDERS!";
  }
  public String toString()
  {
     String output = super.toString();
     output += "\n What army? " +type +
            "\nTime Period: " + year+
            "\nWhat ship?" + ship;
    return output;
  }
}