def adjacentElementsProduct(inputArray: Array[Int]): Int = {
  var maxPrd:Int=0
  var arr:Array[Int]=null
  inputArray.sliding(2).foreach(x => { if((x(0)*x(1))>=maxPrd) arr=x ; maxPrd=x(0)*x(1)})
  maxPrd
}

def shapeArea(n: Int): Int = {
  var areaArr:List[Int]=List.empty
  for(i <- 0 to n){
    if(i==0||i==1) areaArr = areaArr :+ 1
    else {
      println(scala.math.pow(2,i))
      areaArr = areaArr :+ (areaArr(i-1) + scala.math.pow(2,i).toInt)
    }
  }
  println(areaArr)
  areaArr(n)
}

shapeArea(2)