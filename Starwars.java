//this is the parent class which is abstract
public abstract class Starwars
{
  //This is an abstract class
  //all the variables that are used
  private String name;//asks a name of character
  private String rank;//asks rank person wants
  private boolean isfan;//asks to see if they a fan
  private int ID;//asks random numbers
  private boolean hasside;//asks to see if they know force
  private String weapon;//ask for the weapont hey use
  //costructors (overloaded)
  public Starwars(String name,String rank,boolean isfan, int ID,boolean hasside,String weapon)
  {
    this.name= name;//sets to this 
    this.rank = rank;//set to this
    this.isfan = isfan;//set to this
    this.ID = ID;//set to this
    this.hasside = hasside;//set to this
    this.weapon = weapon;//set to this
  }
  //constructor to allow Army constructor to work
  public Starwars()
  {
    //set to something to make the work
    name = "nothing";
    rank = "none";
    isfan = false;
    ID = 0;
    hasside = false;
    weapon = "nada";
  }
  //all the getter and setters Starwars
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
    return rank;//return the rank
  }
  public void setRank(String rank)//setter
  {
   this.rank = rank;//sets it to rank
  }
  //This is the getter and setter for isfan
  public boolean getisFan()//getter
  {
    return isfan;//return the isfan
  }
  public void setisFan(boolean isfan)//setter
  {
    this.isfan = isfan;//sets it to isfan
  }
  //This is the getter and setter for ID 
  public int getID()//getter
  {
    return ID;//return the ID
  }
  public void setID(int ID)//setter
  {
    this.ID = ID;//sets it to ID
  }
  //This is the getter and setter for hasside
  public boolean gethasSide()//getter
  {
   return hasside;//return the hasside
  }
  public void sethasSide(boolean hasside)//setter
  {
   this.hasside = hasside;//sets it to hasside
  }
  //This is the getter and setter for weapon
  public String getWeapon()
  {
   return weapon;//return the weapon
  }
  public void setWeapon(String weapon)
  {
   this.weapon = weapon;//sets it to weapon
  }
  //end of all getters and setter in Starwars
  //This is a brain method
  public String dailyhate()
  {
   //return this message as daily dose of hate
   return name + ",know this being in the Star Trek side will only make things be worse. ";
  }
  //this is an abstarct method
  //can be accesses by the child zclasses
  public abstract String starcomment();
  //this creates an ID to the user to use 
  public String CreateUser()
  {
    String a = ""+ ID;
    String b = ""+ rank;
    return b+a;
  }
  //this organize the informationt that was inputted by the user

  public String toString()
    {
      //returns all of this
      return "Name: " + name +
        "\nRank: " + rank+
        "\nisFan: " + isfan+
        "\nID: " + ID +
        "\nhasSide: " + hasside;
    }
}//end of Starwars class
