package googlebug.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentContainer = findViewById<FragmentContainerView>(R.id.container)
        val fragment = BlankFragment.newInstance()

        supportFragmentManager.beginTransaction().add(fragmentContainer.id, fragment).commit()
    }
}