# Investigacion sobre JavaFX

## Contenido
1. [JavaFX](#java-fx)
   1. [Funcionamiento]()
   2. [Contexto]()
   3. [Sintaxis]()
2. [Java Swing](#java-swing)
   1. [Funcionamiento]()
   2. [Contexto]()
   3. [Sintaxis]()
3. [Diferencias entre JavaFX y Swing](#dif-fx-swing) 
4. [Calculadora cientifica en JavaFX](#cal-java-fx)
   1. [Explicacion del desarrollo]()
   2. [Resultados]()
5. [Entegrables](#entre)
   1.   [Reporte]()
   2. [Código]()
   
****   
### JavaFX 
 JavaFX es una tecnología de software que, combinada con Java, permite crear y desplegar aplicaciones con un aspecto vanguardista y contenidos avanzados, audio y vídeo. Es decir es un conjunto de gráficos y paquetes de comunicación que permite a los desarrolladores para diseñar, crear, probar, depurar y desplegar aplicaciones cliente enriquecidas que operan constantemente a través de diversas plataformas.
 Contiene un ambiente de ejecución de plataforma cruzada(Java  SE,  Java  EE,  ME) y  una  plataforma  específica.
 
 Características principales de JavaFX:
 
   * Permite a los desarrolladores integrar gráficos vectoriales, animación, sonido y activos web de vídeo en una aplicación interactiva, completa y atractiva
  
   * Amplía la tecnología Java permitiendo el uso de cualquier biblioteca de Java en una aplicación JavaFX
  
   * Permite mantener un eficaz flujo de trabajo entre diseñador y desarrollador en el que los diseñadores pueden trabajar en las herramientas que deseen mientras colaboran con los desarrolladores


#### Funcionamiento
Pasos:

#### Contexto
Con JavaFX puedes construir muchos tipos de aplicaciones. Por lo general, son las aplicaciones de red y estas que se implementan a
través de múltiples plataformas y mostrar información en una interfazde usuario moderna de alto rendimiento que cuenta con audio, vídeo, gráficos y animación.

Estructura de una aplicacion JavaFX:
Stage (Escenario): es elcontenedor de nivel superior y contiene la escena.
Scene (Escena): Contiene los nodos(controles) que conforman la parte grafica de la escena.
Nodos(Controles): son los componentes que permiten al usuario interactuar con la aplicación.


#### Sintaxis 

**** 
### Java Swing

#### Funcionamiento
Pasos:

#### Contexto

#### Sintaxis 

### Diferencias entre JavaFX y JavaSwing
Algunas de las diferencias más importantes son:
* JavaFX soporta propiedades a través de sus clases, por lo tanto JavaFX proporciona manejo de eventos que son inauditos en Swing.
* JavaFX pueden ser personalizados con CSS, puedes controlar el formato a través de CSS. Los aspectos de apariencia pueden ser configurados mediante reglas de estilo y cambiar la apariencia por medio de la llamada de un método.
* Las animaciones son mucho mas sencillas en JavaFX, debido a que cuentan con un soporte incorporado y para animaciones sofisticadas y JavaSwing no provee ningún soporte directo.
* En Java Swing, un layout es asociado con un JPanel y en JavaFX, los layouts son subclases de la clase Node.
* Swing carece de soporte para dispositivos modernos con interfaces touch, por el contrario JavaFX tiene soporte incorporado para gestos comunes en interfaces touch.
* JavaFX no tiene un equivalente a JOptionPane como en Swing, el cual es útil para mostrar mensjes de alerta u obtener respuesta del usuario..
 
****
### Calculadora cientifica en JavaFX
A continuacion se presenta el proceso del desarrollo de la calculadora cientifica con JavaFX
#### Requisitos
Para poder crear aplicaciones con JavaFX es necesario contar con un JDK 7.80 o inferior, ya que las versiones recientes dejaron a Java FX fuera del paquete del JDK.
[(Pueden descargar aqui la version 7u80 del JDK de Java)](https://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html)

(Opcionalmente)
Para lograr una buena experencia con el diseno de las interfaces en JavaFX, Oracle sigue poniendo a disposicion una herramienta libre llamada [JavaFX Scene Builder](https://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-info-2157684.html), que nos permite visualizar las interfaces disenadas con JavaFX, sin necesidad de codificar esas interfaces. 

#### Empezemos
Para iniciar, debemos de aclarar que cada IDE (NetBeans, IntelliJ, Eclipse, etc) tiene sus propias funcionalidades para crear plantillas para crear la base de una app JavaFX.

En este caso, para IntelliJ el procedimiento estara en este [link](https://www.jetbrains.com/help/idea/preparing-for-javafx-application-development.html).

Una vez que abran sus IDE favorita, deberan de crear un nuevo proyecto.
Tomen en cuenta que para crear una app JavaFX deberan de tener ya instalado una version que lo soporte (<= 7u18)  

![](.TUTORIAL_images/crear_proy.png)

Asignen un nombre al proyecto.

![](.TUTORIAL_images/asginar_nom.png)

Una vez que ya allan hecho todos los pasos anteriores correctamente. La IDE les creara tres archivos necesarios para el dessarrollo de la app.

**sample.fxml**

```
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.geometry.Insets?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<GridPane fx:controller="Controller"
          xmlns:fx="http://javafx.com/fxml" alignment="center" hgap="10" vgap="10">
</GridPane>
```  

**Controller.java**

```
public class Controller {

} 
```

**Calculadora.java** 
``` 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculadora extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
```

Si compilamos y ejecutamos la aplicacion, el resultado seria algo asi.

![](.TUTORIAL_images/resul.png)