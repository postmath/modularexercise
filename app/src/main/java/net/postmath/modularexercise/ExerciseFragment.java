package net.postmath.modularexercise;

/**
 * Created by epostma on 2016/06/19.
 *
 * A fragment of a set of exercises.
 */
public abstract class ExerciseFragment {
    private String name;

    public ExerciseFragment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The duration of this fragment, in seconds.
     * @return the duration
     */
    public abstract int getDuration();
}
