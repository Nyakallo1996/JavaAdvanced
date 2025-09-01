package ex06_3_exercise;

public class AnalyzerTool {
  
  public void showResult(String[] strList, String searchStr, StringAnalyzer analyzer){ // Declares a method called showResult
    for(String current:strList){ // Starts a for-each loop that iterates over each string (current) in the strList array.
      if (analyzer.analyze(current, searchStr)){ // Uses the analyzer (a lambda or method reference) to check if the current string satisfies the condition with searchStr.
        System.out.println("Match: " + current); // If the condition is true, it prints Match: <current string>.
      }
    }
  }
}

// The AnalyzerTool class provides a method showResult() that takes a list of strings, a search string, and a lambda-based condition (StringAnalyzer) to decide which strings match the condition. It loops through each string and prints out those that satisfy the condition.