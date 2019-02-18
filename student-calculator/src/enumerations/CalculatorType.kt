/**
 * @project Student Calculator
 * @description A Calculator made in Kotlin
 * @author Ruben Andre Barreiro
 *
 * @title CalculatorType
 *
 * @enumeration Enumeration responsible for the available types of Calculator
**/

// Package of this class (enumerations)
package enumerations

// Enumeration for the available types of Calculator
enum class CalculatorType(var id: Byte, var type: String) {
	
	// Available types of Calculator
	Standard(0, "Standard Calculator"), // Standard Calculator
	Scientific(1, "Scientific Calculator"), // Scientific Calculator
	Programmer(2, "Programmer Calculator"), // Programmer Calculator
	DateCalculator(3, "Date Calculator") // Date Calculator
  
}