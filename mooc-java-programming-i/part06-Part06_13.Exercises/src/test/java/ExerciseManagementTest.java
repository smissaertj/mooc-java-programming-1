import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListIsEmptyAtBeginning(){
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("New Exercise");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList(){
        management.add("New Exercise");
        assertTrue(management.exerciseList().contains("New Exercise"));
    }

    @Test
    public void removingExerciseReducesListByOne(){
        management.add("New Exercise");
        management.remove("New Exercise");
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void removedExerciseIsNotInList(){
        management.remove("New Exercise");
        management.remove("New Exercise");
        assertFalse(management.exerciseList().contains("New Exercise"));
    }

    @Test
    public void exerciseIsNotInList(){
        assertFalse(management.exerciseList().contains("Some new Exercise"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertTrue(management.isCompleted("New Exercise"));
    }

    @Test
    public void isNotMarkedAsCompletedIsNotCompleted(){
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertFalse(management.isCompleted("Some new Exercise"));
    }
}
