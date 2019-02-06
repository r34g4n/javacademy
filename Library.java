import java.util.HashMap;

class Library{
  
  public Library(){
    
  }
  public void getFinishedBooks(HashMap<String, Boolean> library){
    if (library.size() < 1){
      System.out.println("Error! library is empty!");
    }
    else{
      System.out.println("*****************");
      System.out.println("Finished books are:");
      for (String book : library.keySet()){
        if(library.get(book)){
          System.out.println(book);
        }
      }
      System.out.println("*****************");
    }
  }
  
  public void getUnfinishedBooks(HashMap<String, Boolean> library){
    if (library.size() < 1){
      System.out.println("Error! library is empty!");
    }
    else{
      System.out.println("*****************");
      System.out.println("Unfinished books are:");
      for (String book : library.keySet()){
        if(!(library.get(book))){
          System.out.println(book);
        }
      }
      System.out.println("*****************");
    }
  }
  
  public static void main(String[] args){
    
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnfinishedBooks(myBooks);
  }
}