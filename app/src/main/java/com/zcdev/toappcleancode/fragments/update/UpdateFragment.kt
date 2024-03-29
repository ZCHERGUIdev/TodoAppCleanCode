package com.zcdev.toappcleancode.fragments.update

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.zcdev.toappcleancode.R


class UpdateFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    val view= inflater.inflate(R.layout.fragment_update, container, false)
        setHasOptionsMenu(true)
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_fragment_menu,menu)
    }
}