package com.example.finalproject_homeworkplanner

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.finalproject_homeworkplanner.databinding.FragmentHomeScreenBinding
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI

class HomeScreenFragment : Fragment() {
    private var _binding: FragmentHomeScreenBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.assignmentsPageButton.setOnClickListener {
            val action = HomeScreenFragmentDirections.actionHomeScreenFragmentToAssignmentPageFragment()
            rootView.findNavController().navigate(action)
        }
        binding.pastAssignmentsButton.setOnClickListener{
            val action = HomeScreenFragmentDirections.actionHomeScreenFragmentToPastAssignmentPageFragment()
            rootView.findNavController().navigate(action)
        }
        binding.addAssignmentButton.setOnClickListener{
            val action = HomeScreenFragmentDirections.actionHomeScreenFragmentToAddAssignmentFragment()
            rootView.findNavController().navigate(action)
        }

        setHasOptionsMenu(true)
        return rootView
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onContextItemSelected(item)

    }
}