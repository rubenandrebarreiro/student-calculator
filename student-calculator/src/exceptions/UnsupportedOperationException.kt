/**
 * @project Student Calculator
 * @description A Calculator made in Kotlin
 * @author Ruben Andre Barreiro
 *
 * @title Unsupported Operation Exception
 * 
 * @interface Class responsible for the Unsupported Operation Exception
**/

// Package of this class (exceptions)
package exceptions

// Class responsible for the Unsupported Operation Exception
class UnsupportedOperationException(message: String): Exception(message) {

	val UnsupportedOperationMessage: String = "This operation isn't supported!!!"
	
	fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) {
		throw UnsupportedOperationException(UnsupportedOperationMessage)
	}
}