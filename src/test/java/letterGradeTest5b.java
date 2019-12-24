import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeTest5b {
    private letterGrade Grade;

    @Before
    public void setUp(){
        Grade = new letterGrade();
    }

    @Test
    public void TC07(){
        assertEquals('X', Grade.letterGrade(-1));
    }

    @Test
    public void TC08(){
        assertEquals('F', Grade.letterGrade(0));
    }

    @Test
    public void TC09(){
        assertEquals('F', Grade.letterGrade(59));
    }

    @Test
    public void TC10(){
        assertEquals('D', Grade.letterGrade(60));
    }

    @Test
    public void TC11(){
        assertEquals('C', Grade.letterGrade(70));
    }

    @Test
    public void TC12(){
        assertEquals('B', Grade.letterGrade(80));
    }

    @Test
    public void TC13(){
        assertEquals('A', Grade.letterGrade(90));
    }

    @Test
    public void TC14(){
        assertEquals('A', Grade.letterGrade(100));
    }

    @Test
    public void TC15(){
        assertEquals('X', Grade.letterGrade(101));
    }

}