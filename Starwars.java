public abstract class Starwars
{
  //all the variables that are used
private String name;//gets a name of character
private String rank;//gets rank person wants
private boolean isfan;//check to see if they a fan
private int ID;//gets random numbers
private boolean hasside;//checks to see if they know force
//costructors 
public Starwars(String name,String rank,boolean isfan, int ID,boolean hasside,String weapon)
{
  this.name= name;
  this.rank = rank;
  this.isfan = isfan;
  this.ID = ID;
  this.hasside = hasside;
  this.weapon = weapon;
}

//This is the getter and setter for Name
public String getName()//getter
{
  return name;//return the name
}
public void setName(String name)//setter
{
  this.name = name;//sets it to name
}
//This is the getter and setter for Rank
public String getRank()//getter
{
  return rank;//return the name
}
public void setRank(String rank)//setter
{
  this.rank = rank;
}

public boolean getisFan()//getter
{
  return isfan;//return the name
}
public void setisFan(boolean isfan)//setter
{
  this.isfan = isfan;
}

public int getID()//getter
{
  return ID;//return the name
}
public void setID(int ID)//setter
{
  this.ID = ID;
}

public boolean gethasSide()//getter
{
  return hasside;//return the name
}
public void sethasSide(boolean hasside)//setter
{
  this.hasside = hasside;
}

public String getWeapon()
{
  return weapon;//return the name
}
public void setWeapon(String weapon)
{
  this.weapon = weapon;
}
//This is a brain method
public String dailyhate()
{
  return name + ",know this being in the Star Trek side will only make things be worse. ";
}
//this is an abstarct method
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
