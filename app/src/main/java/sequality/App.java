/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  String str;

  public App(String str) {
    this.str = str;
  }

  public String getGreeting() {
    return "";
  }

  public static void main(String[] args) {
    Calculate c = new Calculate();

    System.out.println(new App("Hello World").getGreeting());
    System.out.println(new App("Sum of 2 and 3 is" + c.sum(2, 3) + ". Average is 2.5.").getGreeting());

    int sumfor = 0;
    for (int i = 1; i <= 10; i++) {
      sumfor = c.sum(sumfor, i);
    }
    System.out.println(new App("Sum of 1 to 10 is " + sumfor + ". Average is 5.5.").getGreeting());

    int sumodd = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0)
        sumodd = c.sum(sumodd, i);
    }
    System.out.println(new App("Sum of odd of 1 to 10 is  " + sumodd + ". Sum of even is 30.").getGreeting());
  }
}
