# Programa para la gestión de facturas y gastos de una empresa

![image](https://user-images.githubusercontent.com/91023374/201478111-63d27b23-3b09-4b16-84db-39ab6fa6f3d5.png)


## Versión 1: bucles anidados + acumuladores

Repasa lo que hicimos en este ejercicio:

https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/Bucles_Anidados/FacturasGastos

## Versión 2: con array bidimensional

Vamos a programar la misma lógica pero guardando el importe de los gastos de cada factura en un array de 2 dimensiones

![image](https://user-images.githubusercontent.com/91023374/201478297-2c2a075f-7439-4a26-bdab-23e44166d373.png)


### Versión 2.1: Matriz regular: mismo número de gastos por factura

1. Manteniendo el enunciado del programa (versión 1), debes modificar la lógica del mismo para trabajar con un array bidimensional (matriz)
2. Para ello ten en cuenta que :
- Necesitas crear un array de N filas (donde N es el número de facturas) y M columnas (donde M es el número de gastos por factura).
- El número de facturas (N) las indicará el usuario y el número de gastos por factura ( M, el mismo para cada factura ) también lo introducirá el usuario 
3. Métodos nuevos que debes implementar:

**imprimeFacturas**

Este método debe mostrar por pantalla el contenido del array bidimensional


**obtenerImporteTotalGastosFactura**

Este método debe devolver el importe total de gastos de una factura concreta

**obtenerImporteTotalFacturas**

Este método debe devolver el importe total de gastos de todas las facturas


**AYUDA TEÓRICA: REPASO DE CONCEPTOS**

![image](https://user-images.githubusercontent.com/91023374/137719700-dabd81f2-f023-4302-b5d5-00d2602ecb81.png)


### Versión 2.2: Matriz irregular: distinto número de gastos por factura

![image](https://user-images.githubusercontent.com/91023374/201478366-a46423cc-5867-4f3f-9aed-594b3f84fb0a.png)

Ahora el número de gastos por factura puede ser distinto.

Recuerda que el número de facturas (N) las indicará el usuario y que el número de gastos por factura es variable (M) y también lo introducirá el usuario.

******************************************

****** MENÚ CON DIFERENTES OPCIONES ******
1. INFORME COMPLETO: Obtener informe con los gastos de cada factura, el importe final de la factura y el importe total de todas las facturas
2. INFORME FACTURA: Obtener información de todos los gastos de una factura en contrecto (que especificará el usuario por número), ordenados de mayora a menor indicando el número de gastos totales y el importe total.
3. BUSCAR GASTO: Obtener información de la factura o facturas donde se encuentra el importe de un gasto en concreto que especificará el usuario.
****************************************



**REPASO TEORÍA: Declaración de un array bidimensional irregular**

// Cuando se sepa el número de facturas. Declaración del array bidimensiona

float[][] facturas = new float[numFacturas][];

// Todavía no se sabe el  número de gastos por factura

float[] gastos = null; //no sería necesario inicializarlo a null porque por defecto se inicializa a null

// Cuando se sepa el número de gastos por factura

gastos = new float[numGastos];

facturas[indice] = gastos; //inicializando cada posición del array de facturas con otro array.


#### Ejemplo de salida por consola tras la ejecución del programa

run:
* Indica el número de gastos de la factura <1>
3
* Indica el número de gastos de la factura <2>
2
* Introduce los gastos de la factura <1>
	* Gasto <1> :
100
	* Gasto <2> :
35
	* Gasto <3> :
25,5
* Introduce los gastos de la factura <2>
	* Gasto <1> :
50
	* Gasto <2> :
15
**** MENÚ ****
1. Informe completo
2. Informe factura
3. Buscar gasto
4. Salir
Elige una opción: 
1
	Factura (1): 
	Gasto (1): 100.0
	Gasto (2): 35.0
	Gasto (3): 25.5
Factura 1, total importe: 160.5 euros.
	Factura (2): 
	Gasto (1): 50.0
	Gasto (2): 15.0
Factura 2, total importe: 65.0 euros.
Importe total: 225.5 euros.
**** MENÚ ****
1. Informe completo
2. Informe factura
3. Buscar gasto
4. Salir
Elige una opción: 
2
	Indica el número de factura:
1
Gastos ordenados de mayor a menor:
100.0 euros.
35.0 euros.
25.5 euros.
Factura 1: número totales de gastos <3>. Importe total de la factura <160 euros>
**** MENÚ ****
1. Informe completo
2. Informe factura
3. Buscar gasto
4. Salir
Elige una opción: 
3
	Indica el importe del gasto que quieres buscar:
100
El gasto con importe de 100.0 euros se encuentra en la Factura < 1 >
**** MENÚ ****
1. Informe completo
2. Informe factura
3. Buscar gasto
4. Salir
Elige una opción: 
3
	Indica el importe del gasto que quieres buscar:
43
No se encuentra ningún gasto con importe de 43.0 euros.
**** MENÚ ****
1. Informe completo
2. Informe factura
3. Buscar gasto
4. Salir
Elige una opción: 
4
Vas a salir del programa
BUILD SUCCESSFUL (total time: 1 minute 3 seconds)




