# Tienda de ordenadores
## Ejercicio para practicar la herencia y definición de un método abstracto

En una **tienda** se venden 2 tipos de ordenadores: **portátiles y de sobremesa.**

Ambos tipos de ordenadores se caracterizan por su **código y por su precio.**

Además, cada uno tiene un **eslogan** que es:

- "Ideal para sus viajes" en el caso de los portátiles
- "Es el que más pesa, pero el que menos cuesta" para el caso de los ordenadores de sobremesa.

El eslogan se obtiene mediante un método espécifico llamado **obtenerEslogan** que en cada caso devolverá un String con el eslogan correspondiente.

**Los ordenadores portátiles tienen además:**

- un atributo peso

**Los de sobremesa tienen además:**

- la descripción del tipo de torre.

Ten en cuenta además que el **método natural de ordenación** de los ordenadores será a través del código.

### Se pide:

- Definir e implementar las clases.
- Crear un programa en Java que cree un par de objetos de tipo Ordenador y Portatil que muestre las características de ambos. 
- Añadir dichos objetos a una colección dinámica (ArrayList) y devolverlos ordenados.
