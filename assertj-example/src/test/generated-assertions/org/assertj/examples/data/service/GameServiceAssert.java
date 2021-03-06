package org.assertj.examples.data.service;

/**
 * {@link GameService} specific assertions - Generated by CustomAssertionGenerator.
 *
 * <p>Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractGameServiceAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class GameServiceAssert extends AbstractGameServiceAssert<GameServiceAssert, GameService> {

    /**
     * Creates a new <code>{@link GameServiceAssert}</code> to make assertions on actual
     * GameService.
     *
     * @param actual the GameService we want to make assertions on.
     */
    public GameServiceAssert(GameService actual) {
        super(actual, GameServiceAssert.class);
    }

    /**
     * An entry point for GameServiceAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br>
     * With a static import, one can write directly: <code>assertThat(myGameService)</code> and get
     * specific assertion with code completion.
     *
     * @param actual the GameService we want to make assertions on.
     * @return a new <code>{@link GameServiceAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static GameServiceAssert assertThat(GameService actual) {
        return new GameServiceAssert(actual);
    }
}
