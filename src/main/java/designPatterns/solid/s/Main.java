package designPatterns.solid.s;

/*
* A class should have only a single reason to change.
* Note that the SRP does not say that a class should have at most one method. Here the
emphasis is on the single responsibility.
* There may be closely related methods that can help you to implement a responsibility.
* For example, if you have different methods to display the first name, the last name, and a full name, you can put these methods in the same class.
These methods are closely related, and it makes sense to place all these display methods inside the same class.
* In addition, you should not conclude that you should always separate responsibilities in every
application that you make. You need to analyze the change’s nature.
* It is because too many classes can make your application complex and thus difficult to maintain. But if you know
this principle and think carefully before you implement a design, you are likely to avoid the
mistakes discussed earlier
*/

public class Main {
    public static void main(String[] args) {

    }

}

