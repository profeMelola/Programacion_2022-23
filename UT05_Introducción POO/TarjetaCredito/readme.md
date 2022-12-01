# EJERCICIO: Sistema de gestión de tarjetas de crédito

## INTRODUCCIÓN A POO

![image](https://user-images.githubusercontent.com/91023374/198006016-c673110b-ce5e-40fb-a8a1-3e5bbdf66498.png)


## ENUNCIADO DEL EJERCICIO (quedó incompleto en la clase del miércoles 30 de noviembre)

Vas a desarrollar un **sistema de gestión de tarjetas de crédito.** 

### Para dar de alta una tarjeta es necesario proporcionar la siguiente información:

- **El número de la tarjeta:** formado por 16 dígitos. Damos por hecho que el número introducido por el usuario será único.
- **El titular** de la tarjeta.
- **El saldo** con el que contratas la tarjeta.
- **El límite de gasto diario con la tarjeta:** si no se indica el límite este se asignará con un valor por defecto de 1000 (valor constante que no va a cambiar).

### Además, hay que tener en cuenta las siguientes cosas al dar de alta una tarjeta de forma automática:

- **Entidad:** todas las tarjetas tendrán la misma entidad "DAW_BANK" siendo un valor constante que no va a cambiar.
- **Fecha de caducidad:** se le asigna una fecha de caducidad siendo esta un año posterior a la fecha de alta de la tarjeta.
- **Código CVV:**  se genera un código comprendido entre 100 y 999.
- **Activa:** se activa la tarjeta.

Por otro lado, cada vez que se da de alta una tarjeta el sistema llevará el control del número de tarjetas dadas de alta. Valor que podrá consultarse en cualquier momento.

### También hay que tener en cuenta que:

Una vez dada de alta la tarjeta solo podrá modificarse el titular de la tarjeta, su saldo y el límite de gasto.

### Finalmente las acciones que se podrán realizar con la tarjeta serán:

- **Pagar:** indicando el importe del pago. Solo se podrá pagar si la tarjeta está activa (verificarlo previamente). En el caso de que hubiera algún problema en el pago se mostrará un mensaje por consola y se controlará a través de un booleano si ha habido error o no.

Al pagar hay que tener en cuenta que el importe no puede ser superior al saldo de la tarjeta y que no sea superior al límite diario.

- **Desactivar** la tarjeta.


### Requisitos del sistema

**Debes implementar un menú con las siguientes opciones:**

*************************************************************

            **MENÚ DEL SISTEMA DE GESTIÓN DE TARJETAS**
1. Dar de altas tarjetas de crédito.
2. Mostrar información de todas las tarjetas.
3. Mostrar información de una tarjeta a través de su número identificativo.
4. Pagar
5. Desactivar tarjeta
6. Salir

**************************************************************

El sistema debe preguntar el usuario por el número de tarjetas que va a dar de alta en el sistema quedando todas ellas guardadas en una misma estructura (un array).

Por cada tarjeta es necesario pedir la información pertinente. Crea tarjetas de las dos formas posibles (con y sin límite de gasto).

Realiza el pago con diferentes tarjetas simulando los diferentes casos de uso:
- Pagar con un importe superior al saldo de la tarjeta. Mostrar mensaje de aviso.
- Pagar con un importe superior al límite diario. Mostrar mensaje de aviso.
