/**
 * Created with IntelliJ IDEA.
 * User: rajdev
 * Date: 7/26/12
 * Time: 5:05 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.TimeZone
import scala.math.random
import scala.util.Sorting.quickSort
import scala.collection.JavaConversions._

println()
////////////////////////////////////////////////////////////////////
def randArray(n:Int) = (0 until n) map (_ => (random * n).toInt)

println(randArray(5).mkString(","))
println(randArray(10).mkString(","))
println()
////////////////////////////////////////////////////////////////////
def avg(a:Array[Double]):Double = if(a.length > 0) a.sum.toDouble/a.length else 0

println()
////////////////////////////////////////////////////////////////////

// rewrite (2,-1,5,-2,4,0) as (2,5,4,-1,-2,0)
def shuffleArray(a:Array[Int]):Array[Int] =  {
  ((a filter (_ > 0)).toBuffer ++= (a filter (_ <= 0))).toArray
}
println(shuffleArray(Array(2,-1,5,-2,4,0)).mkString(","))
println()
////////////////////////////////////////////////////////////////////
val timezones = TimeZone.getAvailableIDs().toList filter {
  _ startsWith("America/")
} map {
   _ stripPrefix("America/")
} sorted

println(timezones.toArray.mkString(":"))
println()
////////////////////////////////////////////////////////////////////



