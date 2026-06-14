public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("Testing Singleton Pattern...\n");

        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Processing user request.");
        System.out.println(); 

        if (logger1==logger2) {
            System.out.println("SUCCESS: logger1 and logger2 reference the SAME instance.");
        } else {
            System.out.println("FAILURE: Multiple instances were created.");
        }
    }
}