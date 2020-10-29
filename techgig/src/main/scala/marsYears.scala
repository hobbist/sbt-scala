object marsYears {

  def main(args: Array[String]): Unit = {
    val daysInYear=scala.io.StdIn.readInt()
    val weeks=daysInYear/7
    val remainder=daysInYear%7
    val maxDayOff= if (remainder>0&& remainder>=2) (weeks * 2)+2 else if (remainder>0&& remainder<2)  (weeks * 2)+remainder else  (weeks * 2)
    val minDayOff=weeks*2
    Console.print(s"$minDayOff $maxDayOff")
  }
}
