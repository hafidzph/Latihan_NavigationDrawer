package com.latihan.navigationdrawer

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.latihan.navigationdrawer.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    lateinit var binding : FragmentOneBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("attach", "attachStarted")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("create", "createStarted")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("viewCreate", "viewCreateStarted")
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "startStarted")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume", "resumeStarted")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "pauseStarted")
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "stopStarted")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("destroyView", "destroyViewStarted")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("destroy", "destroyStarted")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("detach", "detachStarted")
    }
}