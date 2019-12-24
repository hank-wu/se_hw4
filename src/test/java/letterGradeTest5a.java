import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeTest5a {
    private letterGrade Grade;

    @Before
    public void setUp(){
        Grade = new letterGrade();
    }

    @Test
    public void TC01(){
        assertEquals('A', Grade.letterGrade(95));
    }

    @Test
    public void TC02(){
        assertEquals('B', Grade.letterGrade(85));
    }

    @Test
    public void TC03(){
        assertEquals('C', Grade.letterGrade(75));
    }

    @Test
    public void TC04(){
        assertEquals('D', Grade.letterGrade(65));
    }
    @Test
    public void TC05(){
        assertEquals('F', Grade.letterGrade(30));
    }
    @Test
    public void TC06(){
        assertEquals('X', Grade.letterGrade(-10));
        assertEquals('X', Grade.letterGrade(200));
    }
}