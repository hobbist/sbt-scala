package implicits
import implicits.testImpli._
object Runnner extends App {
    val test: TestImplicits = TestImplicits(3, "hi");
    test.compute(println)
}