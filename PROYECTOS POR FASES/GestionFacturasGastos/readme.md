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

![Captura de pantalla de 2022-11-18 17-46-53](https://user-images.githubusercontent.com/91023374/202758101-a1c200cf-e12e-41b2-a6a2-66336b47a971.png)

![Captura de pantalla de 2022-11-18 17-47-05](https://user-images.githubusercontent.com/91023374/202758123-3704bd72-7fa0-45b1-8a8f-e14c23b26738.png)

![Captura de pantalla de 2022-11-18 17-47-17](https://user-images.githubusercontent.com/91023374/202758141-07a1d627-7487-48e6-a05c-3acb94964c03.png)

![Captura de pantalla de 2022-11-18 17-47-30](https://user-images.githubusercontent.com/91023374/202758170-824c28d5-7f60-4f3a-9097-c4b177ff89fe.png)

![Captura de pantalla de 2022-11-18 17-47-45](https://user-images.githubusercontent.com/91023374/202758188-3ca498fc-d77c-4ec1-bef0-002d90fc486c.png)




