package classes
//importing implicit class.compiler will add new method on class mentioned in implicit class
import classes.testImpli._
object Runnner extends App {
    val test: TestImplicits = TestImplicits(1, "hi");
    //when constructing object using auxillary constructor new keyword is used
    val testAux:TestImplicits = new TestImplicits("hi");
    val tp=test.concatAdd(TestImplicits(2," Kapil"))
    tp.compute(println)
}

//for case class constructor arguements are public val
case class TestImplicits(num:Int,in:String){
    //precondition to be satisfied.if not it will throw illigal arguement exception
    require(num > 0 ,"Num areguement must be greater than 0")
    private val g=num+1
    //auxillary construtor.In Scala, every auxiliary constructor must invoke another constructor of the same class as its first action
    def this(in:String) = this(1,in)

    def concatAdd(that:TestImplicits):TestImplicits={
        new TestImplicits(num+that.num,in+that.in)
    }

    override def toString: String = s"${num} ${in}"
}

object testImpli {
    //define the class implicit to use method not defined on actual class
    implicit class TestImplicits_Implict(d:TestImplicits){
        def compute[A<:Unit](f:(String)=> A) : Unit= {
            def loop(current:Int):Unit= {
                if(current>0 && current<=d.num){
                    f(d.in)
                    loop(current-1)
                }
            }
            loop(d.num)
        }
    }
}