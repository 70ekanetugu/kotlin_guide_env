package kt.guide.qiita

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class KNullSafetyTest {
    @Test
    fun notNullTest() {
        val actual = notNull()
        assertNotNull(actual)
    }

    @Test
    fun nullableTest() {
        val actual = nullable()
        assertNull(actual)
    }
}