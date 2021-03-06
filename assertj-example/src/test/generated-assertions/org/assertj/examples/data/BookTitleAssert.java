package org.assertj.examples.data;

/**
 * {@link Book.Title} specific assertions - Generated by CustomAssertionGenerator.
 *
 * <p>Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractBookTitleAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class BookTitleAssert extends AbstractBookTitleAssert<BookTitleAssert, Book.Title> {

    /**
     * Creates a new <code>{@link BookTitleAssert}</code> to make assertions on actual Book.Title.
     *
     * @param actual the Book.Title we want to make assertions on.
     */
    public BookTitleAssert(Book.Title actual) {
        super(actual, BookTitleAssert.class);
    }

    /**
     * An entry point for BookTitleAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br>
     * With a static import, one can write directly: <code>assertThat(myBook.Title)</code> and get
     * specific assertion with code completion.
     *
     * @param actual the Book.Title we want to make assertions on.
     * @return a new <code>{@link BookTitleAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static BookTitleAssert assertThat(Book.Title actual) {
        return new BookTitleAssert(actual);
    }
}
