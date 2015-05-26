package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }
}

case class MyClass(a: String, b: Int){
	def someMethod: String = {
		a + " " + b.toString 
	}
}
