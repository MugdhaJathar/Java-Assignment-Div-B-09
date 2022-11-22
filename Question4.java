import java.util.ArrayList;

public class Question4 {

  private ArrayList<String> names;

  public Question4() {
    names = new ArrayList<String>();
  }

  public void add(String name) {
    name = name.toUpperCase();
    names.add(name);
    System.out.println(name+" Added!");
  }

  public void remove(String name) {
    name = name.toUpperCase();
    if 
      (names.remove(name)) System.out.println(name+"Removed!"); 
    else 
      System.out.println("Not found name " + name);
  }

  public int size() {
    return names.size();
  }

  public void printNames() {
    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      String vowels = "";
      String duplicates = "";
      
      for (int j = 0; j < name.length(); j++) {
        char c = name.charAt(j);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
          if (vowels.indexOf(c) == -1) vowels += ", " + c;
        }

        for (int k = 0; k < j; k++) {
          if 
            (duplicates.indexOf(c) == -1 && name.charAt(k) == c) duplicates +=", " + c;
        }
      }

      if 
        (vowels.equals("") && duplicates.equals("")) System.out.println(name.toLowerCase());
      else if 
        (vowels.equals("")) System.out.println("The name " +name +" has the following duplicate character(s): " +duplicates.substring(2));
      else if 
        (duplicates.equals("")) System.out.println("The name " +name +" contains vowels, and the vowels are: " +vowels.substring(2)); 
      else 
        System.out.println("The name " + name + " contains vowels and has duplicate characters");
    }
  }

  public static void main(String[] args) {

    Question4 list = new Question4();
    
    list.add("EMMA");
    list.add("LARISSA");
    list.add("PETER");
    list.add("SKY");
    list.add("ANNABELLA");
    list.add("MICHAEL");
    
    System.out.println("List has " + list.size() + " names");
    
    list.printNames();
  }
}
