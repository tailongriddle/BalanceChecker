import java.util.Stack;

public class Checker {
  Stack<Character> userInput;

  int curlyEven = 0;
  int paraEven = 0;
  int squareEven = 0;

  char current;



  boolean finalCheck = false;


  /***
   * Filters user input into a stack with only brackets/braces
   * 
   * 
   * @param input
   */
  public Checker(String input) {
    userInput = new Stack<Character>(); // container for the user input

    char toAdd = 0;
    for (int i = 0; i < input.length(); i++) { // cycles through the String
      current = input.charAt(i);
      if (current == '[' || current == ']' || current == '{' || current == '}' || current == '('
          || current == ')') {
        userInput.add(current); // creates queue of chars
      }
    } 



  }

  /***
   * Checks to see if the stack of brackets/braces is balanced and returns the result
   * 
   * @return finalCheck boolean
   */
  public boolean checkBalance() {
    Stack<Character> stack = new Stack<>(); // creates Stack
    for (char c : userInput) { // for each character in the Stack
      if (c == '(' || c == '[' || c == '{') { // if open...
        stack.push(c); // add to Stack
      } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') { // if closed p and the stack
                                                                        // is not empty and there is
                                                                        // a open p...
        stack.pop(); // remove top of stack
      } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') { // same as above
        stack.pop(); // remove top
      } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') { // same as above
        stack.pop(); // remove top
      } else { // if stack is empty...
        return false;
      }
    }

    finalCheck = stack.isEmpty();
    return finalCheck;
  }



}


