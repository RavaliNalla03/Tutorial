package test.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SingletonObject object = SingletonObject.getInstance();
       object.display();
    }
}
