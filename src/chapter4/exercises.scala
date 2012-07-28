/**
 * Created with IntelliJ IDEA.
 * User: rajdev
 * Date: 7/28/12
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */

import collection.JavaConversions._

println()
////////////////////////////////////////////////////////////////////

val m1 = Map("iPad" -> 500, "iMac" -> 1500, "Pebble" -> 100)
val m2 = (for ((k,v) <- m1) yield (k,v*0.9)).toMap

println(m2)

println()
////////////////////////////////////////////////////////////////////

