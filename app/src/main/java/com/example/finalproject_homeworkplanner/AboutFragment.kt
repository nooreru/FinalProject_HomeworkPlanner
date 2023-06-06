package com.example.finalproject_homeworkplanner

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject_homeworkplanner.databinding.FragmentAboutBinding
import com.example.finalproject_homeworkplanner.databinding.FragmentAssignmentDetailsBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.topFlower.setOnClickListener{
            /*val bookUri = Uri.parse(currentBook.url)
            val websiteIntent = Intent(Intent.ACTION_VIEW, bookUri)
            itemView.context.startActivity(websiteIntent)*/

            /*MaterialAlertDialogBuilder(requireContext())
                    .setTitle(getString(R.string.congrats))
                    .setMessage(getString(R.string.play_again))
                    .setPositiveButton(getString(R.string.yes)){ dialog, which ->
                        viewModel.playAgain()
                    }
                    .setNegativeButton(getString(R.string.no)){ dialog, which ->
                        val action = MainFragmentDirections.actionMainFragmentToGameWonFragment()
                        rootView.findNavController().navigate(action)
                    }
                    .show()*/

            MaterialAlertDialogBuilder(requireContext())
                .setTitle("Do you wanna learn about the importance of organization?")
                .setMessage("Click yes to learn more!")
                .setPositiveButton("Yes"){ dialog, which ->
                    val uri = Uri.parse("https://www.unomaha.edu/student-life/achievement/academic-and-career-development-center/success-tips/articles/the-importance-of-organization-in-college.php")
                    val websiteIntent = Intent(Intent.ACTION_VIEW, uri)
                    it.context.startActivity(websiteIntent)
                }
                .show()
        }

        binding.bottomFlower.setOnClickListener{
            /*val bookUri = Uri.parse(currentBook.url)
            val websiteIntent = Intent(Intent.ACTION_VIEW, bookUri)
            itemView.context.startActivity(websiteIntent)*/

            /*MaterialAlertDialogBuilder(requireContext())
                    .setTitle(getString(R.string.congrats))
                    .setMessage(getString(R.string.play_again))
                    .setPositiveButton(getString(R.string.yes)){ dialog, which ->
                        viewModel.playAgain()
                    }
                    .setNegativeButton(getString(R.string.no)){ dialog, which ->
                        val action = MainFragmentDirections.actionMainFragmentToGameWonFragment()
                        rootView.findNavController().navigate(action)
                    }
                    .show()*/

            MaterialAlertDialogBuilder(requireContext())
                .setTitle("Do you want some cool study tips?")
                .setMessage("Click yes to learn more!")
                .setPositiveButton("Yes"){ dialog, which ->
                    val uri = Uri.parse("https://summer.harvard.edu/blog/top-10-study-tips-to-study-like-a-harvard-student/")
                    val websiteIntent = Intent(Intent.ACTION_VIEW, uri)
                    it.context.startActivity(websiteIntent)
                }
                .show()
        }

        return rootView
    }
}