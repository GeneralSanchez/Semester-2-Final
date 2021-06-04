import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Main
{
  //static ArrayList<String> test;
  public static void main(String[] args) 
  {
    System.out.println("Andy Sanchez, Semester 2 Final Project");
    
     Scanner input = new Scanner(System.in);
    //The Arrays that are being used
    ArrayList<Startrek> Trek = new ArrayList<Startrek>();
    ArrayList<Starwars> Wars = new ArrayList<Starwars>();
    ArrayList<String> rename = new ArrayList<String>();
    String name;
    double grade;
    boolean exit = false;
    System.out.println();
    Movies User = new Movies();
    
   
//This everething for Star Trek Class
  String num1 = JOptionPane.showInputDialog("Enter Name of Star Trek Character");
  String num2 = JOptionPane.showInputDialog("Years with Star Trek be honest!");
  String num3 = JOptionPane.showInputDialog("What is the rating you give Star Trek (1-100)");
  int parsedNum2 = Integer.parseInt(num2);
  double parsedNum3 = Double.parseDouble(num3);
  Startrek evil = new Startrek (num1,parsedNum2,parsedNum3);
  Trek.add(evil);

//This is all the user inputs from the parent class which will be reused in the children classes
  String nam1 = JOptionPane.showInputDialog("Enter a Star Wars Character Name!");
  String nam2 = JOptionPane.showInputDialog("Enter a Star Wars Rank!ex.Captain, General,etc.");
  String nam3 = JOptionPane.showInputDialog("Are you a fan STar Wars (true/false");
  String nam4 = JOptionPane.showInputDialog("Enter in a random ID with numbers");
  String nam5 = JOptionPane.showInputDialog("Have you thought about being in the dark or light side Star Wars (true/false)");
  String nam6 = JOptionPane.showInputDialog("Namer the weapon you gonna use");
  boolean parsedNam3 = Boolean.parseBoolean (nam3);
  int parsedNam4 = Integer.parseInt(nam4);
  boolean parsedNam5 = Boolean.parseBoolean (nam5);

//to choose which one they use
String Way = JOptionPane.showInputDialog("Choose Wisely: Jedi,Sith,or Army");
  

if (Way.equalsIgnoreCase("Jedi"))
{
  //Jedi varibale used
  String nom1 = JOptionPane.showInputDialog("Are you in the counsel? Choose wisely! (true/false)");
  String nom2 = JOptionPane.showInputDialog("How much love do you show to your troops!(1-100)");
  boolean parsedNom1 = Boolean.parseBoolean(nom1);
  int parsedNom2 = Integer.parseInt(nom2);
  Jedi light = new Jedi (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,parsedNom1,parsedNom2);
  Wars.add(light);
  System.out.println("Some remiders:");
  System.out.println (light.dailyhate());
  System.out.println (light.starcomment());
  System.out.println("This is the list of Star Wars movies in alphabet order!");
  System.out.println(User.toString());
}
else if (Way.equalsIgnoreCase("Sith"))
{
  //Sith variables used
  String nim1 = JOptionPane.showInputDialog("Which powers do you get as a Sith");
  String nim2 = JOptionPane.showInputDialog("Which order will you give ,give the number!");
  int parsedNim2 = Integer.parseInt(nim2);
  Sith dark = new Sith (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,nim1,parsedNim2);
  Wars.add(dark);
  System.out.println("Some remiders:");
  System.out.println (dark.dailyhate());
  System.out.println (dark.starcomment());
  System.out.println("This is the list of Star Wars movies in alphabet order!");
  System.out.println(User.toString());
}
else 
{
  //This is for the Army side variables
  String nem1 = JOptionPane.showInputDialog("Enter the name of the Army that you like from Star Wars any era ");
  String nem2 = JOptionPane.showInputDialog("Enter the year that army is from!");
  String nem3 = JOptionPane.showInputDialog("Enter the ship from that army that you love");
  double parsedNem2 = Double.parseDouble (nem2);
  Army universe = new Army (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,nem1,parsedNem2,nem3);
  Wars.add(universe);
  System.out.println("Some remiders:");
  System.out.println (universe.dailyhate());
  System.out.println (universe.starcomment());
  System.out.println("This is the list of Star Wars movies in alphabet order!");
  System.out.println(User.toString());
}
    for (Startrek i: Trek)
    {
      for(Starwars j: Wars)
      {
      System.out.println(i);
      System.out.println();
      System.out.println(evil.Singalong(j));
      System.out.println();
      System.out.println (i);
      System.out.println();
      }
    }
    if (parsedNam3 == false || parsedNum3 > 75)
    {
       System.out.println("Just hit enter once in the beggining");
    while(exit == false)
      {
        input.nextLine();
        System.out.println ("Enter the name of the Star Wars Movies");
        name = input.nextLine();
        System.out.println("Enter a number grade for the movies");
        grade = input.nextDouble();
        String sometmp = User.Order(name,grade);
          if (!sometmp.isEmpty())
           {
              rename.add(sometmp);
           }
        System.out.println("Keep saying false until you finish");
        exit = input.nextBoolean(); 
      }
    
      System.out.println ();
      for (String i : rename)
      {
        System.out.println (i);
      }
   }
    
    System.out.println (memorablending("It has been some two amazing years in my CS classes,and as such good things they must come to an end to ealy, It has been a privillage and honor having my teacher who I nicknamed Empress,eventhough she liked Star Trek. I will miss her a lot because she is one of the teachers you will never forget in you life. As Jedi Master Ima-Gun Di said,Lets make the end memoreable! "));
    System.out.println (memorablending ("May the force be with you!"));
   }
   public static String memorablending(String comment)
    {
    String a = comment.toUpperCase().replace ("A","@");
    return a;
    }
}
