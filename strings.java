public class StringDemo {
     public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println( "String Length is : " + length );
     }
}
String string1 = "My name is ";
String string2 = "Michael";
String string3 = string1.concat(string2);
System.out.println(string3);
// will output My name is Michael


String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.);
System.out.println(ninja);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

String ninja = "Welcome to Coding Dojo!";
int a = ninja.indexOf("Coding"); // a is 11
int b = ninja.indexOf("co"); // b is 3
int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found

//Conditionals
boolean defenderGuarding = true;
if(defenderGuarding == true) {
    System.out.println("Pass The Ball");
}
boolean defenderGuarding = true;
if(defenderGuarding == true) {
    System.out.println("Pass The Ball");
} else {
    System.out.println("Shoot The Ball");
}
boolean defenderGuarding = true;
boolean closeToBasket = true;
if(defenderGuarding == true) {
    System.out.println("Pass The Ball");
} else if(closeToBasket == true) {
    System.out.println("Shoot The Ball");
} else {
    System.out.println("Dribble The Ball");
}
