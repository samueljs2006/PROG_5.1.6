fun main() {
    val articulo1 = Articulo("Libro", 25.0)
    val articulo2 = Articulo("Mochila", 45.0)
    val ordenador1 = Ordenador("PC Gaming", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Ordenador Básico", 399.99)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    articulos.forEach {
        it.promocionNavidad(10.0)
        println(it)
    }
}
