import java.util.*;//this is to get the arralist working
//this is also out of paren-child classes
public class Movies
{
  //this is the Arraylist that is only for the Movies class
  ArrayList<String> names = new ArrayList<String>();
  //this holds all the list of the arraylist 
  public Movies ()
  {
    names.add ("Star Wars: The Phantom Menace");
    names.add ("Star Wars: Attack of the Clones");
    names.add ("Star Wars: Revenge of the Sith");
    names.add ("Star Wars: A New Hope");
    names.add ("Star Wars: The Empire Strikes Back");
    names.add ("Star Wars: Return of the Jedi");
    names.add ("Star Wars: The Force Awakens");
    names.add ("Star Wars: The Last Jedi");
    names.add ("Star Wars: The Rise of Skywalker");
    Movies.sort(names);//to get things sorted by the method
 }
//Order Methid check to see if the movies graded by the user
//are lower than what is expected by me 
//Also compares it to the arraylist inside of Movies
  public String Order (String some, double number)
  {
    for (int i = 0; i < names.size(); i++)
    {
        if (number <70)//this is the requiremets to pass
          {
            String list = names.get(i);//to get list
            //compares with the list in movies
            if (list.equalsIgnoreCase(some))//compare it
            {
              return list;//return this to the list
            }//end of inner if 
          }//emd of outer loop
            sort(names);//to access the other method
    }//end of the for loop
      return "" ;//this is when its null
  }//end of the Order method
//this method sorts the list in alpahbetical order 
//this only would work with the lsit in Main
  public static void sort (ArrayList<String>test)//parameter
  {
    String temp;//to hold the String
    //these are the for loops being used 
    for (int i = 0; i < test.size(); i++) 
      {
      for (int j = i + 1; j < test.size(); j++) 
        {
         if (test.get(i).compareTo(test.get(j)) > 0)
          {
            // this is used to do the  swapping
            //this swapping is for arraylists only
            temp = test.get(i);
            test.set(i, test.get(j));
            test.set(j, temp);  
           }//end of if
        }//end of inner if 
      }//end of outer for loop
  }//end of the sort method
//this prints the arraylist inside the main 
  public String toString()
  {
    String output = "";//to have space
    //for each to get it printed
    for (String m : names)
    {
      //this allows to format it
       output += m+"\n";
    }
    return output;//return this
  }
}//end of the Movies class


