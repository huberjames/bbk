// class Main {
//   public static void main(String[] args) {
//     int num = 5;
// System.out.println(num);
// num = num + 2;
// System.out.println(num);
// num = num / 3 * 6;
// System.out.println(num);
// System.out.println(7 + 15 % 4);
// num = 24 / 3 / 4;
// System.out.println(num);
// num = 24 / (num / 4);
// System.out.println(num);
//   }
// }


// s.substring() is like splicing in Python

// if syntax = if (variable == whatever it is) {
//     statement;
// }

// parsing string to integers use Integer.parseInt()

// There is an additional method called compareTo() in Java
// if (s.compareTo(t) < 0), where s and t are strings, means “If s comes before t in alphabetical order”.
// standard operators work the same though

// if / else basically works the same, see example:
// if (examMark >= 50) {
// System.out.println("A satisfactory result!");
// } else {
// System.out.println("Sorry, you have failed.");
// }

// elif in python = else if in Java

// for multiple conditions within conditional statements, use || to represent 'or'


// Exercise B from if statements
class Main {
  public static void main(String[] args) {
  int salary_1, salary_2;
    String s1, s2;
    System.out.print("First salary: ");
    s1 = System.console().readLine();
    salary_1 = Integer.parseInt(s1);
    
    System.out.print("Second salary: ");
    s2 = System.console().readLine();
    salary_2 = Integer.parseInt(s2);
    if (salary_1 + salary_2 > 40000) {
      System.out.print("Yep, more money for Liz");
    } else {
      System.out.print("nope, Kwasi sad :(");
    }
    }
  
  
  
  }