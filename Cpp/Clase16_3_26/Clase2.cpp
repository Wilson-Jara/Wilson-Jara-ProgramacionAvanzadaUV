#include <iostream>
#include <string>

// La clase Auto representa un vehículo con marca, modelo y color.
class Auto {
public:
    // Marca del auto.
    std::string marca;
    // Modelo del auto.
    std::string modelo;
    // Color del auto.
    std::string color;

    // Método para mostrar la información del auto.
    void encenderAuto() {
        std::cout << "El auto " << marca << " Modelo " << modelo << " De color " << color << std::endl;
    }
};

// Función principal del programa.
int main() {
    // Crea dos objetos de la clase Auto.
    Auto miPrimerAuto;
    Auto autoEmpresa;

    // Asigna valores a los atributos del primer auto.
    miPrimerAuto.marca = "Toyota";
    miPrimerAuto.modelo = "Corola";
    miPrimerAuto.color = "rojo";

    // Llama al método para mostrar la información del auto.
    miPrimerAuto.encenderAuto();

    return 0;
}
