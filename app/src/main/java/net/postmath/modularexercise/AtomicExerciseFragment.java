package net.postmath.modularexercise;

/**
 * An exercise fragment that does not have any sub-fragments.
 *
 * Created by epostma on 2016-06-19.
 */
public class AtomicExerciseFragment extends ExerciseFragment {
    protected int duration;

    public AtomicExerciseFragment(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
