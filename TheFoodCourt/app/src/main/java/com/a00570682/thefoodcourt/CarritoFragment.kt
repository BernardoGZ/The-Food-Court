package com.a00570682.thefoodcourt

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.a00570682.thefoodcourt.databinding.FragmentCarritoBinding
import java.io.Console


/**
 * A simple [Fragment] subclass.
 * Use the [CarritoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CarritoFragment : Fragment() {

    private val viewModel : CarritoModelView by activityViewModels()
    private var _binding: FragmentCarritoBinding? = null
    private val binding get () = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCarritoBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Temporary solution
         * Database failure
         * **/

        viewModel.newItem("Orden Completa", "80")
        viewModel.newItem("Rojos", "0")
        viewModel.newItem("Pollo", "15")

        val adapter = CarritoAdapter(viewModel.orderList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)

        var total = 0
        for (item in viewModel.orderList){
            total += item.amount.toInt()
        }

        binding.textView6.text = "$" + total.toString()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}