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

val wordCount1 = collection.mutable.Map[String,Int]()

val words = Array("hello","world","earth","hello","alien","world")

words.foreach {
  w => if (wordCount1.contains(w)) wordCount1(w)+=1 else wordCount1(w) = 1
}

println(wordCount1)

println()
////////////////////////////////////////////////////////////////////

var wordCount2 = Map[String,Int]()

words.foreach {w =>
  wordCount2 = wordCount2 + (if (wordCount2.contains(w)) (w,wordCount2(w)+1) else (w,1))
}

println(wordCount2)

println()
////////////////////////////////////////////////////////////////////
