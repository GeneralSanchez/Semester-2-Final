import java.util.*;
public class Movies
{
 public String comment;
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

public String Order (String some, double number)
{
for (int i = 0; i < names.size(); i++)
  {
            if (number <70)
            {
              String list = names.get(i);
              if (list.equalsIgnoreCase(some))
              {
                return list; 
              }
            }
             sort(names);
  }
  return "" ;
}

public static void sort (ArrayList<String>test)
{
  String temp;
for (int i = 0; i < test.size(); i++) 
  {
    for (int j = i + 1; j < test.size(); j++) 
    {
      if (test.get(i).compareTo(test.get(j)) > 0)
      {
       // swapping
        temp = test.get(i);
        test.set(i, test.get(j));
        test.set(j, temp);  
      }
    }
  }
}

  public String toString()
  {
    String output = "";
    for (String m : names)
    {
       output += m+"\n";
    }
    return output;
  }
}


