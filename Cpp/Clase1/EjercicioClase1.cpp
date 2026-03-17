#include <iostream>
#include <string>
using namespace std;

class Persona {
private:
    string nombre;
    int edad;

public:
    // Constructor
    Persona(string n, int e) {
        nombre = n;
        edad = e;
    }

    // Método para mostrar la info
    void mostrarDatos() {
        cout << "Nombre: " << nombre << ", Edad: " << edad << endl;
    }
};

int main() {
    // Instanciamos el objeto
    Persona estudiante("Pablo", 20);
    
    // Llamamos al método del objeto
    estudiante.mostrarDatos();

    return 0;
}