// One-of-a-Kind Objects
// which there is only one instance.

public class Singleton {
    private static Singleton uniqueInstance; //private instance as only this class can instantiate it.

    // other instance variables

    private Singleton() {}

    public static Singleton getInstance() {
        // if it's null then we haven't created the instance yet.
        // if it's not null then it has been created and we won't create any more 
        // Not like global variables.
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    // other methods if needed
}
