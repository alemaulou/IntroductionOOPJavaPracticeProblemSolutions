package chapter9;

public class Chapter9Practice1 {
    public static void main(String[] args) {
        
//         for each character ch in string {
//        if (ch is a vowel) {
//            increment counter
//        }
//    }
       
       String name = "Sumatra";
       
       System.out.println("String name is: " + name);
       for(int i = 0; i < name.length(); i++) {
           System.out.println("Array index: " + i + ", Char: " + name.charAt(i));
       }
       
       // charAt() methods returns a value of primiitve data type char.
       // Name is a variable of type String whose value is a reference to an instance of String.
       
//       String name1 = "Kona";
//       String name2 = "Espresso";
       
       // shorthand for:
       
       String name1 = new String("Kona");
       String name2 = new String("Espresso");
        
 
        
//        // Prints A
//        System.out.println((char) 65);
//        
//        // Prints 67
//        System.out.println((int) 'C');
//        
//        // Prints Y
//        System.out.println('Y');
//        
//        // Prints ?
//        if ('A' < '?') {
//            System.out.println('A');
//        } else {
//            System.out.println('?');
//        }
//        
//        // substring() methods pass arguments (0,2) into param, prints 'Te'
//        String test = "Test";
//        System.out.println(test.substring(0,2)); 
    }
}
