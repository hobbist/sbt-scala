object CalendarColumns {

  def main(args: Array[String]) {
  val month=scala.io.StdIn.readInt()
  val start=scala.io.StdIn.readInt()
  val thirtyOneDaysMonths=List(1,3,5,7,8,10,12)
  val thirtyDaysMonths=List(4,6,9,11)
  val feb=List(2)
  val columns=month match {
    case x if thirtyOneDaysMonths.contains(x)=>
      println(s"31 Days Month.difference ${(42-(31+start))}")
      if( (42-(31+start)) < 6) 6 else 5
    case x if thirtyDaysMonths.contains(x)=>
      println(s"30 Days Month. difference ${(42-(30+start))}")
      if( (42-(30+start)) < 6) 6 else 5
    case x if feb.contains(x) =>
      println(s"28 Days Month difference ${(35-(28+start))}")
      if( (35-(28+start)) > 0) 5 else 4
  }
  Console.print(columns)
  }

}
