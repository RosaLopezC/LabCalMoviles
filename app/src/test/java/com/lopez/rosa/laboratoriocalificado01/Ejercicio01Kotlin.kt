package com.lopez.rosa.laboratoriocalificado01 // Ajusta esto según la ubicación del archivo

import org.junit.Test // Importar la biblioteca de pruebas JUnit

// Clase de prueba
class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    private fun areAnagrams(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) {
            return false // Si las longitudes son diferentes, no son anagramas
        }

        // Convertimos ambas palabras a minúsculas y las transformamos en listas de caracteres
        val charArray1 = word1.lowercase().toCharArray()
        val charArray2 = word2.lowercase().toCharArray()

        // Ordenamos las listas de caracteres
        charArray1.sort()
        charArray2.sort()

        // Comparamos los arreglos ordenados
        return charArray1.contentEquals(charArray2) // Retornamos true si son iguales, false si no
    }

    // Método de prueba para verificar la funcionalidad
    @Test
    fun testAreAnagrams() {
        // Aquí puedes probar diferentes pares de palabras
        val wordsToTest = listOf(
            Pair("listen", "silent"),
            Pair("evil", "vile"),
            Pair("hello", "world"),
            Pair("matilde", "nomade") // Ejemplo de prueba que no son anagramas
        )

        for ((word1, word2) in wordsToTest) {
            // Imprimir el resultado de cada comparación
            println("Are '$word1' and '$word2' anagrams? ${areAnagrams(word1, word2)}")
        }
    }
}
