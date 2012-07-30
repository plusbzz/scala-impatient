/**
 * Created with IntelliJ IDEA.
 * User: rajdev
 * Date: 7/28/12
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */

println()
////////////////////////////////////////////////////////////////////


class BankAccount {
  private var accountBalance = 0.0

  def balance = accountBalance

  def deposit(amt:Double) = {
    if(amt > 0) accountBalance += amt else ()
  }
  def withdraw(amt:Double) = {
    if(amt <= balance) accountBalance -= amt else ()
  }
}

println()
////////////////////////////////////////////////////////////////////
// Ex 3
class Time1(val hrs:Int, val mins:Int) {
  assert(hrs >= 0 && hrs <= 23)
  assert(mins >= 0 && mins <= 59)

  def before(other:Time1):Boolean = {
    if (this.hrs < other.hrs) true else {
       if (this.hrs > other.hrs) false else {
         // equal hours, check minutes
         this.mins < other.mins
       }
    }
  }
}

val t1 = new Time1(2,30)
println(t1.before(new Time1(3,25)))
println(t1.before(new Time1(1,25)))
println()
////////////////////////////////////////////////////////////////////
// Ex 4
class Time2(val hrs:Int, val mins:Int) {
  assert(hrs >= 0 && hrs <= 23)
  assert(mins >= 0 && mins <= 59)

  val repr = hrs*60+mins

  def before(other:Time2):Boolean = {
    (this.repr < other.repr)
  }
}

val t2 = new Time2(2,30)
println(t2.before(new Time2(3,25)))
println(t2.before(new Time2(1,25)))

println()
////////////////////////////////////////////////////////////////////
//Ex 10: The following 3 classes should be equivalent

class Employee1(val name:String, var salary:Double) {
  def this() {this("John Doe",0.0)}
}

class Employee2 {
  val name = "John Doe"
  var salary = 0.0
}

class Employee3(val name:String = "John Doe", var salary:Double = 0.0) {
}

println()
////////////////////////////////////////////////////////////////////
// Ex 8
class Car(val manufacturer:String, val model:String, val year:Int = 0){
  var plate = ""
  def this(manufacturer:String, model:String, year:Int, plate:String = ""){
    this(manufacturer,model)
    this.plate = plate
  }
}
println()
////////////////////////////////////////////////////////////////////



