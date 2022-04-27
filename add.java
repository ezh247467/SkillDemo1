/*
javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar addTest.java
java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore addTest
*/
public class add {
    public static int addTwo(int a, int b) {
        return a * b;
    }
}