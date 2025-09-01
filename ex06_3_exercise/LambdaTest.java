package ex06_3_exercise;

public class LambdaTest {
  public static void main(String[] args) {
    String[] strList01 = 
      {"tomorrow","toto","to","timbukto","the","hello","heat"}; // Creates an array of strings named strList01 with various words.
    
    AnalyzerTool stringTool = new AnalyzerTool(); // Creates an instance of the AnalyzerTool class (assumed to be defined elsewhere), which will be used to analyze the string array.
    String searchStr = "to"; // Defines a search string searchStr with the value "to".
    
    System.out.println("Searching for: " + searchStr); //Prints out what string is being searched for.
    
    System.out.println("==Contains=="); // Prints a header indicating the start of the "contains" test.
    stringTool.showResult(strList01, searchStr, // Uses a lambda expression (t, s) -> t.contains(s) to test which strings in the array contain "to".
      (t,s) -> t.contains(s)); // This lambda is passed to the showResult() method of AnalyzerTool.

    System.out.println("==Starts With=="); // Tests which strings start with "to" using startsWith.
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.startsWith(s));

    System.out.println("==Equals=="); // Tests which strings are exactly equal to "to".
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.equals(s));    
    
    System.out.println("==Ends With=="); // Tests which strings end with "to".
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.endsWith(s));
    
    System.out.println("==Less than 5=="); // Tests which strings contain "to" and have a length less than 5.
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.contains(s) && t.length() < 5);
    
    System.out.println("==Greater than 5=="); // Tests which strings contain "to" and have a length greater than 5.
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.contains(s) && t.length() > 5);    
    
  }    
}

// The LambdaTest class demonstrates how to use lambda expressions in Java to perform flexible string analysis. It passes different lambda expressions to the showResult() method of an AnalyzerTool object to test a list of strings (strList01) against a target string ("to"). The tests include checking if strings contain, start with, end with, or are equal to "to", and also checks for string length conditions.