                                              // Static block
/*
 * Static block is such kind of block in java which gets executed at the time of loading the .class file into JVM memory.
 * Static block execute only one time.
 */

package avi.keywordsPractice;

public class StaticBlockDemo {
    static {
        System.out.println("Does not need to create object");          // Static block


    }

    StaticBlockDemo(){
        System.out.println("Constructor block");                   // Constructor block
    }
    {
        System.out.println("Instance block");                      // Instance block

    }

    public static void main(String[] args) {
        StaticBlockDemo r = new StaticBlockDemo();
    }

}

/*
* The result shows that the static block execute first.
* Then Instance block will get execute, then constructor get executed.
* But u have to create object to execute the instance block and constructor.
 */