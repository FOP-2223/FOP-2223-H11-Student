package h11.providers;

import h11.AbstractRandom;
import h11.parse.Projection;
import org.tudalgo.algoutils.student.io.PropertyUtils;

import java.util.List;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * To test the LSystemParser this
 * class can generate random {@link List}s
 * of {@link Projection}s representing an LSystem.
 */
public class RandomLSystemGenerator {

    /**
     * The maximum number of {@link Projection}
     * in a generated LSystem.
     */
    private static final int MAX_SYSTEM_SIZE =
        PropertyUtils.getIntProperty("h11/h11-generator.properties", "MAX_LSYSTEM_SIZE");

    /**
     * The maximum size of the destination
     * in a generated projection.
     */
    private static final int MAX_PROJECTION_DESTINATION_SIZE = 5;

    /**
     * {@link AbstractRandom} being used.
     */
    private final AbstractRandom random;

    /**
     * @param random {@link AbstractRandom} being used.
     */
    public RandomLSystemGenerator(AbstractRandom random) {
        this.random = random;
    }

    /**
     * Generate a random LSystem
     * represented as a {@link List} of {@link Projection}s.
     *
     * @return A {@link List} of random {@link Projection}s.
     */
    public List<Projection> generate() {
        return crash("Not implemented: H6.2"); // TODO: H6.2 - remove if implemented
    }

    /**
     * Generate a {@link Projection} with
     * the given source and a random destination.
     *
     * @param src The source of the {@link Projection}
     * @return A random {@link Projection} with the given source.
     */
    public Projection makeProjection(String src) {
        return crash("Not implemented: H6.1"); // TODO: H6.1 - remove if implemented
    }
}
