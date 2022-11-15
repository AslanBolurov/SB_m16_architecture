package com.skillbox.aslanbolurov.android.cleanarchitecture.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.skillbox.aslanbolurov.android.cleanarchitecture.databinding.FragmentMainBinding
import com.skillbox.aslanbolurov.android.cleanarchitecture.di.DaggerAppComponent

class MainFragment : Fragment() {

    private var _binding:FragmentMainBinding?=null
    val binding get() = _binding!!

    val viewModel: MainViewModel by viewModels{

        DaggerAppComponent.create().mainViewModelFactory()
    }

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding=
            FragmentMainBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRefresh.setOnClickListener {
            lifecycleScope.launchWhenStarted {
                viewModel.reloadUsefulActivity()
            }
        }

        lifecycleScope.launchWhenStarted {
            viewModel.action.collect{
                binding.tvSomeAction.setText(it)
            }
        }


    }

}