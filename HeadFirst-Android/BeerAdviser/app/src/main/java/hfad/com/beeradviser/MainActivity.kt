package hfad.com.beeradviser

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : Activity() {
    private val expert:BeerExpert = BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Вызывается при щелчке на кнопке
    fun onClickFindBeer(view: View) {
        val brands: TextView = findViewById(R.id.text)
        val list: Spinner = findViewById(R.id.list)

        val listOfBrands:List<String> = expert.getBrands(list.selectedItem.toString())
        val names = StringBuilder()
        listOfBrands.forEach {el -> names.append(el).append("\n") }.also {brands.text = names}
    }
}