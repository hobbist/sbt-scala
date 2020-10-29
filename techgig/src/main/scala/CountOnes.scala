object CountOnes {
  def main(args: Array[String]): Unit = {
    val inputSize=scala.io.StdIn.readInt()
    var cnt=0
    var oneCount=0
    while(cnt<inputSize){
      oneCount+=scala.io.StdIn.readInt()
      cnt+=1
    }
    Console.print(oneCount)
  }
}
