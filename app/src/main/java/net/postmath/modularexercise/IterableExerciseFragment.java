package net.postmath.modularexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * An exercise fragment that consists of a sequence of otherwise defined exercise fragments.
 *
 * Created by epostma on 2016-06-19.
 */
public class IterableExerciseFragment extends ExerciseFragment implements Iterable<ExerciseFragment> {
    private Iterable<ExerciseFragment> subfragments;

    public IterableExerciseFragment(String name, Iterable<ExerciseFragment> subfragments) {
        super(name);
        this.setSubfragments(subfragments);
    }

    public void setSubfragments(Iterable<ExerciseFragment> subfragments) {
        this.subfragments = subfragments;
    }

    @Override
    public int getDuration() {
        int duration = 0;
        for(ExerciseFragment exerciseFragment : subfragments) {
            duration += exerciseFragment.getDuration();
        }
        return duration;
    }

    @Override
    public Iterator<ExerciseFragment> iterator() {
        return subfragments.iterator();
    }
}
