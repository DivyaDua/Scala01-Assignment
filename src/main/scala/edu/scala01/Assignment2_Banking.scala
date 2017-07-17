package edu.scala01

case class Assignment2_Banking(id: Int, name: String, balance: Double){

  require(id>0 && name != "")

  //def this(id: Int, name: String) = this(id, name,0.0)

 /* def compare (that: Assignment2_Banking): Int = {
    if (this.name.equals(that.name) && this.id == that.id && this.balance == that.balance) {
      0
    }
    else {
      1
    }
  }

  def == (that: Assignment2_Banking): Boolean = {
    if (this.name.equals(that.name) && this.id == that.id && this.balance == that.balance) {
      true
    }
    else {
      false
    }
  }*/

  //override def toString = s"Welcome $name, your bank ID is $id & your balance is $balance"

  def credit(amount: Double): Assignment2_Banking = {
    new Assignment2_Banking(this.id, this.name, balance + amount)
  }

  def debit(amount: Double): Assignment2_Banking = {
    if (balance < amount) {
      println("Can't proceed, insufficient balance!")
      new Assignment2_Banking(this.id, this.name, balance)
    }
    else {
      new Assignment2_Banking(this.id, this.name, balance - amount)
    }
  }

}
