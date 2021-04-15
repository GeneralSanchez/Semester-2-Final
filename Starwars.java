public abstract class Starwars
{
  //all the variables that are used
private String name;
private String rank;
private boolean hasfan;
private int ID;
private boolean hasside;
//overloaded costructors 
public Starwars(String name,String rank,boolean hasfan, int ID,boolean hasside)
{
  this.name= name;
  this.rank = rank;
  this.hasfan = hasfan;
  this.ID = ID;
  this.hasside = hasside;
}
//This is the getter and setter that can be used
public String getName()//getter
{
  return name;
}
public void setName(String name)//setter
{
  this.name = name;
}
public String getRank()//getter
{
  return name;
}
public void setRank(String rank)//setter
{
  this.rank = rank;
}
public boolean gethasFan()//getter
{
  return hasfan;
}
public void sethasFan(boolean hasfan)//setter
{
  this.hasfan = hasfan;
}
public int getID()//getter
{
  return ID;
}
public void setID(int ID)//setter
{
  this.ID = ID;
}
public boolean gethasSide()//getter
{
  return hasside;
}
public void sethasSide(boolean hasside)//setter
{
  this.hasside = hasside;
}
}
