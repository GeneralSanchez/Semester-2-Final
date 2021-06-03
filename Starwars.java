public abstract class Starwars
{
  //all the variables that are used
private String name;
private String rank;
private boolean isfan;
private int ID;
private boolean hasside;
private String weapon;
private int grade;
//overloaded costructors 
public Starwars(String name,String rank,boolean isfan, int ID,boolean hasside,String weapon)
{
  this.name= name;
  this.rank = rank;
  this.isfan = isfan;
  this.ID = ID;
  this.hasside = hasside;
  this.weapon = weapon;
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
public boolean getisFan()//getter
{
  return isfan;
}
public void setisFan(boolean isfan)//setter
{
  this.isfan = isfan;
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
public String getWeapon()
{
  return weapon;
}
public void setWeapon(String weapon)
{
  this.weapon = weapon;
}
public String dailyhate()
{
  return name + ",know this being in the Star Trek side will only make things be worse. ";
}
public abstract String starcomment();
public String CreateUser()
{
   String a = ""+ ID;
   String b = ""+ rank;
   return b+a;
}
public String toString()
{
return "Name: " + name +
      "\nRank: " + rank+
      "\nisFan: " + isfan+
      "\nID: " + ID +
      "\nhasSide: " + hasside;
}
}
