## Ejercicio 02

**Objetivo:** 

Pedir dos números por consola e imprimir si son iguales o no.

**Clases extras requeridas:** `import java.util.Scanner;`
   - Java  `Scanner console = new Scanner();`
   - Kotlin ``val console = Scanner(System.`in`)``

**Usar Scanner para escribir en la consola y guardar en Variable:**
   - Java `int n1 = console.nextInt();`
   - Kotlin  `val n1 = console.nextInt()`

**Evitar error en el codigo al leer datos en la consola**

El ejercicio requiere la entrada de números para compararlos, pero si el usuario
ingresa texto ocurrirá un error al quererlo asignar a una variable `int`; para
evitar un error como esto es necesario usar

Java
```
try {
    // Code
} catch (Exception ex) {
    // Error has been detected; do something!
}
```

Kotlin 
```
try {
    // Code
} catch (ex: Exception) {
    // Error has been detected; do something!
}
```
