package ex06_3_exercise;

public interface StringAnalyzer { // This defines a public interface named StringAnalyzer
  public boolean analyze(String target, String searchStr); // Declares a method named analyze that Takes two String parameters: target (e.g., a word from the list) and searchStr (e.g., "to"). Returns a boolean — true if the condition is met, false otherwise.
}

// The StringAnalyzer interface defines a functional interface with a single method analyze(...). It is used in conjunction with lambda expressions in the LambdaTest class to pass custom string comparison logic (like contains, equals, etc.).
