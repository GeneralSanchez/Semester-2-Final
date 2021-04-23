import java.util.ArrayList;
import javax.swing.JOptionPane;
class Main 
{
  public static void main(String[] args) {
    System.out.println("Andy Sanchez, Semester 2 Final Project");
    ArrayList<Startrek> Trek = new ArrayList<Startrek>();
    ArrayList<Starwars> Wars = new ArrayList<Starwars>();
//Need to change this later
  String num1 = JOptionPane.showInputDialog("Enter first integer");
  String num2 = JOptionPane.showInputDialog("Enter first integer");
  String num3 = JOptionPane.showInputDialog("Enter first integer");

  Startrek evil = new Startrek (num3);
  Trek.add(num3);
  Wars.add(num1);
  Wars.add(num2);
  

  


    for (Startrek i: Trek)
    {
      for(Starwars j: Wars)
      {
       System.out.println(i);
      System.out.println(evil.Singalong(j));
      System.out.println (i);
      System.out.println();
      }
    }
  }
}
