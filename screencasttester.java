import static org.junit.Assert.*;

import org.junit.*;

public class screencasttester {
    @Test
    public void testsumarg(){
        assertEquals(6, screencast.sumargs(3, 3));
    }
}

//Windows
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" screencasttester.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore screencasttester

//Linux
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar screencast.java screencasttester.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore screenCastTester


//Login
//ssh cs15lwi22aio@ieng6.ucsd.edu

//Repository Transfer
//scp -r . cs15lwi22aio@ieng6.ucsd.edu:~/CSE_15L_ScreenCast1
//scp -r . cs15lwi22aio@ieng6.ucsd.edu:~/lib

//Git Clone
//git clone link
