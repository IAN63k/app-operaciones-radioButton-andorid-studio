# app-operaciones-radioButton-andorid-studio
### Aplicación implementando radiobutton para la opción de la operación (Suma, resta, exponente, radicación) a realizar.
#### _Distribución de los elementos_
  En primera instancia se creó el diseño de la app para realizar las operaciones. 
  Los elementos usados fueron, TextView,  EditText de tipo Number, Button  y radioButton contenidos dentro de un radioGroup dado que este último implementa a opción de la desselecion de los radiobutton:
  
![Screenshot 2022-10-21 150847](https://user-images.githubusercontent.com/81268917/197280462-ec476cec-810a-4175-8cbd-f4efc04cb31f.jpg)

  Para estos elementos se creó esta disposición de entrada, con un color de fondo oscuro y dos campos de texto para el ingreso de los datos “A” y “B”:
  
![Screenshot 2022-10-21 150936](https://user-images.githubusercontent.com/81268917/197280559-5c637999-d31a-4bb9-aab0-55519496320e.jpg)

#### _Método de operación_

 En la Clase principal, la MainActivity es la encargada de establecer la conexión lógica del programa, en este caso de declarar -
 las variables por referencia hacia los elementos de la activity, y de esta forma establecer las operaciones para cada una de las opciones de los radiobutton.

 Por medio de este método se realizarán las operaciones de suma, resta, exponente y radicación entre los datos A y B y su resultado se visualizará 
 en el TextView con el id txtV.
 
 Una vez finalizado el código, se le establece el atributo para el evento de onclick en el botón, con el fin de realizar el llamado el método _“operation”_.

