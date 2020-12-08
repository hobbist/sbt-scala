package implicits
object testImpli {
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