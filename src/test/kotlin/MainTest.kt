import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class MainTest {
    @Test
    fun test() {
        val test = 123

        assertThat(test, equalTo(123))
    }
}