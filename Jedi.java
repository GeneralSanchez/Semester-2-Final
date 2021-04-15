public class Jedi extends Starwars
{
  //variables that are used
  private boolean counsel;
  private int love;
  //overloaded constructor
  public Jedi (String name,String rank,boolean hasfan, int ID,boolean hasside,boolean counsel,int love)
  {
    super(name,rank,hasfan,ID,hasside);
    this.counsel = counsel;
    this.love = love;
  } 
  //this is the getters and the setters
  public boolean getCounsel()//getters
  {
    return counsel;
  }
  public void setCousel(boolean counsel)//setters
  {
    this.counsel = counsel;
  }
  public int getLove()//getters
  {
    return love;
  }
  public void setLove(int love)//setters
  {
    this.love = love;
  }
}