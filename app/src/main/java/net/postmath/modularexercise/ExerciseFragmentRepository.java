package net.postmath.modularexercise;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The set of all exercise fragments that the app knows about.
 *
 * Created by epostma on 2016-09-17.
 */
public enum ExerciseFragmentRepository {
    INSTANCE();

    private Map<String, ExerciseFragment> map = new HashMap<>();

    public boolean add(ExerciseFragment exerciseFragment) {
        if (map.containsKey(exerciseFragment.getName())) {
            return false;
        } else {
            map.put(exerciseFragment.getName(), exerciseFragment);
            return true;
        }
    }

    public ExerciseFragment get(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            return null;
        }
    }

    public boolean containsKey(String name) {
        return map.containsKey(name);
    }

    public ExerciseFragment remove(String name) {
        return map.remove(name);
    }

    public void clear() {
        map.clear();
    }
}
