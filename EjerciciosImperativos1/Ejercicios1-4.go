package main

import (
	"bufio"
	"fmt"
	"os"
)

type calzadoObj struct {
	nombre   string
	precio   string
	cantidad int
}

func Ejercicio1() {
	numeroDeLineas := 0
	numeroDePalabras := 0
	numeroDeCaracteres := 0

	archivo, error := os.Open("./Texto.txt")
	if error != nil {
		fmt.Println("Hubo un error")
	}
	scanner := bufio.NewScanner(archivo)

	for scanner.Scan() {
		linea := scanner.Text()
		for _, letra := range linea {
			numeroDeCaracteres++
			if string(letra) == " " {
				numeroDePalabras++
			}
		}
		fmt.Println(linea)
		numeroDeLineas++
	}

	fmt.Println("\nNumero de lineas: ", numeroDeLineas)
	fmt.Println("Numero de palabras: ", numeroDePalabras)
	fmt.Println("Numero de caracteres: ", numeroDeCaracteres)
}

func Ejercicio2(asteriscosMax int) {
	imagenEspejo := []string{}

	if (asteriscosMax%2 == 0) || (asteriscosMax < 0) {
		fmt.Println("El valor es invalido")

	} else {
		espacios := (asteriscosMax / 2)
		asteriscos := 1

		for true {
			linea := ""
			for i := 0; i < espacios; i++ {
				fmt.Print("  ")
				linea = linea + "  "
			}
			for i := 0; i < asteriscos; i++ {
				fmt.Print(" *")
				linea = linea + " *"
			}
			espacios--
			asteriscos = asteriscos + 2
			fmt.Println("")
			imagenEspejo = append(imagenEspejo, linea)
			if espacios == 0 {
				for i := 0; i < asteriscosMax; i++ {
					fmt.Print(" *")
				}
				break
			}
		}
		println("")
		for i := len(imagenEspejo) - 1; i >= 0; i-- {
			fmt.Println(imagenEspejo[i])
		}

	}
}

func Ejercicio3(direccion int, rotaciones int) {

	lista := []string{"a", "b", "c", "d", "e", "f", "g", "h"}
	lista2 := []string{"", "", "", "", "", "", "", ""}

	if direccion == 0 {

		for x := 0; x < rotaciones; x++ {
			primerElemento := lista[0]

			for i := 0; i < len(lista)-1; i++ {
				lista2[i] = lista[i+1]
			}
			lista2[len(lista2)-1] = primerElemento

			copy(lista, lista2)
			for i := 0; i < len(lista2); i++ {
				lista2[i] = ""
			}

		}
		fmt.Println(lista)

	} else if direccion == 1 {

		for x := 0; x < rotaciones; x++ {
			ultimoElemento := lista[len(lista)-1]

			for i := 0; i < len(lista)-1; i++ {
				lista2[i+1] = lista[i]
			}
			lista2[0] = ultimoElemento

			copy(lista, lista2)
			for i := 0; i < len(lista2); i++ {
				lista2[i] = ""
			}

		}
		fmt.Println(lista)
	} else {
		fmt.Println("Direccion invalida")
	}
}

func Ejercicio4() {

	teni1 := calzadoObj{"Nike Mercurial", "35 mil", 4}
	teni2 := calzadoObj{"Adidas Up", "40 mil", 2}
	teni3 := calzadoObj{"Puma Fast", "30 mil", 3}
	teni4 := calzadoObj{"Reebok Fresh", "50 mil", 1}
	teni5 := calzadoObj{"Converse New", "20 mil", 2}
	teni6 := calzadoObj{"Vans Flama", "25 mil", 4}
	teni7 := calzadoObj{"Nike Air", "45 mil", 2}
	teni8 := calzadoObj{"Adidas Run", "55 mil", 3}
	teni9 := calzadoObj{"Puma Speed", "60 mil", 0}
	teni10 := calzadoObj{"Reebok Run", "65 mil", 3}

	calzado := map[int][]calzadoObj{
		34: []calzadoObj{teni1, teni3},
		36: []calzadoObj{teni2, teni3, teni10},
		38: []calzadoObj{teni5, teni7, teni8},
		40: []calzadoObj{teni4, teni6, teni9},
		42: []calzadoObj{teni2, teni4, teni6, teni8, teni10},
		44: []calzadoObj{teni3, teni5, teni7, teni9},
	}
	//Si se vende un calzado de una talla, se va a restar a todas las tallas que tengan ese objeto, sería crear más objetos para que no pase.

	for {
		fmt.Println("\n\n\n\nBienvenido a la tienda de calzado\n\n\n")
		fmt.Println("Total de calzado por talla: ")
		for x := range calzado {
			fmt.Println("-", x)
		}
		fmt.Println("Indique el numero de talla que desea consultar, 0 para salir")
		var talla int
		fmt.Scanln(&talla)

		if len(calzado[talla]) == 0 {
			fmt.Println("No hay calzado disponible en esta talla")
			break
		} else if talla == 0 {
			break
		} else {

			for i := 0; i < len(calzado[talla]); i++ {
				fmt.Println("------------------------------------")
				fmt.Println("Calzado numero: ", i+1)
				fmt.Println("Nombre del calzado: ", calzado[talla][i].nombre,
					"\nPrecio: ", calzado[talla][i].precio,
					"\nUnidades disponibles: ", calzado[talla][i].cantidad)
			}
			fmt.Println("\nQue calzado desea comprar? (Indique el numero)")
			var calzadoComprar int
			fmt.Scanln(&calzadoComprar)

			if calzado[talla][calzadoComprar-1].cantidad == 0 {
				fmt.Println("No hay unidades disponibles, presione enter para continuar...")
				fmt.Scanln(&calzadoComprar)
				fmt.Println("\n\n\n\n\n\n\n")
			} else {
				calzado[talla][calzadoComprar-1].cantidad = calzado[talla][calzadoComprar-1].cantidad - 1
				fmt.Println("Compra realizada con exito, presione enter para continuar...")
				fmt.Scanln(&calzadoComprar)
				fmt.Println("\n\n\n\n\n\n\n")
			}
		}
	}
}

func main() {
	Ejercicio1()

	//Ejercicio2(7) //Cuantos asteriscos tendra la linea central

	//Ejercicio3(0,2) //primer valor = rotacion :0 izq, 1 der ----- segundo valor = numero de rotaciones

	//Ejercicio4()

}
