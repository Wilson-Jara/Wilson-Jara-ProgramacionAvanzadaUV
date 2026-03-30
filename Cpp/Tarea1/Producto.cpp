#ifndef PRODUCTO_H
#define PRODUCTO_H
#include <string>

class Producto {
private:
    std::string nombre;
    int precio;
public:
    Producto(std::string n, int p) : nombre(n), precio(p) {}
    virtual ~Producto() {}
    virtual int getPrecio() const { return precio; }
    virtual std::string getNombre() const { return nombre; }
};
#endif