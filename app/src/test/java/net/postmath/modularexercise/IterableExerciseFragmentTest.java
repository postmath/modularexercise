package net.postmath.modularexercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by epostma on 2016-09-17.
 */
public class IterableExerciseFragmentTest {

    @Test
    public void testGetDurationEmpty() throws Exception {
        IterableExerciseFragment iterableExerciseFragment = new IterableExerciseFragment("test", new ArrayList<ExerciseFragment>());
        assertEquals(iterableExerciseFragment.getDuration(), 0);
    }

    @Test
    public void testGetDurationNested() throws Exception {
        ExerciseFragment exerciseFragment2 = new AtomicExerciseFragment("test2", 2);
        ExerciseFragment exerciseFragment5 = new AtomicExerciseFragment("test5", 5);
        ExerciseFragment[] list252 = {exerciseFragment2, exerciseFragment5, exerciseFragment2};
        IterableExerciseFragment iterableExerciseFragment252 = new IterableExerciseFragment("test252", Arrays.asList(list252));
        assertEquals(2+5+2, iterableExerciseFragment252.getDuration());

        ExerciseFragment[] list52522 = {exerciseFragment5, iterableExerciseFragment252, exerciseFragment2};
        IterableExerciseFragment iterableExerciseFragment52522 = new IterableExerciseFragment("test52522", Arrays.asList(list52522));
        assertEquals(5+2+5+2+2, iterableExerciseFragment52522.getDuration());
    }
}