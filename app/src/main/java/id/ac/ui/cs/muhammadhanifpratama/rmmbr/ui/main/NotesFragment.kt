package id.ac.ui.cs.muhammadhanifpratama.rmmbr.ui.main

//import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import id.ac.ui.cs.muhammadhanifpratama.rmmbr.R
import kotlinx.android.synthetic.main.fragment_notes.*

class NotesFragment : Fragment() {

    companion object {
        fun newInstance() = NotesFragment()
    }

    //private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(BlankViewModel::class.java)
        // TODO: Use the ViewModel
        toolbar.setNavigationOnClickListener {
            this.activity!!.onBackPressed()
        }
    }

}