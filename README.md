# TP1_GRUPO_2 - Ejercicios de Consola en Java
Este repositorio contiene la resolución de ejercicios de consola desarrollados en Java, correspondientes al TP1 de la materia Laboratorio de Computación IV de la Tecnicatura Universitaria en Programación en la Universidad Tecnológica Nacional - Facultad Regional General Pacheco (FRGP).

## Descripción
El proyecto consiste en la creación de un conjunto de clases y métodos en Java, aplicando conceptos fundamentales de la programación orientada a objetos, como encapsulamiento, constructores, y métodos estáticos.

## Estructura del Proyecto
El proyecto se organiza en paquetes, donde cada paquete corresponde a un ejercicio específico. A continuación, se describe la estructura básica:

TP1_GRUPO_2/
├── src/
│   └── ejercicio1/
│       ├── Empleado.java
│       └── Main.java
├── README.md
└── .gitignore

**src/**: Carpeta que contiene el código fuente.
**ejercicio1/**: Paquete que contiene la clase Empleado y la clase Principal con el método main.

## Ejercicios Desarrollados
**Ejercicio 1 - Propiedades**: Clase Empleado
int id: Identificador único del empleado, generado automáticamente.
String nombre: Nombre del empleado.
int edad: Edad del empleado.

**Ejercicio 2 - Encapsulamiento**:
Las propiedades de la clase están encapsuladas y se acceden a través de métodos getter y setter.

**Ejercicio 3 - Generación Automática del ID**:
El ID de cada empleado se genera automáticamente a partir del constructor de la clase. El primer ID es 1000, y se incrementa en 1 por cada nuevo empleado.

**Ejercicio 4 - Constructores**:
Constructor vacío: Asigna por defecto nombre = "sin nombre" y edad = 99.
Constructor con parámetros: Permite asignar el nombre y la edad al crear un nuevo empleado.

**Ejercicio 5 - Método Estático**:
int devuelveProximoID(): Devuelve el próximo ID a ser generado.

**Ejercicio 6 - Método toString()**:
Sobrescribe el método toString() para mostrar la información del empleado en un formato legible.

**Ejercicio 7 - Clase Principal con el Método main**:
Crea 5 empleados y muestra su información utilizando el método toString().
Muestra el próximo ID a ser generado utilizando el método devuelveProximoID().

##Instalación y Ejecución
1. **Clonar el repositorio**
   git clone https://github.com/tu-usuario/TP1_GRUPO_2.git](https://github.com/Aguirreignacio12/TP1_GRUPO_2
2. **Abrir el proyecto en tu IDE de preferencia **
3. **Compilar y ejecutar**

## Requisitos
**Java 8 o superior**: Verifica tener instalado el JDK correspondiente.r
