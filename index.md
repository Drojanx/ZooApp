## El gestor de Zoos del Siglo XXI

ZooApp te permite controlar al 100% tu Zoo, permitiendote almacenar información de tus trabajadores, recintos y animales

### Adelanto

A modo de presentación, este sería el menú principal de la aplicación y lo primero que vería un usuario

```markdown
********ZooApp********
    1.Crear entrada
    2.Ver entrada
    x.Salir
```
Aquí el usuario podrá escribir una de las 3 opciones, bien para ver las demás funcionalidades del programa o bien para cerrarlo.

Por ejemplo, si quisiese dar de alta un cuidador y luego visualizarlo haría lo siguiente (`Esto` es lo introducido por el usuario):

```markdown
`1`
      1.Cuidador
      2.Oficinista
      3.Animal
      4.Recinto

`1`
Debe introducir una opcion de las indicadas: 
Cuidador:
    DNI:
`11111111A`
    Nombre:
`Ejemplo`
    Apellido:
`Example`
    Nº tfno:
`976543210`
    Turno:
`Mañanas`
    Salario:
`1200`
Cuidador creado.
********ZooApp********
    1.Crear entrada
    2.Ver entrada
    x.Salir
`2`
      1.Cuidador
      2.Oficinista
      3.Animal
      4.Recinto
`1`
Introduce DNI del cuidador que busca: 
`11111111A`
Cuidador{
    Nombre:     Ejemplo
    Apellidos:  Example
    DNI:        11111111A
    Turno:      Mañanas
}

********ZooApp********
    1.Crear entrada
    2.Ver entrada
    x.Salir
```

El gitHub del proyecto es el siguiente: (https://github.com/Drojanx/ZooApp/).

### Alejandro Lanz
