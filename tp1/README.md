# programacion4-tp1

IMPORTANTE: Para resolver estos ejercicios deberá crear un proyecto de
consola JAVA con el siguiente nombre: TP1_GRUPO_X

TRABAJO PRÁCTICO N°1
EJERCICIO 1:
Todas las clases pertenecientes a este ejercicio se crearán dentro de paquete llamado ejercicio1.

1. Crear una clase Persona con las siguientes propiedades:

   ```java
       String dni;
       String nombre;
       String apellido;
       LocalDate fechaNacimiento;
       String genero;
       String direccion;
       String telefono;
       String email;
   ```

   Aplicar el concepto de encapsulación dentro de la clase Persona y el método toString().

2. Crear una clase Empleado que herede de la clase Persona y que contenga
   los siguientes atributos
   int legajo;
   String puesto;
   Aplicar el concepto de encapsulación dentro de la clase Empleado y el método toString().

3. El legajo del Empleado debe ser generado automáticamente a partir de
   la clase, el primer legajo será el número 1000 e irá incrementando en 1 por
   cada nuevo empleado agregado. El legajo del empleado deberá ser
   generado en el constructor de la clase. Una vez que se le asigne un legajo,
   éste no podrá ser modificado, por lo que el legajo debe ser una variable
   constante.

4. La clase Persona tendrá dos constructores.
   - a) El primer constructor será vacío y cargará por defecto en la variable
     nombre: “sin nombre” y en la variable edad: “99”.
   - b) El segundo constructor recibirá los atributos (dni, nombre, apellido,
     fecha de nacimiento, genero, dirección, teléfono, email)

5. La clase Empleado tendrá dos constructores.
   - a) El primer constructor será vacío y llamará al constructor vacio de
     Persona.
   - b) El segundo constructor recibirá los atributos de persona y de
     Empleado (dni, nombre, apellido, fecha de nacimiento, genero,
     dirección, teléfono, email, puesto). No recibe el legajo ya que éste
     se genera automáticamente.

6. Crear un método estático en la clase Empleado que devuelva el próximo
   legajo a ser generado: “int devuelveProximoLegajo()”. Por ejemplo, si el
   último Legajo fue el número 1444, el método devolverá el número 1445.

7. Crear una clase llamada principal y dentro de ésta crear el main:
   En el main se deberán crear 5 empleados (Con toda su información de
   persona y empleado) y mostrar su información correspondiente utilizando
   el método toString(). Algunos empleados crearlos con el constructor vacío
   y otros con el constructor con parámetros. También deberán mostrar la
   información que devuelve el método devuelveProximoLegajo(), con el
   siguiente cartel, por ejemplo, “El próximo legajo será el 1445”.
