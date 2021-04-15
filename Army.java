public class Army extends Starwars
{
  //these are the variables
private String type;//String varible
private double year;//double variable
private String ship;//String variable
//over loaded constructor that is created
public Army (String name,String rank,boolean hasfan, int ID,boolean hasside,String type,double year,String ship)
{
  super(name,rank,hasfan,ID,hasside);
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
}