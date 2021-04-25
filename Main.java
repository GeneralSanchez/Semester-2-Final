import java.util.ArrayList;
import javax.swing.JOptionPane;
class Main 
{
  public static void main(String[] args) {
    System.out.println("Andy Sanchez, Semester 2 Final Project");
    System.out.println();
    //The Arrays that are being used
//     ArrayList<Startrek> Trek = new ArrayList<Startrek>();
//     ArrayList<Starwars> Wars = new ArrayList<Starwars>();
// //This everething for Star Trek Class
//   String num1 = JOptionPane.showInputDialog("Enter Name of Star Trek Character");
//   String num2 = JOptionPane.showInputDialog("Years with Star Trek be honest!");
//   String num3 = JOptionPane.showInputDialog("What is the rating you give Star Trek");
//   int parsedNum2 = Integer.parseInt(num2);
//   double parsedNum3 = Double.parseDouble(num3);
//   Startrek evil = new Startrek (num1,parsedNum2,parsedNum3);
//   Trek.add(evil);
// //This is all the user inputs from the parent class which will be reused in the children classes
//   String nam1 = JOptionPane.showInputDialog("Enter a Star Wars Character Name!");
//   String nam2 = JOptionPane.showInputDialog("Enter a Star Wars Rank!");
//   String nam3 = JOptionPane.showInputDialog("Are you a extrmist fan");
//   String nam4 = JOptionPane.showInputDialog("Enter in a random ID with numbers");
//   String nam5 = JOptionPane.showInputDialog("Have you thought about being in any side is Star Wars");
//   String nam6 = JOptionPane.showInputDialog("Namer the weapon you gonna use");
//   boolean parsedNam3 = Boolean.parseBoolean (nam3);
//   int parsedNam4 = Integer.parseInt(nam4);
//   boolean parsedNam5 = Boolean.parseBoolean (nam5);
//   //This is for the light side variables
//   String nem1 = JOptionPane.showInputDialog("Enter the Army that you like from Star Wars1");
//   String nem2 = JOptionPane.showInputDialog("Enter the year that army is from!");
//   String nem3 = JOptionPane.showInputDialog("Enter the ship from that army that you love");
//   double parsedNem2 = Double.parseDouble (nem2);

//   //Jedi light = new Jedi (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6);
//   //Sith dark = new Sith (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6);
//   Army universe = new Army (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,nem1,parsedNem2,nem3);
//   Wars.add(universe);



//     for (Startrek i: Trek)
//     {
//       for(Starwars j: Wars)
//       {
//       System.out.println(i);
//       System.out.println();
//       System.out.println(evil.Singalong(j));
//       System.out.println();
//       System.out.println (i);
//       System.out.println();
//       }
//     }
    System.out.println (memorablending ("May the force be with you!"));
    System.out.println (memorablending("It has been some two amazing years in my CS classes,and as such good things they must come to an end to ealy "));
  }
  public static String memorablending(String comment)
  {
  String a = comment.toUpperCase().replace ("A","@");
  return a;
  }
}
