/**
 * @project Student Calculator
 * @description A Calculator made in Kotlin
 * @author Ruben Andre Barreiro
 *
 * @title Standard Calculator
 * 
 * @interface Interface responsible for the class of the Standard Calculator
**/

// Package of this class (calculators.interface)
package calculators.interfaces

// Imports necessary for this class (utils.*)
import utils.*

// Interface responsible for the abstract class of the Standard Calculator
interface StandardCalculator {
	
	// Map responsible for keep all the operations and their results to the Operations and Results' History 
	var operationsAndResultsHistory: HashMap<Int, OperationAndResult>
	
	// Adds an operation and its result to the Operations and Results' History 
	fun addOperationAndResultToHistory(num1: Number, operator: String, num2: Number, result: Number): Unit
	
	// Plus operation: performs a sum operation, e.g.: (2 + 2) = 4
	fun plus(num1: Number, num2:Number): Number
	
	// Minus operation: performs a subtraction operation, e.g.: (4 - 2) = 2
	fun minus(num1: Number, num2:Number): Number
	
	// Division operation: performs a division operation, e.g.: (4 / 2) = 2
	fun div(num1: Number, num2:Number): Number
	
	// Multiplication operation: performs a multiplication operation, e.g.: (2 * 2) = 4
	fun mult(num1: Number, num2:Number): Number
	
}