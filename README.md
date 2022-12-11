<h1>Explicación de los cambios realizados del ejercicio Dice Roll</h1>


### Aplicación con Strings con diferentes idiomas

Para poder utilizar la app con diferentes idiomas se utilizan los recursos de string,  en los cuales  almacenamos el contenido en un archivo xml en lugar de cargar el texto directamente desde el código.
Creamos en values  un nuevo fichero con el nombre strings dónde  cambiaremos el nombre de la app y el texto según idiomas.
Aquí añado una captura de como se hace.

![Foto](https://github.com/EricBorder/RollerDice/blob/modificaciones/app/src/main/res/drawable/strings.png)


Estos strings se llaman en  el layout para para que los elementos de la aplicación cambien de idiomas.

Ejemplo :

```ruby
<Button
        android:id="@+id/roll_button"
        style="@style/Widget.MaterialComponents.Button.TextButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="136dp"
        android:layout_marginTop="500dp"
        android:text="@string/roll"
        app:icon="@drawable/goku"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/image" />
```

### Añadimos imagenes distintas

Para utilizar imagenes se utiliza  ImageView.
El control **ImageView** permite mostrar imágenes en la aplicación.
Normalmente estas imágenes tendrán origen en el identificador de un recurso de nuestra carpeta _/res/drawable_,  y se id en el layout a través de la propiedad `android:src="@drawable/goku"`. Siendo esta última un ejemplo de imagen utilizada.





### Cambiamos la función random
Cambiamos la función ramdon por otra parecida que hace lo mismo,  se le da un rango en el que puede variar el valor obtenido.
~~~

val randomInt = (1..6).random()

~~~

### Modificamos el botón para usar material.io y que tenga asociado un icono

Para poder usar material.io y darle un estilo diferente al botón primero debemos implementar la dependencia de matrial.io en el build.gradle (Module) :    `'com.google.android.material:material:1.7.0'`
y así poder acceder a sus recursos.
Luego definimos el estilo en styles y lo  añadimos al estilo al elemento que deseemos modificar, en este caso el botón.
Lo añadimos de la siguiente manera  `style="@style/Widget.MaterialComponents.Button.TextButton`
para que el fondo del botón sea transparente.
Para añadir un icono lo que tenemos que hacer es descargarlo y añadirlo a drawable, una vez añadido mediante la propiedad app:icon del botón lo llamaremos.


