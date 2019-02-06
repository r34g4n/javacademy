import java.util.ArrayList;

class GradeAnalyzer{
  public GradeAnalyzer(){
    
  }
  public float getAverage(ArrayList<Integer> grades){
    if (grades.size() < 0){
      System.out.println("grades list provided is empty!");
      return 0;
    }
    else{
      float sum = 0;
      for (Integer grade : grades){
        sum += grade;
      }
      float average = sum / (grades.size());
      System.out.println(average);
      /*comment out print statement if
      you're only interested in return*/
      return average;
    }
  }
  public static void main(String[] args){
    
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
  }
}