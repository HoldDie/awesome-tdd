package org.assertj.examples.data;

/**
 * {@link Mansion} specific assertions - Generated by CustomAssertionGenerator.
 *
 * <p>Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractMansionAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class MansionAssert extends AbstractMansionAssert<MansionAssert, Mansion> {

    /**
     * Creates a new <code>{@link MansionAssert}</code> to make assertions on actual Mansion.
     *
     * @param actual the Mansion we want to make assertions on.
     */
    public MansionAssert(Mansion actual) {
        super(actual, MansionAssert.class);
    }

    /**
     * An entry point for MansionAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br>
     * With a static import, one can write directly: <code>assertThat(myMansion)</code> and get
     * specific assertion with code completion.
     *
     * @param actual the Mansion we want to make assertions on.
     * @return a new <code>{@link MansionAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static MansionAssert assertThat(Mansion actual) {
        return new MansionAssert(actual);
    }
}