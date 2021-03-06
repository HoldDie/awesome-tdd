/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * <p>Copyright 2012-2016 the original author or authors.
 */
package org.assertj.examples.custom;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.assertj.examples.AbstractAssertionsExamples;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SoftAssertionsExtension.class)
public class JUnit5_StandardSoftAssertions_Examples extends AbstractAssertionsExamples {

    @Test
    public void successful_junit_standard_soft_assertion_example(SoftAssertions softly) {
        softly.assertThat(frodo.getName()).isEqualTo("Frodo");
        softly.assertThat(frodo.age).isEqualTo(33);
        softly.assertThat(fellowshipOfTheRing).contains(frodo);
    }

    // comment the @Disabled to see the test failing with all the assertion error and not only the
    // first one.
    @Test
    @Disabled
    public void failing_junit_standard_soft_assertions_example(SoftAssertions softly) {
        // basic object to test
        String name = "Michael Jordan - Bulls";

        // use our own soft assertions based on JUnit rule
        softly.assertThat(name).startsWith("Mike").contains("Lakers").endsWith("Chicago");
    }
}
