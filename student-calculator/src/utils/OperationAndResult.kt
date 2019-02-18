/**
 * @project Student Calculator
 * @description A Calculator made in Kotlin
 * @author Ruben Andre Barreiro
 *
 * @title Operation and Result
 * 
 * @interface Class responsible for the Operation and its respectively Result
**/

// Package of this class (utils)
package utils

// Class responsible for the Operation and its respectively Result
class OperationAndResult(var num1: Number, var operator: String, var num2: Number, var result: Number) {
	
	// Constructor of Operation and Result class
	init {
        this.num1 = num1
		this.operator = operator
        this.num2 = num2
		this.result = result
    }
	
	// Returns the Number 1 involved in this operation
	fun getNum1(): Number {
		return num1
	}
	
	// Returns the Operator involved in this operation
	fun getOperator(): String {
		return operator
	}
	
	// Returns the Number 2 involved in this operation
	fun getNum2(): Number {
		return num2
	}
	
	// Returns the Result of this operation
	fun getResult(): Number {
		return result
	}
}