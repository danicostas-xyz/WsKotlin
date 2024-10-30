### Ejercicio: Convertir un programa básico de Java a Kotlin

#### Objetivo
Convertir un programa Java sencillo a Kotlin, aplicando conceptos como `val` y `var`, inferencia de tipos, null-safety y String Templates.

#### Instrucciones

1. **Lee el código Java** que se muestra a continuación.
2. **Convierte cada línea de código a Kotlin**, haciendo uso de las características de Kotlin vistas en el README.
3. **Asegúrate de emplear** `val` para variables inmutables, `var` para mutables, y de aprovechar el sistema de inferencia de tipos de Kotlin.
4. **Implementa manejo de null-safety** según sea necesario para evitar posibles errores de `NullPointerException`.

#### Código en Java

```java
public class Main {
    public static void main(String[] args) {
        String nombre = "Dani";
        int edad = 28;

        // Cambiamos el valor de "edad"
        edad = 29;

        // Un mensaje con el nombre y la edad
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");

        // Permitir que nombre sea nullable
        nombre = null;

        // Si el nombre es null, mostrar un mensaje alternativo
        if (nombre != null) {
            System.out.println("Bienvenido, " + nombre + "!");
        } else {
            System.out.println("Nombre no proporcionado.");
        }
    }
}
```

#### Pasos de Conversión a Kotlin

- Declara las variables usando val y var según corresponda.
-  String Templates para construir el mensaje en lugar de concatenaciones.
- Aplica el sistema de null-safety al permitir que nombre sea null y utiliza operadores como ?. y ?: para manejar el valor de nombre de forma segura.

#### Solución esperada en Kotlin

Intenta escribir la solución en Kotlin sin mirar la respuesta. Luego, compara tu código con la solución de abajo para ver si has aplicado correctamente los conceptos.

```kotlin
fun main() {
    var nombre: String? = "Dani"
    var edad = 28

    // Cambiamos el valor de "edad"
    edad = 29

    // Un mensaje con el nombre y la edad usando String Templates
    println("Hola, mi nombre es $nombre y tengo $edad años.")

    // Permitir que nombre sea null
    nombre = null

    // Si el nombre es null, mostrar un mensaje alternativo
    println("Bienvenido, ${nombre ?: "Nombre no proporcionado"}!")
}
```

#### Reflexión

- ¿Cómo afecta el uso de val y var a la inmutabilidad del código?
- ¿Qué ventajas aporta el sistema de inferencia de tipos de Kotlin en la declaración de variables?
- ¿Cómo el sistema de null-safety en Kotlin mejora la seguridad del código frente a los errores comunes en Java?
