# Calculadora POO

![image](https://user-images.githubusercontent.com/91023374/194544336-359660e2-45bd-47d8-864c-0af2ae3cb32a.png)

Recordad que ya programamos una calculadora en la UT03 para practicar con variables numéricas, operadores, estructuras de decisión, estructuras de repetición...

https://github.com/profeMelola/Programacion_2022-23/blob/main/UT03_Estructuras_Control/Calculadora/readme.md

Ahora toca hacer ese mismo programa pero en vez de programar de forma estructurada lo haremos usando el paradigma de Programación Orientada a Objetos.


![image](https://user-images.githubusercontent.com/91023374/197996494-e8d162ae-4a23-40e0-86be-07ae5cd0eab1.png)


## Objetivo: Programación estructurada vs POO

Como podréis comprobar al final de la práctica, la Calculadora Estructurada y la Calculadora POO funcionan exactamente igual, para el usuario es diferente. 
Lo que hemos cambiado es la forma en la que hemos programado!!!!

![image](https://user-images.githubusercontent.com/91023374/198002250-f92b174d-5b7d-4fa9-8504-f3d64d5b522d.png)

# Vamos a realizar dos tipos de programa Calculadora POO.

En ambos casos trabajaremos con **diferentes paquetes** y pondremos en práctica el concepto de **visibilidad** cambio la visibilidad de los métodos:
- public
- protected
- private


![Captura de pantalla 2022-10-26 121250](https://user-images.githubusercontent.com/91023374/198000549-855df116-3794-40cb-a976-23860fc44bfa.jpg)


## CalculadoraPOO: versión 1

![image](https://user-images.githubusercontent.com/91023374/197997786-5c5e200a-7bf0-435e-a2a7-c612728ae35b.png)


Con una nueva clase llamada **Operaciones** que va a contener solo métodos estáticos. Esta clase estará en el paquete **es.daw.util**

No vamos a crear objetos de ella, por tanto no se van a usar constructores.

Vamos a usar sus métodos estáticos (al estilo de los métodos de la clase Math) para realizar las operaciones de sumar, restar, multiplicar, dividir y módulo (resto de una división).

Además tendremos en el paquete **es.daw.util** la clase **Utilidades** donde estarán los métodos estáticos auxiliares o "útiles" para el programa. En nuestro caso el método para pintar el menú por consola: *public static void pintaMenu()*

## CalculadoraPOO: versión 2

![image](https://user-images.githubusercontent.com/91023374/197997866-a8feae2c-2313-41a5-8c81-7d2932d5233e.png)

Con una nueva clase llamada **Calculadora**. Esta clase estará en el paquete **es.daw.model**

Vamos a crear varios objetos Calculadora diferentes y aprenderemos **conceptos básicos de POO:**

- Atributos o propiedades de una clase.
- Constructores.
- Getters & setters.
- Métodos de comportamiento.


![Captura de pantalla 2022-10-26 124959](https://user-images.githubusercontent.com/91023374/198008224-f506dfbf-ac88-457b-8dbb-9cc745071e08.jpg)
