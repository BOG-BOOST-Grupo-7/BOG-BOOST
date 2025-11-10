import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class cotizaciones.java {

    // Aquí defines la mejor opción como administrador
    private String mejorOpcion = "Opción definida por el administrador";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Endpoint que devuelve la mejor opción
    @GetMapping("/mejor-opcion")
    public String getMejorOpcion() {
        return mejorOpcion;
    }

    // Si quieres cambiar la mejor opción desde el backend
    @PostMapping("/mejor-opcion")
    public String setMejorOpcion(@RequestParam String opcion) {
        this.mejorOpcion = opcion;
        return "Mejor opción actualizada a: " + opcion;
    }
}