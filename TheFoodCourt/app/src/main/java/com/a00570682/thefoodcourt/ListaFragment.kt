package com.a00570682.thefoodcourt

import android.os.Bundle
import android.util.Log
import android.content.Intent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.a00570682.thefoodcourt.databinding.FragmentListaBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ListaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListaFragment : Fragment() {

    private val viewModel : MainMenuViewModel by activityViewModels()
    private var _binding: FragmentListaBinding? = null
    private val binding get () = _binding!!

    val name = "Ch"
    val description = "osidfanfdosa"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListaBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.newRestaurant()
        Log.i("Infoo", viewModel.restaurantsList.size.toString());
        Log.i("Infoo", viewModel.restaurantsList[0].name);

        val adapter = Adapter(viewModel.restaurantsList)
        binding.foodCardRV.adapter = adapter
        binding.foodCardRV.layoutManager = LinearLayoutManager(activity)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}