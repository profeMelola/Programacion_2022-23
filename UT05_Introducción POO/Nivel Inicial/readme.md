# Ejercicios POO de nivel inicial. Personas

![image](https://user-images.githubusercontent.com/91023374/198572343-bd7162b2-2420-4b7a-8760-3284a5dda01a.png)

## Personas v1: con constructor por defecto

Crea un programa con una clase llamada Persona que representará los datos principales de una persona: dni, nombre, apellidos y edad.

Estos atributos serán públicos.

En el main de la clase principal instancia dos objetos de la clase Persona. 

Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos). 

Por último, imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de edad”.

## Personas v2: con constructor específico

Añade a Persona el siguiente onstructor y corrige el main para utilizarlo:

<code>
  
public Persona(String dni, String nombre, String apellidos, int edad) {

    this.dni = dni;
    
    this.nombre = nombre;
    
    this.apellidos = apellidos;
    
    this.edad = edad;
 
}
  
</code>


![image](https://user-images.githubusercontent.com/91023374/198569481-69609b0d-b389-46d4-a39d-b337dfb16470.png)


## Personas v3: con getters and setters

![image](https://user-images.githubusercontent.com/91023374/198569700-b627b130-b774-4abd-baaa-ad9336792c24.png)

![image](https://user-images.githubusercontent.com/91023374/200127840-12640f0e-5186-4d4d-b460-6f6c2c42b4d2.png)


Aplica el encapsulamiento básico a la clase Persona: 

- Declara todos sus atributos como private y crea todos los getters y setters necesarios (un get y un set por atributo).
- Corrige el main para utilizar los getters y setters. 
- Prueba a instanciar varios objetos, mostrar sus valores por pantalla, modificarlos, etc.


## Personas v4: con métodos útiles (de comportamiento)

![image](https://user-images.githubusercontent.com/91023374/198569875-6ad1b100-f7dd-455d-bd4a-66a59ee2c83a.png)

Añade a la clase Persona los siguientes métodos públicos:

- **public void imprime()** // Imprime la información del objeto: “DNI:… Nombre:… etc.”
- **public boolean esMayorEdad()** // Devuelve true si es mayor de edad (false si no).
- **public boolean esJubilado()** // Devuelve true si tiene 65 años o más (false si no).
- **public int diferenciaEdad(Persona p)** // Devuelve la diferencia de edad entre ‘this’ y p.

Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.

## Personas v5: con atributos static y final

![image](https://user-images.githubusercontent.com/91023374/198570402-3dc8fc6e-ba5d-452c-a94a-1a92e8730197.png)


### Ten en cuenta en tu programa:

El **DNI de una persona no puede variar**. Añade el modificador final al atributo dni y asegúrate de podrá utilizar porque Java no te dejará modificar el atributo dni.

La mayoría de edad a las 18 años es un valor común a todas las personas y no puede variar.  


**Crea un nuevo atributo llamado mayoriaEdad que sea static y final.** 

Tendrás que inicializarlo a 18 en la declaración. 

Utilízalo en el método que comprueba si una persona es mayor de edad.




