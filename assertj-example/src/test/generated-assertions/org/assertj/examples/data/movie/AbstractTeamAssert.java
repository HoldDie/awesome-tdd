package org.assertj.examples.data.movie;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * Abstract base class for {@link Team} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractTeamAssert<S extends AbstractTeamAssert<S, A>, A extends Team>
        extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractTeamAssert}</code> to make assertions on actual Team.
     *
     * @param actual the Team we want to make assertions on.
     */
    protected AbstractTeamAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual Team's actors contains the given String elements.
     *
     * @param actors the given elements that should be contained in actual Team's actors.
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors does not contain all given String
     *     elements.
     */
    public S hasActors(String... actors) {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (actors == null) failWithMessage("Expecting actors parameter not to be null.");

        // check with standard error message, to set another message call:
        // info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getActors(), actors);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Team's actors contains the given String elements in Collection.
     *
     * @param actors the given elements that should be contained in actual Team's actors.
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors does not contain all given String
     *     elements.
     */
    public S hasActors(java.util.Collection<? extends String> actors) {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (actors == null) {
            failWithMessage("Expecting actors parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call:
        // info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getActors(), actors.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Team's actors contains <b>only</b> the given String elements and
     * nothing else in whatever order.
     *
     * @param actors the given elements that should be contained in actual Team's actors.
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors does not contain all given String
     *     elements.
     */
    public S hasOnlyActors(String... actors) {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (actors == null) failWithMessage("Expecting actors parameter not to be null.");

        // check with standard error message, to set another message call:
        // info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getActors(), actors);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Team's actors contains <b>only</b> the given String elements in
     * Collection and nothing else in whatever order.
     *
     * @param actors the given elements that should be contained in actual Team's actors.
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors does not contain all given String
     *     elements.
     */
    public S hasOnlyActors(java.util.Collection<? extends String> actors) {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (actors == null) {
            failWithMessage("Expecting actors parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call:
        // info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getActors(), actors.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Team's actors does not contain the given String elements.
     *
     * @param actors the given elements that should not be in actual Team's actors.
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors contains any given String elements.
     */
    public S doesNotHaveActors(String... actors) {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (actors == null) failWithMessage("Expecting actors parameter not to be null.");

        // check with standard error message (use overridingErrorMessage before contains to set your
        // own message).
        Iterables.instance().assertDoesNotContain(info, actual.getActors(), actors);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Team's actors does not contain the given String elements in
     * Collection.
     *
     * @param actors the given elements that should not be in actual Team's actors.
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors contains any given String elements.
     */
    public S doesNotHaveActors(java.util.Collection<? extends String> actors) {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (actors == null) {
            failWithMessage("Expecting actors parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your
        // own message).
        Iterables.instance().assertDoesNotContain(info, actual.getActors(), actors.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Team has no actors.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual Team's actors is not empty.
     */
    public S hasNoActors() {
        // check that actual Team we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have actors but had :\n  <%s>";

        // check
        if (actual.getActors().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getActors());
        }

        // return the current assertion for method chaining
        return myself;
    }
}
