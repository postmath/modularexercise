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
public class ListExerciseFragment extends ExerciseFragment {
    private List<ExerciseFragment> subfragments;

    public ListExerciseFragment(String name, List<ExerciseFragment> subfragments) {
        super(name);
        this.setSubfragments(subfragments);
    }

    public void setSubfragments(List<ExerciseFragment> subfragments) {
        this.subfragments = new ArrayList<>(subfragments);
    }

    public ListIterator<ExerciseFragment> listIterator() {
        return subfragments.listIterator();
    }

    @Override
    public int getDuration() {
        int duration = 0;
        for(ExerciseFragment exerciseFragment : subfragments) {
            duration += exerciseFragment.getDuration();
        }
        return duration;
    }
}
