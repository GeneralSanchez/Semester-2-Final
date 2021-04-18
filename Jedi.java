public class Jedi extends Starwars
{
  //variables that are used
  private boolean incounsel;
  private int love;
  //overloaded constructor
  public Jedi (String name,String rank,boolean hasfan, int ID,boolean hasside,boolean incounsel,int love)
  {
    super(name,rank,hasfan,ID,hasside);
    this.incounsel = incounsel;
    this.love = love;
  } 
  //this is the getters and the setters
  public boolean getCounsel()//getters
  {
    return incounsel;
  }
  public void setCounsel(boolean incounsel)//setters
  {
    this.incounsel = incounsel;
  }
  public int getLove()//getters
  {
    return love;
  }
  public void setLove(int love)//setters
  {
    this.love = love;
  }
  public String toString()
  {
    String output = super.toString();
    output += "\nIn the Jedi Counsel: " +incounsel+
            "\nLove level"+ love ;
            return output;

  }
}