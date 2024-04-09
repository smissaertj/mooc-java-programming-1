import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : this.exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void remove(String exercise) {
        Exercise exToRemove = null;
        for (Exercise ex: this.exercises) {
            if (ex.getName().equals(exercise)) {
                exToRemove = ex;
            }
        }
        if (exToRemove != null) {
            this.exercises.remove(exToRemove);
        }
    }

    public void markAsCompleted(String exercise) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
