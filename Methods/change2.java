package Methods;

public class change2 {
    
    static void change(int arr[]){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        int marks[] = {98, 75, 85, 56, 95};
        change(marks);
        System.out.println("The value of marks after running the changes in: " + marks[0]);

    }
}

/*
 * In Java, arrays and objects are passed to methods by value, but the value passed is a reference to the actual array or object. 
 * This means that when you pass an array to a method, the method receives a copy of the reference to the array.

  In your code:
  The marks array is created in the main method.
  When change(marks) is called, the reference to the marks array is passed to the change method.
  Inside the change method, the statement arr[0] = 98; modifies the first element of the array that both marks (in main) and arr (in change) refer to.
  Since the reference points to the same array in memory, the change is reflected in the original array in the main method.
  This behavior occurs because arrays in Java are objects, and the reference to the object is passed to the method. 
  However, it is still Pass by Value, as the value of the reference is copied.


 */