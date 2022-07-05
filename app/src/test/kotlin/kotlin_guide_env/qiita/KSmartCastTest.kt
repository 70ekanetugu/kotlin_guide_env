package kt.guide.qiita

import kotlin.test.Test
import kt.guide.qiita.Animal
import kt.guide.qiita.Cat

class KSmartCastTest {

    @Test
    fun doSomething() {
        val cat: Animal = Cat()
        KSmartCast.doSomething(cat)

        val bird: Animal = object: Animal() { fun birdMethod() = print("bird") }
        KSmartCast.doSomething(bird)
    }
}