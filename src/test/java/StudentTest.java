import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {
Student shelb;
Student studentWithManyGrades;

@Before
public void setUp() {
    shelb = new Student(1, "Shelby D");
    shelb.addGrade(90);
    shelb.addGrade(90);
    shelb.addGrade(90);

    studentWithManyGrades = new Student(2, "Kristen W");
    studentWithManyGrades.addGrade(100);
    studentWithManyGrades.addGrade(100);
    studentWithManyGrades.addGrade(100);
    }

@Test
public void ifUserObjectCanBeCreated(){
    assertEquals("Shelby D", shelb.getName());
    assertEquals(1, shelb.getId());
    }

@Test
public void testIfAddGradeWorks(){
    assertSame(90, shelb.getGrades().get(0));
    }

@Test
public void testIfAvgIsCorrect(){
    assertEquals(90, shelb.getGradeAverage(), 0);
    assertEquals(100, studentWithManyGrades.getGradeAverage(), 0);
    }
}