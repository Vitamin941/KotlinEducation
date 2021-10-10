package hfad.com.beeradviser

class BeerExpert {

    fun getBrands(beerName: String): List<String> {
        return when (beerName) {
            "amber" -> listOf("Jack Amber", "Red Moose")
            else -> listOf("Jail Pale Ale", "Gout Stout")
        }
    }
}