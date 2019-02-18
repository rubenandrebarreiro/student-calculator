/**
 * @project Student Calculator
 * @description A Calculator made in Kotlin
 * @author Ruben Andre Barreiro
 *
 * @title Standard Calculator Operations
 *
 * @enumeration Enumeration responsible for the available types of Operations of the Standard Calculator
**/

// Package of this class (enumerations)
package enumerations

// Enumeration for the available types of Operations of the Standard Calculator
enum class StandardCalculatorOperations(var id: Byte, var operationName: String, var operationSymbol: String, var type: String) {
	
	// Available types of Standard Calculator's Operations
	Plus(0, "Plus", "+", "Basic"), // Plus operation
	Minus(1, "Minus", "-", "Basic"), // Minus operation
	Obelus(2, "Obelus", "÷", "Basic"), // Obelus operation
	Times(3, "Times", "×", "Basic"), // Times operation
	Remainder(4, "Remainder", "%", "Advanced"), // Remainder operation
	SquareRoot(5, "Square Root", "√", "Advanced"), // Square Root operation
	ExponentiationOfTwo(6, "Exponentiation of 2 (Two)", "x^(2)", "Advanced"), // Exponential of Two operation
	MultiplicativeInverse(7, "Multiplicative Inverse", "(1/x) or x^(-1)", "Advanced") // Multiplication Inverse operation
  
}