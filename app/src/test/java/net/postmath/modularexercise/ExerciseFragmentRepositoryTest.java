package net.postmath.modularexercise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by epostma on 2016-09-17.
 */
public class ExerciseFragmentRepositoryTest {
    private static ExerciseFragment exerciseFragment2, exerciseFragment5, iterableExerciseFragment252, iterableExerciseFragment52522;

    @BeforeClass
    public static void setUp() throws Exception {

        exerciseFragment2 = new AtomicExerciseFragment("test2", 2);
        exerciseFragment5 = new AtomicExerciseFragment("test5", 5);
        ExerciseFragment[] list252 = {exerciseFragment2, exerciseFragment5, exerciseFragment2};
        iterableExerciseFragment252 = new IterableExerciseFragment("test252", Arrays.asList(list252));
        ExerciseFragment[] list52522 = {exerciseFragment5, iterableExerciseFragment252, exerciseFragment2};
        iterableExerciseFragment52522 = new IterableExerciseFragment("test52522", Arrays.asList(list52522));

        assertTrue(ExerciseFragmentRepository.INSTANCE.add(exerciseFragment2));
        assertTrue(ExerciseFragmentRepository.INSTANCE.add(exerciseFragment5));
        assertTrue(ExerciseFragmentRepository.INSTANCE.add(iterableExerciseFragment252));
        assertTrue(ExerciseFragmentRepository.INSTANCE.add(iterableExerciseFragment52522));
    }

    @AfterClass
    public static void tearDown() throws Exception {
        ExerciseFragmentRepository.INSTANCE.clear();
    }

    @Test
    public void testGet() throws Exception {
        assertEquals(exerciseFragment2, ExerciseFragmentRepository.INSTANCE.get("test2"));
        assertEquals(exerciseFragment5, ExerciseFragmentRepository.INSTANCE.get("test5"));
        assertEquals(iterableExerciseFragment252, ExerciseFragmentRepository.INSTANCE.get("test252"));
        assertEquals(iterableExerciseFragment52522, ExerciseFragmentRepository.INSTANCE.get("test52522"));

        assertNull(ExerciseFragmentRepository.INSTANCE.get(""));
        assertNull(ExerciseFragmentRepository.INSTANCE.get(null));
    }

    @Test
    public void testContainsKey() throws Exception {
        assertTrue(ExerciseFragmentRepository.INSTANCE.containsKey("test2"));
        assertTrue(ExerciseFragmentRepository.INSTANCE.containsKey("test52522"));
        assertFalse(ExerciseFragmentRepository.INSTANCE.containsKey(""));
        assertFalse(ExerciseFragmentRepository.INSTANCE.containsKey(null));
    }

    @Test
    public void testRemove() throws Exception {
        assertEquals(exerciseFragment5, ExerciseFragmentRepository.INSTANCE.remove("test5"));
        assertFalse(ExerciseFragmentRepository.INSTANCE.containsKey("test5"));
        assertNull(ExerciseFragmentRepository.INSTANCE.get("test5"));
    }
}