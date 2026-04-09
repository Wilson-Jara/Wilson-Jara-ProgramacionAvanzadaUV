# Ejercicio 2 - Sistema de Gestion de Proyectos

## Descripcion
Este proyecto en Java modela un sistema basico para calcular la remuneracion mensual de distintas personas que participan en un proyecto.

Se aplica herencia y polimorfismo para representar diferentes tipos de miembros, cada uno con su propia regla de calculo.

## Objetivo academico
Practicar los siguientes conceptos de Programacion Orientada a Objetos (POO):

- Clase abstracta
- Herencia
- Sobrescritura de metodos (`@Override`)
- Polimorfismo con arreglos de tipo base

## Estructura del proyecto
El proyecto contiene estos elementos principales:

- [README.md](README.md): documentacion general del proyecto.
- [src](src): codigo fuente Java.
- [bin](bin): salida compilada (.class) generada por `javac`.
- [lib](lib): carpeta reservada para dependencias externas (si se usan).

Dentro de [src](src) estan las clases del sistema:

- [src/App.java](src/App.java): punto de entrada del programa.
- [src/MiembroProyecto.java](src/MiembroProyecto.java): clase abstracta base.
- [src/Investigador.java](src/Investigador.java): miembro academico con bono por publicaciones.
- [src/DirectorProyecto.java](src/DirectorProyecto.java): investigador con bono adicional segun presupuesto.
- [src/FuncionarioAdministrativo.java](src/FuncionarioAdministrativo.java): miembro con pago por horas extra.
- [src/tiaDelAseo.java](src/tiaDelAseo.java): miembro con bono por labores de limpieza.

## Jerarquia de clases
La relacion entre clases es la siguiente:

1. `MiembroProyecto` (abstracta)
2. `Investigador` extiende `MiembroProyecto`
3. `DirectorProyecto` extiende `Investigador`
4. `FuncionarioAdministrativo` extiende `MiembroProyecto`
5. `tiaDelAseo` extiende `MiembroProyecto`

## Atributos y comportamiento comun
`MiembroProyecto` define datos y comportamiento base:

- Atributos privados:
	- `rut`
	- `nombre`
	- `salarioBase`
- Getters para acceder a esos datos.
- Metodos abstractos obligatorios:
	- `calcularRemuneracionMensual()`
	- `generarReporte()`

Esto obliga a que cada subclase implemente su propia logica de remuneracion.

## Reglas de calculo de remuneracion
Cada tipo de miembro calcula su pago mensual de forma distinta.

### 1) Investigador
Archivo: [src/Investigador.java](src/Investigador.java)

- Dato adicional: `publicacionesIndexadas`
- Formula:

$$
remuneracion = salarioBase + (publicacionesIndexadas \times 50000)
$$

### 2) Director de Proyecto
Archivo: [src/DirectorProyecto.java](src/DirectorProyecto.java)

- Hereda la logica de `Investigador`
- Dato adicional: `presupuestoAsignado`
- Formula:

$$
remuneracion = remuneracionInvestigador + (presupuestoAsignado \times 0.02)
$$

### 3) Funcionario Administrativo
Archivo: [src/FuncionarioAdministrativo.java](src/FuncionarioAdministrativo.java)

- Dato adicional: `horasExtras`
- Formula:

$$
remuneracion = salarioBase + (horasExtras \times 8500)
$$

### 4) tiaDelAseo
Archivo: [src/tiaDelAseo.java](src/tiaDelAseo.java)

- Dato adicional: `bonoLimpieza`
- Formula:

$$
remuneracion = salarioBase + (bonoLimpieza \times 30000)
$$

## Flujo del programa
En [src/App.java](src/App.java):

1. Se muestra un encabezado en consola.
2. Se crea un arreglo `MiembroProyecto[]` con distintos tipos de miembros.
3. Para cada objeto se ejecuta:
	 - `calcularRemuneracionMensual()`
	 - `generarReporte()`
4. Gracias al polimorfismo, cada objeto usa su implementacion correspondiente.

## Compilar y ejecutar
Desde la raiz del proyecto (`Ejercicio2`) en terminal:

```bash
javac -d bin src/*.java
java -cp bin App
```

## Ejemplo de salida esperada
La salida puede variar en formato numerico, pero sigue esta idea:

```text
---SISTEMA DE GESTION DE PROYECTOS---
Generando liquidaciones del mes

Academico: Andrea Gomez | RUT: 15.234.567-8
Remuneracion total: $752000.0

Funcionario: Roberto Silva | RUT: 12.345.678-9
Remuneracion total: $1350000.0
```

## Observaciones del codigo actual
- El nombre de la clase [src/tiaDelAseo.java](src/tiaDelAseo.java) no sigue la convencion usual de Java (normalmente seria `TiaDelAseo`).
- El metodo `getSalariobase()` en [src/MiembroProyecto.java](src/MiembroProyecto.java) podria renombrarse a `getSalarioBase()` por consistencia.
- En [src/tiaDelAseo.java](src/tiaDelAseo.java), el reporte imprime "Academico" aunque representa personal de aseo.

Estas observaciones no impiden la ejecucion, pero son buenas oportunidades de mejora.