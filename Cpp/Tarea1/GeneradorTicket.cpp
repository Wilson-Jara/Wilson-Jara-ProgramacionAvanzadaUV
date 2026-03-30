#include <fstream>
#include <iostream>
#include <vector>
#include <string>
#include "Carrito.cpp" // Asegúrate de que Carrito incluya a Producto.h

class GeneradorTicket {
public:
    void crearArchivoTXT(const Carrito &carritoVenta) {
        std::ofstream archivo("ticket.txt");
        
        if (!archivo.is_open()) {
            std::cerr << "Error I/O crítico: No se pudo abrir el archivo" << std::endl;
            return;
        }
        
        archivo << "====================" << std::endl;
        archivo << "  Supermercado POO  " << std::endl;
        archivo << "====================" << std::endl;
        
        // Usamos los getters definidos en la clase Producto
        for (const auto& p : carritoVenta.getLista()) {
            archivo << "- " << p->getNombre() << ": $" << p->getPrecio() << std::endl;
        }
        
        archivo << "--------------------" << std::endl;
        archivo << "   Total a Pagar: $" << carritoVenta.getTotal() << std::endl;
        archivo << "====================" << std::endl;
        
        archivo.close();
        std::cout << "Archivo generado con éxito." << std::endl;
    }
};