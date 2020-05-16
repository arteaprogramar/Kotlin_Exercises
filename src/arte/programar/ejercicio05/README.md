## Ejercicio 05

**Objetivo:** 

Pedir tres números por consola e imprimirlos del menor al mayor

**Clases extras requeridas:**

Java 
```
import java.util.Scanner;
import java.util.Arrays; 

...
    Scanner console = new Scanner();
    ...
    Arrays.sort(array);
...

```
   
Kotlin 

```
import java.util.Scanner;
import java.util.Arrays; 

...
    val console = Scanner(System.`in`)
    ...
    Arrays.sort(array)
...

```

**Usar Scanner para escribir en la consola y guardar en Variable:**
   - Java `int n1 = console.nextInt();`
   - Kotlin  `val n1 = console.nextInt()`
   
**Crear Array para almacenar los numeros**
   - Java `int[] numbers = new int[3];`
   - Kotlin  `val numbers = IntArray(3)`
   
**Ordenar los datos del Array en forma ascendente**
    `Arrays.sort(numbers)`
   
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
