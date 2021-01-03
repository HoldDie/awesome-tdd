/*-
 * -\-\-
 * hamcrest-jackson
 * --
 * Copyright (C) 2016 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.holddie.jackson;

import static com.holddie.jackson.IsJsonMissing.jsonMissing;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Test;

public class IsJsonMissingTest {

    private static final JsonNodeFactory NF = JsonNodeFactory.instance;

    @Test
    public void testType() throws Exception {
        final Matcher<JsonNode> sut = jsonMissing();

        assertThat(MissingNode.getInstance(), is(sut));
    }

    @Test
    public void testLiteral() throws Exception {
        final Matcher<JsonNode> sut = jsonMissing(MissingNode.getInstance());

        assertThat(MissingNode.getInstance(), is(sut));
    }

    @Test
    public void testMatch() throws Exception {
        final Matcher<JsonNode> sut = jsonMissing();

        assertThat(MissingNode.getInstance(), is(sut));
    }

    @Test
    public void testMismatchType() throws Exception {
        final Matcher<JsonNode> sut = jsonMissing();

        final StringDescription description = new StringDescription();
        sut.describeMismatch(NF.textNode("goat"), description);

        assertThat(description.toString(), is("was not a missing node, but a string node"));
    }

    @Test
    public void testDescription() throws Exception {
        final Matcher<JsonNode> sut = jsonMissing();

        final StringDescription description = new StringDescription();
        sut.describeTo(description);

        assertThat(description.toString(), is("a missing node"));
    }
}
