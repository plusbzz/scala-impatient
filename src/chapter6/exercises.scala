/**
 * Created with IntelliJ IDEA.
 * User: rajdev
 * Date: 7/30/12
 * Time: 6:42 PM
 * To change this template use File | Settings | File Templates.
 */

println()
////////////////////////////////////////////////////////////////////
object Conversions {
  def inchesToCentimeters(inches:Double):Double = inches*2.54
  def gallonsToLiters(gallons:Double):Double = gallons*3.9
}

println(Conversions.inchesToCentimeters(10))
println(Conversions.gallonsToLiters(10))
println()
////////////////////////////////////////////////////////////////////
abstract class Conversions {
  def convert(value:Double):Double
}

object InchesToCentimeters extends Conversions {
  override def convert(inches:Double):Double  = Conversions.inchesToCentimeters(inches)
}

object GallonsToLiters extends Conversions {
  override def convert(gallons:Double):Double  = Conversions.gallonsToLiters(gallons)
}

println(InchesToCentimeters.convert(10))
println(GallonsToLiters.convert(10))
println()
////////////////////////////////////////////////////////////////////

class Point(val x:Double = 0,val y:Double = 0)

object Point {
  def apply(x:Double,y:Double) = new Point(x,y)
}

val p1 = new Point(1,2)
println(p1.x,p1.y)
val p2 = Point(3,4)
println(p2.x,p2.y)
println()
////////////////////////////////////////////////////////////////////
