package kt.guide.best_practice

import kotlin.test.Test
import kotlin.test.assertEquals
import java.util.Locale

class KExpressionTest {
    @Test
    fun getDefaultLocale() {
        assertEquals(Locale.ENGLISH, getDefaultLocale("usa"))
        assertEquals(Locale.GERMAN, getDefaultLocale("austria"))
        assertEquals(Locale.FRENCH, getDefaultLocale("france"))
        assertEquals(Locale.ENGLISH, getDefaultLocale("japan"))
    }
}