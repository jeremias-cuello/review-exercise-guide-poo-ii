# PROGRAMACIÓN CON OBJETOS II | Universidad Nacional del Oeste

## Guía de Ejercicios 0: Repaso

En todos los ejercicios se deben utilizar clases e instanciar objetos

1. Escribir un método que reciba un número n y devuelva true si n es primo o false en caso contrario.

2. Escribir un método que calcule la suma de los múltiplos de 3 y 5, mayores o iguales que 0 y menores que un parámetro n. Por ejemplo, la llamada:

``` Java
sumaMultiplos(10); // devuelve 23 (3+5+6+9)
sumaMultiplos(16); // devuelve 60 (3+5+6+9+10+12+15)
```

3. Escribir un método que reciba un arreglo de enteros y devuelva true si el arreglo está ordenado de mayor a menor y false si está desordenado.

4. Escribir un método que reciba un arreglo de enteros y devuelva la suma de los elementos que se encuentran en posiciones pares (incluido el elemento de la posición 0). Por ejemplo:

    ``` Java
    Dado el arreglo [1, 2, 13 ,4, 8, 6] devuelve 22 (1+13+8)
    ```

5. Escribir un método que reciba dos matrices de NxN y devuelva la suma de las mismas.

   Podemos considerar que las matrices se representan como un arreglo bidimensional.

6. Escribir un método que reciba dos arreglos a1 y a2, de enteros ordenados de mayor a menor e intercale los elementos de los arreglos que recibe en un nuevo arreglo, tal que el arreglo resultante también esté ordenado. Por ejemplo:

    ``` Java
    a1 = [-5, 0, 0, 1, 5]
    a2 = [-10, 0, 7]
    resultado = [-10, -5, 0, 0, 0, 1, 5, 7]
    ```

7. Escribir un programa que genere un número entero aleatorio entre 0 y 1000 y le pida al usuario que lo adivine, si el usuario acierta debe responder con la cantidad de intentos y si el usuario no quiere continuar adivinando debe ingresar '*' y entonces debe mostrar cuál era el número.

8. Escribir un método que reciba como parámetro una matriz cuadrada de números reales y devuelva true (o false), si todos los elementos (fuera de la diagonal principal) están por encima de la media de los elementos de la diagonal principal.

9. Una señal de audio digitalizada puede representarse mediante dos conjuntos de enteros. El primero, cuyos valores varían entre ‘0’ (silencio) y ‘65536’ (máxima amplitud), representa la amplitud. El segundo, representa la frecuencia correspondiente a cada punto del primero, cuyos valores varían entre ‘300’ (tono grave) y ‘20000’ (tono agudo).

   Escribir un método que, dada la señal, aplique un filtro pasa-banda definido por dos tonos (inferior y superior), que deja en silencio todo valor fuera de ese rango. El resultado debe compactarse, eliminando los silencios generados por este filtro.

   Nota 1: Es estrictamente necesario aplicar el filtro primero, y luego compactar la señal.

   Nota 2: No debe perderse la señal original.

10. Escribir un método “consonantes” que recibe una cadena de caracteres y devuelve la cadena que resulta de eliminar todas las vocales de la cadena recibida. Por ejemplo:

    ``` Java
    consonantes("hola como estas"); // devuelve "hl cm sts"
    ```

11. Escribir un método “frecuencias” que reciba una cadena de caracteres muestre por pantalla la frecuencia de aparición de cada letra. Por ejemplo:
frecuencias("hola como estas..."); // debe mostrar por pantalla:
    ``` Java
    a: 2
    c: 1
    e: 1
    h: 1
    l: 1
    m: 1
    o: 3
    s: 2
    t: 1
    ```

12. Implementar la clase Hotel tal que tenga operaciones para:

    a. Crearla, con la cantidad de habitaciones que tiene.

    b. Ocupar una habitación disponible indicando la cantidad de personas mayores y menores (máximo 8 en total) que la ocuparán.

    c. Devolver la cantidad total de personas que ocupan todas las habitaciones del hotel.

    d. Devolver la cantidad de habitaciones que están ocupadas por tantos mayores como los indicados por parámetro.

    e. Devolver un arreglo de enteros de longitud 9, tal que en la posición i del arreglo se guarde la cantidad de habitaciones con i personas.

