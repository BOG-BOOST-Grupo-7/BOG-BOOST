public class cotizaciones {
  public static void cotizaciones(String[] args) {
    System.out.println("Torre admin");
  }
}
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class cotizaciones extends Application {

    // Cuadros de texto
    private Cpu Torre Intel Core I5 4ta Ram 8gb Ssd 256gb Reacondiciono opcion1;
    private Cpu Torre Intel Core I7 6ta Gen Ram 8gb Disco 500gb 8 Gb opcion2;
    private Gabinete Xtech Atx Micro Atx Kit Teclado Mouse Y Bocinas opcion3;

    // Aquí defines cuál es la mejor opción como administrador
    // Puedes cambiar a "opcion1", "opcion2" o "opcion3"
    private String mejorOpcion = "opcion2";

    @Override
    public void start(Stage primaryStage) {
        opcion1 = new TextField("Texto opción 1");
        opcion2 = new TextField("Texto opción 2");
        opcion3 = new TextField("Texto opción 3");

        Button botonMejorOpcion = new Button("Dame la mejor opción");
        botonMejorOpcion.setOnAction(e -> mostrarMejorOpcion());

        VBox layout = new VBox(10); // Espaciado de 10px
        layout.getChildren().addAll(opcion1, opcion2, opcion3, botonMejorOpcion);

        Scene scene = new Scene(layout, 400, 200);

        // Aquí puedes aplicar un CSS externo si quieres
       scene.getStylesheets().add("cotizaciones.css");

        primaryStage.setTitle("Selecciona la mejor opción");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mostrarMejorOpcion() {
        switch (mejorOpcion) {
            case "opcion1":
                opcion2.clear();
                opcion3.clear();
                break;
            case "opcion2":
                opcion1.clear();
                opcion3.clear();
                break;
            case "opcion3":
                opcion1.clear();
                opcion2.clear();
                break;
            default:
                System.out.println("No se ha definido una mejor opción válida.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
