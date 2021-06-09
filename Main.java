import java.util.ArrayList;//to get the ArrayList working
import java.util.Scanner;
import javax.swing.JOptionPane;

class Main
{
  //static ArrayList<String> test;
  public static void main(String[] args) 
  {
     System.out.println ("Andy Sanchez, Semester 2 Final Project");
     //this is the introduction to the program
     System.out.println ("------- Star Wars------");
     System.out.println ("--- Andy's Bootcamp----");
     System.out.println ("Welcome to our Bootcamp");
     System.out.println ();//for space in console
     System.out.println ("If you are a Star Trek Fan you will go throught the Star Wars mind wash");
     System.out.println ("If you are Star Wars fan then don't worry kill out");
     System.out.println ("Let's Begin!");
    //this is the end of greating
     Scanner input = new Scanner(System.in);
    //The Arrays that are being used
    ArrayList<Startrek> Trek = new ArrayList<Startrek>();
    ArrayList<Starwars> Wars = new ArrayList<Starwars>();
    ArrayList<String> rename = new ArrayList<String>();
    //end of all arraylist available in main
    String name;
    double grade;
    boolean exit = false;
    System.out.println();
    Movies User = new Movies();
    
   
    //This everething for Star Trek Class
    String num1 = JOptionPane.showInputDialog("Enter Name of Star Trek Character");
    String num2 = JOptionPane.showInputDialog("Years with Star Trek be honest!");
    String num3 = JOptionPane.showInputDialog("What is the  rating you give Star Trek (1-100)");
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
      //Jedi variable used
      //this is used to get JOption working
      String nom1 = JOptionPane.showInputDialog("Are you in the counsel? Choose wisely! (true/false)");
      String nom2 = JOptionPane.showInputDialog("How much love do you show to your troops!(1-100)");
      //String to boolean 
      boolean parsedNom1 = Boolean.parseBoolean(nom1);
      //String to Integer (int)
      int parsedNom2 = Integer.parseInt(nom2);
      //this is how its filled 
      Jedi light = new Jedi (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,parsedNom1,parsedNom2);
      //added to the arraylist
      Wars.add(light);
      System.out.println ("Some remiders:");
      //to access the brain methods/overriden
      System.out.println (light.dailyhate());
      System.out.println ();//for space in console
      System.out.println (light.starcomment());
      System.out.println ();//for space in console
      System.out.println ("This is the list of Star Wars movies in alphabet order!");
      System.out.println ();//for space in console
      //acess the toString
      System.out.println (User.toString());
      //this is to get the user and ID 
      System.out.println ("You're ID is: "+ light.CreateUser());
      System.out.println ();//for space in console
      //A little small story
      System.out.println("You are really something choosing a Jedi name "+nam1+" and choosing your rank of "+ nam2+ "is amazing!");
      System.out.println ("The clone wars was raging and the use of the" + nam6+ "of the Jedi helped to defeat it");
      System.out.println("The Jedi showed us"+parsedNom2+"amount of love making us all win the war,even when I lost my brothers");
      //end of the story
    }//end of if 
    else if (Way.equalsIgnoreCase("Sith"))
    {
      //Sith variables used
      //these are for the JOption
      String nim1 = JOptionPane.showInputDialog("Which powers do you get as a Sith");
      String nim2 = JOptionPane.showInputDialog("Which order will you give ,give the number!");
      //this changes String to int(Integer)
      int parsedNim2 = Integer.parseInt(nim2);
      //this is how its filled
      Sith dark = new Sith (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,nim1,parsedNim2);
      //added to the arraylist
      Wars.add(dark);
      System.out.println("Some remiders:");
      //to access the brain methods/overriden
      System.out.println (dark.dailyhate());
      System.out.println ();//for space in console
      //to access the brain methods
      System.out.println (dark.starcomment());
      System.out.println ();//for space in console
      System.out.println("This is the list of Star Wars movies in alphabet order!");
      //acess the toString
      System.out.println(User.toString());
      //this is to get the user and ID 
      System.out.println ("You're ID is: "+dark.CreateUser());
      System.out.println ();//for space in console
      //A little small story
      System.out.println("You are really something choosing a Sith name"+nam1+" and choosing your rank of "+ nam2+ "is amazing!");
      System.out.println ("The clone wars was raging and the use of the" + nam6+ "of the Sith where behind it");
      System.out.println ("There powers of "+nim2+"was a unnatural,but they made us murder our Jedi using order"+parsedNim2+".They made us murder us,why?");
      //end of the story
    }//end of if else
    else 
    {
      //This is for the Army side variables
      //all messages that are shown in JPane
      String nem1 = JOptionPane.showInputDialog("Enter the name of the Army that you like from Star Wars any era ");
      String nem2 = JOptionPane.showInputDialog("Enter the year that army is from!");
      String nem3 = JOptionPane.showInputDialog("Enter the ship from that army that you love");
      //changes String to Double
      double parsedNem2 = Double.parseDouble (nem2);
      //this is how it gets filled
      Army universe = new Army (nam1,nam2,parsedNam3,parsedNam4,parsedNam5,nam6,nem1,parsedNem2,nem3);
      //adds it to the arraylist
      Wars.add(universe);
      System.out.println("Some remiders:");
      //to access the brain methods/overriden
      System.out.println (universe.dailyhate());
      System.out.println ();//for space in console
      //to access the brain methods
      System.out.println (universe.starcomment());
      System.out.println ();//for space in console
      System.out.println("This is the list of Star Wars movies in alphabet order!");
      //acess the toString
      System.out.println(User.toString());
      //this is to get the user and ID 
      System.out.println ("You're ID is: "+ universe.CreateUser());
      System.out.println ();//for space in console
      //A little small story
      System.out.println ("You are really something choosing"+ nem1+ "as your army and "+nam1+" as your name and choosing your rank of "+ nam2+ "is amazing!");
      System.out.println ("We had coutless battles insde our ship"+nem3+"winning every time that we could!");
      System.out.println ("The war took down many of our ships,but we could never fail as for guns where warm each time seeing space brought a beutiful scene");
      //end of the story
    }//end of else
    System.out.println ();//for space
    //this print to of the arraylists
    for (Startrek i: Trek)//Trek arraylist
    {
      for(Starwars j: Wars)//Wars arraylist
      {
      System.out.println(i);//prints it here
      System.out.println();//for extra line
      System.out.println(evil.Singalong(j));//prints
      System.out.println();//for extra line
      System.out.println (i);//pritn it her
      System.out.println();//for extra line
      }//end of inner for loop
    }//end of outer for loop
    //this needs to be passes to get here
    if (parsedNam3 == false || parsedNum3 > 75)
    {
      //this is needed to get the right line
       System.out.println("Just hit enter once in the beggining");
    while(exit == false)//until true it will stop
      {
        input.nextLine();//to clear the buffer
        System.out.println ("Enter the name of the Star Wars Movies");//ask to what can be used
        //this gets the input from user
        name = input.nextLine();
        System.out.println("Enter a number grade for the movies");//this is mesage
        //asks for the input to be inputted
        grade = input.nextDouble();
        //enter the Movies class
        String sometmp = User.Order(name,grade);
          if (!sometmp.isEmpty())//the condition
           {
              rename.add(sometmp);//adds it to arraylist
           }//end of if 
        System.out.println("Keep saying false until you finish");//to be aware at that time
        exit = input.nextBoolean();//ask for t/f to continue
      }//end of file 
    
      System.out.println ();
      //for each that print arraylist rename
      for (String i : rename)//makes copy
      {
        System.out.println (i);//prints i 
      }
   }
    //this is what is enetered inside the method
    System.out.println (memorablending("It has been some two amazing years in my CS classes,and as such good things they must come to an end to ealy, It has been a privillage and honor having my teacher who I nicknamed Empress,eventhough she liked Star Trek. I will miss her a lot because she is one of the teachers you will never forget in you life. As Jedi Master Ima-Gun Di said,Lets make the end memoreable! "));
    //this is what is entere int he method
    System.out.println (memorablending ("May the force be with you!"));
   }
   //this method is to honor someone
   public static String memorablending(String comment)
    {
      //this is the changes that happen
      String a = comment.toUpperCase().replace ("A","@");
      return a;//return this
    }//end of memorableending
}//end of main
