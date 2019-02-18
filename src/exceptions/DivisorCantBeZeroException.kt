/**
 * @project Student Calculator
 * @description A Calculator made in Kotlin
 * @author Ruben Andre Barreiro
 *
 * @title Divisor Can't Be Zero Exception
 * 
 * @interface Class responsible for the Divisor Can't Be Zero Exception
**/

// Package of this class (exceptions)
package exceptions

// Class responsible for the Divisor Can't Be Zero Exception
class DivisorCantBeZeroException(message: String): Exception(message) {

	val DivisorCantBeZeroExceptionnMessage: String = "It's impossible to divide a number by zero (0)!!!"
	
	fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) {
		throw DivisorCantBeZeroException(DivisorCantBeZeroExceptionnMessage)
	}
}