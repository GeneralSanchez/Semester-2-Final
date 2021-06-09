//this is the child class of the parent class Starwars
public class Jedi extends Starwars
{
  //variables that are used
  private boolean incounsel;//this asks for t/f
  private int love;//this ask for a number
  //overloaded constructor
  public Jedi (String name,String rank,boolean isfan, int ID,boolean hasside,String weapon,boolean incounsel,int love)
  {
    //super to access what is inside Starwars class
    super(name,rank,isfan,ID,hasside,weapon);
    this.incounsel = incounsel;
    this.love = love;
  } 
  //this is the getters and the setters
  //getter and setter for incousel in Jedi class
  public boolean getCounsel()//getters
  {
    return incounsel;//returns
  }
  public void setCounsel(boolean incounsel)//setters
  {
    this.incounsel = incounsel;//sets it
  }
//getter and setter for love in Jedi class
  public int getLove()//getters
  {
    return love;//returns
  }
  public void setLove(int love)//setters
  {
    this.love = love;//sets it
  }
//end of all the getters and setter in Jedi class
//this is a brain method/ overriden method
//removes everthing inside what it was before
  public String dailyhate()
    {
      //this is the message that is sent
      return super.getName() + " Those Star Trek fans don't have us Jeid to keep the peace in the galaxy!";
    }
//this is added from the abstract class
  public String starcomment()
  {
    //return this amazing comment
    return "MAY THE FORCE BE WITH YOU";
  }
  //this is the toString
  public String toString()
  {
    //this return this organized information submited
    String output = super.toString();
    output += "\nIn the Jedi Counsel: " +incounsel+
              "\nLove level"+ love ;
             return output;//returns this

  }
}//end of the Jedi class