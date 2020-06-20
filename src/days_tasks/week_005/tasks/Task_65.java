package days_tasks.week_005.tasks;

public class Task_65 {
      public static void main(String[] args) {
        calculateGrade(100,800,45);
    }

    public static void calculateGrade(int a,int b, int c){
          int avarage = (a+b+c)/3;
          if (avarage<60){
              System.out.println("F");
          }
          else if (avarage < 70){
              System.out.println("D");
          }
          else if (avarage <80){
              System.out.println("C");
          }
          else if (avarage < 90){
              System.out.println("B");
          }
          else if (avarage <= 100){
              System.out.println("A");
          }
          else System.out.println("Hatalı giriş yaptınız");
    }
}
