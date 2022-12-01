# EJERCICIO: Sistema de gestión de tarjetas de crédito

![image](https://user-images.githubusercontent.com/91023374/198006016-c673110b-ce5e-40fb-a8a1-3e5bbdf66498.png)


## ENUNCIADO DEL EJERCICIO

Vas a desarrollar un **sistema de gestión de tarjetas de crédito.** 

### Para dar de alta una tarjeta es necesario proporcionar la siguiente información:

- **El número de la tarjeta:** formado por 16 dígitos.
- **El titular** de la tarjeta.
- **El saldo** con el que contratas la tarjeta.
- **El límite de gasto diario con la tarjeta:** si no se indica el límite este se asignará con un valor por defecto de 1000 (valor constante que no va a cambiar).

### Además hay que tener en cuenta que al dar de alta una tarjeta de forma automática:

- **Entidad:** todas las tarjetas tendrán la misma entidad "DAW_BANK" siendo un valor constante que no va a cambiar.
- **Fecha de caducidad:** se le asigna una fecha de caducidad siendo esta un año posterior a la fecha de alta de la tarjeta.
- **Código CVV:**  se genera un código comprendido entre 100 y 999.
- **Activa:** se activa la tarjeta.

Por otro lado, cada vez que se da de alta una tarjeta el sistema llevará el control de número de tarjetas dadas de alta.



En la clase principal del programa se creará un array de objetos **Tarjeta.**

## Clase Tarjeta

![image](https://user-images.githubusercontent.com/91023374/204291310-c883357e-5af1-4ecc-98ff-791984151244.png)


**Formas de dar de alta una tarjeta en el sistema:**

![image](https://user-images.githubusercontent.com/91023374/204291668-fb69bad1-1cd2-4a69-baf8-7320592a9f0b.png)
