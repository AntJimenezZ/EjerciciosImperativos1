package main

import (
	"fmt"
	"sort"
)

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos

func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {
	*l = append(*l, producto{nombre: nombre, cantidad: cantidad, precio: precio})

}

func llenarDatos() {
	lProductos.agregarProducto("arroz", 15, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 12, 4500)

}

func (l *listaProductos) aumentarInventarioDeMinimos(valorMinimo int) listaProductos {

	for i := 0; i < len(*l); i++ {
		if (*l)[i].cantidad < valorMinimo {
			cantidadFaltante := valorMinimo - (*l)[i].cantidad
			(*l)[i].cantidad = (*l)[i].cantidad + cantidadFaltante
		}
	}
	return nil
}

func (l *listaProductos) ordenarListaDeProductos() {

	sort.Slice(*l, func(x, y int) bool {
		return (*l)[x].precio < (*l)[y].precio
	})

}

func main() {
	llenarDatos()
	lProductos.aumentarInventarioDeMinimos(20) //Valor mínimo de existencia de productos

	lProductos.ordenarListaDeProductos() //Lo ordena por precio
	fmt.Println(lProductos)
}
