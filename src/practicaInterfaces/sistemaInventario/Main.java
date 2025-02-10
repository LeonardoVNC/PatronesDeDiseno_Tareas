package practicaInterfaces.sistemaInventario;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Electronico e = new Electronico("Arduino UNO", 11813, 40, 23);
        Ropa r = new Ropa("Camisa negra", 117, 35, 40);
        Alimento l = new Alimento("Leche", LocalDate.of(2024,2,2), 15, 30);
        Alimento m = new Alimento("Manzanas", LocalDate.of(2025,2,26), 8, 55);
        Alimento d = new Alimento("Duraznos", LocalDate.of(2025,3,1), 6, 85);

        inv.comprobarProducto(e);
        inv.comprobarProducto(r);
        inv.comprobarProducto(l);
        inv.verificarAlmacenable(l);
        inv.verificarAlmacenable(m);
        inv.verificarAlmacenable(d);
    }
}
