#ifndef CARRITO_H
#define CARRITO_H
#include <vector>
#include "Producto.h"

class Carrito {
private:
    std::vector<Producto*> listaproductos;
    int totalAcumulado = 0;
public:
    void agregarProducto(Producto* p) {
        if(p) {
            listaproductos.push_back(p);
            totalAcumulado += p->getPrecio();
        }
    }
    // Retornamos por referencia constante para ser más eficientes
    const std::vector<Producto*>& getLista() const { return listaproductos; }
    int getTotal() const { return totalAcumulado; }
};
#endif