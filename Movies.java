//import java.util.ArrayList;
//Comment to check committing issue
import java.util.*;
public class Movies
{
 ArrayList<String> names = new ArrayList<String>();
 public Movies ()
 {
 names.add("Star Wars: The Phantom Menace");
 names.add ("Star Wars: Attack of the Clones");
 names.add ("Star Wars: Revenge of the Sith");
 names.add ("Star Wars: A New Hope");
 names.add ("Star Wars: The Empire Strikes Back");
 names.add ("Star Wars: Return of the Jedi");
 names.add ("Star Wars: The Force Awakens");
 names.add ("Star Wars: The Last Jedi");
 names.add ("Star Wars: The Rise of Skywalker");
 }

  public String temp;
  public String comment;

  public void Order ()
  {
for(int i = 0; i<n; i++)
        {
            String name = input.next();
            double grade = input.nextDouble();
            if (grade<70)
            {
                names.add(name);
            }
             sort(names);
  }
   public void sort (ArrayList<String>names)
    {
        for (int i = 0; i < names.size(); i++) 
  {
    for (int j = i + 1; j < names.size(); j++) 
    {
      if (names.get(i).compareTo(names.get(j)) > 0)
      {
       // swapping
        temp = names.get(i);
        names.set(i, names.get(j));
        names.set(j, temp);  
    }
  }
  }

  public String toString()
  {
    String output= Order();
    return output;
  }
}
  
//    System.out.println(
//          "The names in alphabetical order are: ");
//       for (int i = 0; i < n; i++) {
//              System.out.println(names.get(i));
//       }

// public String memorablending(String comment)
  // {
  // String a = comment.toUpperCase().replace ("A","@");
  // return a;
  // }
