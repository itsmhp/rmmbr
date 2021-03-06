package id.ac.ui.cs.muhammadhanifpratama.rmmbr.ui.main

//import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import id.ac.ui.cs.muhammadhanifpratama.rmmbr.R
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.main_activity.view.*


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    //private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val ft: FragmentTransaction = fragmentManager!!.beginTransaction()
        //viewModel = ViewModelProviders.of(this).get(BlankViewModel::class.java)
        // TODO: Use the ViewModel

        NotesBtn.setOnClickListener {
            ft.replace(R.id.container, NotesFragment(), "NewFragmentTag")
            ft.addToBackStack(null)
            ft.commit()
        }

        VNBtn.setOnClickListener {
            ft.replace(R.id.container, VoiceNotesFragment(), "NewFragmentTag")
            ft.addToBackStack(null)
            ft.commit()
        }

    }

}