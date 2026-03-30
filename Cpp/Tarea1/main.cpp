#include "GeneradorTicket.cpp" // Supongamos que guardaste tu clase ahí

int main() {
    // 1. Crear productos
    Producto* p1 = new Producto("Leche", 1200);
    Producto* p2 = new Producto("Pan", 1500);

    // 2. Llenar el carrito
    Carrito miCarrito;
    miCarrito.agregarProducto(p1);
    miCarrito.agregarProducto(p2);

    // 3. Generar el ticket
    GeneradorTicket generador;
    generador.crearArchivoTXT(miCarrito);

    // 4. Limpieza (Importante al usar punteros)
    delete p1;
    delete p2;

    return 0;
}