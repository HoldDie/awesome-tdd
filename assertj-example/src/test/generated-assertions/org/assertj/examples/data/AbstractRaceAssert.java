package org.assertj.examples.data;

import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Race} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractRaceAssert<S extends AbstractRaceAssert<S, A>, A extends Race>
        extends AbstractComparableAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractRaceAssert}</code> to make assertions on actual Race.
     *
     * @param actual the Race we want to make assertions on.
     */
    protected AbstractRaceAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual Race's alignment is equal to the given one.
     *
     * @param alignment the given alignment to compare the actual Race's alignment to.
     * @return this assertion object.
     * @throws AssertionError - if the actual Race's alignment is not equal to the given one.
     */
    public S hasAlignment(Alignment alignment) {
        // check that actual Race we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage =
                "\nExpecting alignment of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Alignment actualAlignment = actual.getAlignment();
        if (!Objects.areEqual(actualAlignment, alignment)) {
            failWithMessage(assertjErrorMessage, actual, alignment, actualAlignment);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Race's fullname is equal to the given one.
     *
     * @param fullname the given fullname to compare the actual Race's fullname to.
     * @return this assertion object.
     * @throws AssertionError - if the actual Race's fullname is not equal to the given one.
     */
    public S hasFullname(String fullname) {
        // check that actual Race we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage =
                "\nExpecting fullname of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualFullname = actual.getFullname();
        if (!Objects.areEqual(actualFullname, fullname)) {
            failWithMessage(assertjErrorMessage, actual, fullname, actualFullname);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Race's name is equal to the given one.
     *
     * @param name the given name to compare the actual Race's name to.
     * @return this assertion object.
     * @throws AssertionError - if the actual Race's name is not equal to the given one.
     */
    public S hasName(String name) {
        // check that actual Race we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage =
                "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualName = actual.getName();
        if (!Objects.areEqual(actualName, name)) {
            failWithMessage(assertjErrorMessage, actual, name, actualName);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Race is immortal.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual Race is not immortal.
     */
    public S isImmortal() {
        // check that actual Race we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.immortal) {
            failWithMessage("\nExpecting that actual Race is immortal but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual Race is not immortal.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual Race is immortal.
     */
    public S isNotImmortal() {
        // check that actual Race we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.immortal) {
            failWithMessage("\nExpecting that actual Race is not immortal but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }
}
