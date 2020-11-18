package id.ac.ui.cs.muhammadhanifpratama.rmmbr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.ui.cs.muhammadhanifpratama.rmmbr.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    val mainFragment: MainFragment = MainFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, mainFragment)
                .commitNow()
        }
    }
}