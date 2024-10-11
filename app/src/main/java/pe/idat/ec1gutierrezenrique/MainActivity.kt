package pe.idat.ec1gutierrezenrique

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.idat.ec1gutierrezenrique.databinding.ActivityMainBinding
import kotlin.time.times

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
        }
    override fun onClick(p0: View?) {
        val cantidad = binding.etcantidad.text.toString().toDoubleOrNull() ?: 0.0
        val precio = binding.etcantidad.text.toString().toDoubleOrNull() ?: 0.0
        val total = cantidad * precio
        var totalDescuento = if(total > 200 ) {
            total * 0.8
        } else {
            total
        }
        binding.etresultado.setText("El total a pagar es $totalDescuento")
    }
}