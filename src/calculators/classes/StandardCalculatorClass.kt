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
package calculators.classes

// Imports necessary for this class (calculators.interfaces.StandardCalculator, enumerations.StandardCalculatorOperations and utils.*)
import calculators.interfaces.StandardCalculator
import enumerations.StandardCalculatorOperations
import utils.*

// Class responsible for the Standard Calculator
abstract class StandardCalculatorClass: StandardCalculator {
	
	// Adds an operation and its result to the Operations and Results' History
	override fun addOperationAndResultToHistory(num1: Number, operator: String, num2: Number, result: Number): Unit {
		
		val operationAndResult = OperationAndResult(num1, operator, num2, result)
				
		operationsAndResultsHistory.put(operationsAndResultsHistory.size, operationAndResult)
			
	}
	
	// Plus operation: performs a sum operation, e.g.: (2 + 2) = 4
	override fun plus(num1: Number, num2: Number): Number {
				
		// Numbers treatment/casting and saves the result
		if(num1 is Double) { // Number 1 is a Double
						
			if(num2 is Double) { // Number 1 and Number 2 are Doubles
				
				num1.toDouble()
				num2.toDouble()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
					
				
				return result
			}
			else if(num2 is Float) { // Number 1 is a Double and Number 2 is a Float
				num1.toDouble()
				num2.toFloat()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Int) { // Number 1 is a Double and Number 2 is an Int
				num1.toDouble()
				num2.toInt()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Long) { // Number 1 is a Double and Number 2 is a Long
				num1.toDouble()
				num2.toLong()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Short) { // Number 1 is a Double and Number 2 is a Short
				num1.toDouble()
				num2.toShort()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else { // Throws an Unsupported Operation Exception
				throw UnsupportedOperationException()
			}
		}
		else if(num1 is Float) { // Number 1 is a Float
			
			if(num2 is Double) { // Number 1 is a Float and Number 2 is a Double
				num1.toFloat()
				num2.toDouble()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Float) { // Number 1 and Number 2 are Floats
				num1.toFloat()
				num2.toFloat()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Int) { // Number 1 is a Float and Number 2 is an Int
				num1.toFloat()
				num2.toInt()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Long) { // Number 1 is a Float and Number 2 is a Long
				num1.toFloat()
				num2.toLong()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Short) { // Number 1 is a Float and Number 2 is a Short
				num1.toFloat()
				num2.toShort()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else { // Throws an Unsupported Operation Exception
				throw UnsupportedOperationException() 
			}
		}
		else if(num1 is Int) { // Number 1 is an Int
			
			if(num2 is Double) { // Number 1 is an Int and Number 2 is a Double
				num1.toInt()
				num2.toDouble()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Float) { // Number 1 is an Int and Number 2 is a Float
				num1.toInt()
				num2.toFloat()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Int) { // Number 1 and Number 2 are Ints
				num1.toInt()
				num2.toInt()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Long) { // Number 1 is an Int and Number 2 is a Long
				num1.toInt()
				num2.toLong()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Short) { // Number 1 is an Int and Number 2 is a Short
				num1.toInt()
				num2.toShort()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else { // Throws an Unsupported Operation Exception
				throw UnsupportedOperationException() 
			}
		}
		else if(num1 is Long) { // Number 1 is a Long
			
			if(num2 is Double) { // Number 1 is a Long and Number 2 is a Double
				num1.toLong()
				num2.toDouble()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Float) { // Number 1 is a Long and Number 2 is a Float
				num1.toLong()
				num2.toFloat()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Int) { // Number 1 is a Long and Number 2 is an Int
				num1.toLong()
				num2.toInt()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Long) { // Number 1 is a Long and Number 2 is a Long
				num1.toLong()
				num2.toLong()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Short) { // Number 1 is a Long and Number 2 is a Short
				num1.toLong()
				num2.toShort()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else { // Throws an Unsupported Operation Exception
				throw UnsupportedOperationException() 
			}
		}
		else if(num1 is Short) { // Number 1 is a Short
			
			if(num2 is Double) { // Number 1 is a Short and Number 2 is a Double
				num1.toShort()
				num2.toDouble()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Float) { // Number 1 is a Short and Number 2 is a Float
				num1.toShort()
				num2.toFloat()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Int) { // Number 1 is a Short and Number 2 is an Int
				num1.toShort()
				num2.toInt()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Long) { // Number 1 is a Short and Number 2 is a Long
				num1.toShort()
				num2.toLong()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else if(num2 is Short) { // Number 1 and Number 2 are Shorts
				num1.toShort()
				num2.toShort()
				
				val result = (num1 + num2)
				
				addOperationAndResultToHistory(num1, StandardCalculatorOperations.Plus.operationSymbol, num2, result)
				
				
				return result
			}
			else { // Throws an Unsupported Operation Exception
				throw UnsupportedOperationException() 
			}
		}
		else { // Throws an Unsupported Operation Exception
			throw UnsupportedOperationException() 
		}
	}
}