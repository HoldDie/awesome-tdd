package org.assertj.examples.data;

/**
 * {@link Book} specific assertions - Generated by CustomAssertionGenerator.
 *
 * <p>Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractBookAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class BookAssert extends AbstractBookAssert<BookAssert, Book> {

    /**
     * Creates a new <code>{@link BookAssert}</code> to make assertions on actual Book.
     *
     * @param actual the Book we want to make assertions on.
     */
    public BookAssert(Book actual) {
        super(actual, BookAssert.class);
    }

    /**
     * An entry point for BookAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br>
     * With a static import, one can write directly: <code>assertThat(myBook)</code> and get
     * specific assertion with code completion.
     *
     * @param actual the Book we want to make assertions on.
     * @return a new <code>{@link BookAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static BookAssert assertThat(Book actual) {
        return new BookAssert(actual);
    }
}
