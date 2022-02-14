package CSSKL142.Lab6;

//necessary imports for file i/o
import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException; //this exception must be caught and handled when dealing with streams!         
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream
import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Diary here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diary {

  public static void main(String[] args) throws IOException {

    // Needed variables
    int mm = 0;
    int dd = 0;
    int yyyy = 0;
    boolean check = true;
    String prose = ""; // Empty string to read prose

    PrintWriter output = null;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the date as three integers separated by spaces (i.e mm dd yyyy) ");

    mm = keyboard.nextInt();
    dd = keyboard.nextInt();
    yyyy = keyboard.nextInt();

    System.out.println("Enter as many lines of prose you wish (for your to-do’s list or diary entry)");
    
    // Part 2: ask user for (mm dd yyyy) input,
    // print the date on diaryLog.txt, ask user to write their dairy entry
    // store entry in string prose and print it on diaryLog.txt,
    // then ask the user if they want to continue adding entries.
    // if so then loop, if not then stop.
    // START YOUR CODE HERE
    Scanner Skey = new Scanner(System.in);
    prose = Skey.nextLine();

    output = new PrintWriter(new FileOutputStream("F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\diaryLog.txt"));

    output.printf("Today is %d/%d/%d", mm,dd,yyyy);
    output.println();
    output.println(prose);
    output.println();

    while (check) {
      System.out.println("Hi, do you want to input any more entries? type 1 for true or 2 for false.");
      int checkLoop = Skey.nextInt();
      if (checkLoop == 1) {
        System.out.println("Enter the date as three integers separated by spaces (i.e mm dd yyyy) ");
        int mm1 = keyboard.nextInt();
        int dd1 = keyboard.nextInt();
        int yyyy1 = keyboard.nextInt();

        System.out.println("Enter the date as three integers separated by spaces (i.e mm dd yyyy) ");
        Scanner Jkey = new Scanner(System.in);
        String prose1 = Jkey.nextLine();

        output.printf("Today is %d/%d/%d", mm1,dd1,yyyy1);
        output.println();
        output.println(prose1);
        output.println();
      }
      else if (checkLoop == 2) {
        check = false;
      }
    }
    output.close();
  }
}
