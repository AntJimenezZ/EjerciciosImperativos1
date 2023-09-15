

//Primer ejercicio
let desplazar lista n direccion =
    let longitud = List.length lista
    if direccion = "izquierda" then 
        if n >= longitud then List.init longitud (fun _ -> 0)
        else
            let parteInicial = List.skip n lista
            let parteFinal = List.init n (fun _ -> 0)
            parteInicial @ parteFinal
    else if direccion = "derecha" then
        if n >= longitud then List.init longitud (fun _ -> 0)
        else
            let parteFinal = List.take (longitud - n) lista
            let parteInicial = List.init n (fun _ -> 0)
            parteInicial @ parteFinal
    else
        lista


let listanumeros = [1..5]

let listaDesplazada = desplazar listanumeros 3 "derecha"

printfn "%A" listaDesplazada


//Segundo Ejercicio
let lista = ["la casa"; "el perro"; "pintando la cerca"]
let palabrasConSubstring = List.filter (fun (palabra:string) -> palabra.Contains("la")) lista

printfn "palabras con la"
List.iter (printfn "%s") palabrasConSubstring



//Tercer Ejercicio

let obtenerNesimoElemento lista n =
    let indices = List.init (List.length lista) (fun i -> if i = n then 1 else 0)
    let resultado = List.map2 (fun valor indice -> valor * indice) lista indices
    let indice = List.sum resultado
    indice

let lista3 = [1; 2; 3; 4; 5; 6]

let elemento = obtenerNesimoElemento lista3 3
printfn "El %d-ésimo elemento es %A" 3 elemento
