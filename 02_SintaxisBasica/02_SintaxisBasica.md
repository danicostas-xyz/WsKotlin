# 2. Sintaxis básica y diferencias con Java 📝

En este apartado, exploraremos las diferencias clave en la sintaxis básica entre Kotlin y Java, enfocándonos en la **declaración de variables**, los **tipos de datos** y el **sistema de null-safety**. Aunque ambos lenguajes comparten muchas similitudes, Kotlin introduce varias mejoras que permiten escribir código de manera más concisa y segura.

## Declaración de variables: `val` vs `var`

En Kotlin, las variables se declaran utilizando las palabras clave `val` y `var`, en lugar de los tipos explícitos que se usan en Java.

### `val` (inmutable):

`val` se utiliza para declarar variables **inmutables** (similares a `final` en Java). Una vez asignado un valor, no se puede cambiar.

```kotlin
val nombre = "Dani"  // No se puede reasignar
nombre = "Carlos"    // Error: Val cannot be reassigned
```

En Java, esto equivaldría a:

```java
final String nombre = "Dani";
nombre = "Carlos";  // Error
```

### `var` (mutable):

`var` se utiliza para declarar variables **mutables**, lo que significa que puedes reasignarles nuevos valores.

```kotlin
var edad = 28
edad = 29  // Esto es válido
```
En Java, esto sería:

```java
int edad = 28;
edad = 29;  // Esto es válido
```

## Tipos de datos e inferencia de tipos en Kotlin

En Kotlin, no es necesario declarar el tipo de datos explícitamente gracias a su sistema de inferencia de tipos. Kotlin es capaz de deducir el tipo de la variable basándose en el valor asignado. Sin embargo, si lo prefieres, también puedes declarar el tipo explícitamente.

### Ejemplo con inferencia de tipos:

```kotlin
val nombre = "Dani"  // Kotlin infiere que es de tipo String
var edad = 28        // Kotlin infiere que es de tipo Int
```
### Declaración con tipos explícitos (opcional):

```kotlin
val nombre: String = "Dani"
var edad: Int = 28
```
### En Java, siempre debes especificar el tipo:

```java
String nombre = "Dani";
int edad = 28;
```
La inferencia de tipos en Kotlin simplifica el código, pero en algunos casos es útil declarar los tipos explícitamente, especialmente para mejorar la legibilidad o en situaciones donde Kotlin no puede inferir el tipo correctamente.

## Nullable types y el sistema de null-safety

Una de las características más potentes de Kotlin es su sistema de **null-safety**, que reduce drásticamente los errores relacionados con `NullPointerException`.

En Kotlin, los tipos son **non-null por defecto**, lo que significa que una variable no puede contener un valor `null` a menos que se especifique explícitamente. Para permitir valores `null`, debes usar el **tipo nullable**, que se declara añadiendo un `?` al tipo.

### Tipos no null por defecto:

```kotlin
var nombre: String = "Dani"
nombre = null  // Error: Null can not be a value of a non-null type String
```

### En Java, esto sería válido:

```java
String nombre = "Dani";
nombre = null;  // Esto no lanza error en tiempo de compilación
```

### Tipos nullables:

Si necesitas que una variable acepte `null`, puedes declarar el tipo como nullable añadiendo `?`:

```kotlin
var nombre: String? = "Dani"
nombre = null  // Esto es válido
```
Con esto, Kotlin obliga a realizar comprobaciones explícitas antes de acceder a variables que podrían ser `null`.

### Safe calls y el operador `?.`

Kotlin proporciona el **operador de llamada segura (`?.`)** que te permite acceder a propiedades o llamar a métodos de una variable nullable de forma segura, sin riesgo de un `NullPointerException`.

```kotlin
val longitud: Int? = nombre?.length  // Retorna null si 'nombre' es null
```
En Java, necesitarías comprobar manualmente si el valor es `null`:

```java
String nombre = null;
int longitud = (nombre != null) ? nombre.length() : 0;
```

### El operador Elvis (`?:`)

Kotlin también tiene el operador Elvis (`?:`), que proporciona un valor por defecto en caso de que una variable sea `null`:

```kotlin
val longitud = nombre?.length ?: 0  // Si 'nombre' es null, se asigna 0
```
Esto evita la necesidad de escribir comprobaciones `if-else` innecesarias. En Java, este tipo de operación sería más verbosa.

---
Con estos conceptos, ya tienes una base sólida de las diferencias entre Java y Kotlin en cuanto a la declaración de variables, tipos de datos e inferencia, y cómo Kotlin maneja los tipos nulos de manera más segura.

En el próximo punto, profundizaremos en funciones en Kotlin, cómo se declaran, y cómo las funciones de orden superior y lambdas hacen que Kotlin sea aún más poderoso en comparación con Java.