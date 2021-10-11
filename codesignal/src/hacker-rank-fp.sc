def f(num:Int,arr:List[Int]):List[Int] = for(ele<-arr; i<- 0 until num) yield ele
f(2,List(1,2,3))
def filterArray(delim:Int,arr:List[Int]):List[Int] = //for(ele<-arr; if ele<delim) yield ele
arr.filter(_<delim)
filterArray(3,List(30,10,12,3,2,1,0))
def removeOddPositions(arr:List[Int]):List[Int] = (for(in <-arr.indices;if in%2!=0)yield arr(in)).toList
println((1 to 10).toArray)
def reverse(arr:List[Int]):List[Int]= (for(i<-arr.indices) yield arr(arr.length-i-1))toList

reverse(List(1,2,3,4,5,6))

def sumOdd(arr:List[Int]):Int =  arr.filter(_%2!=0).reduce(_+_)

def count(arr:List[Int]):Int = arr.indices.max+1
def updateAbs(arr:List[Int]):List[Int]= arr.map(_.abs)

var factArr:List[Int]=List()
var powArr:List[Int]=List()
def fact(in:Int):Int={
  for(i <- 1 to in){
    if(i==1) factArr=factArr.:+(1)
    else factArr=factArr.:+(factArr(i-2) * i)
  }
  factArr(in-1)
}

def pow(in:Int):Int= {
  for(i <- 1 to in){
    if(i==1) powArr=powArr.:+(1)
    else powArr=powArr.:+(powArr(i-2) * in)
  }
  powArr(in-1)
}


