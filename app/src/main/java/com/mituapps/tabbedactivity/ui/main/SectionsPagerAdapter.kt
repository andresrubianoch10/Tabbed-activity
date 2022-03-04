package com.mituapps.tabbedactivity.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(fm: AppCompatActivity) :
    FragmentStateAdapter(fm) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PlaceholderFragment.newInstance(position + 1)
            1 -> PlaceholderFragment.newInstance(position + 1)
            else -> PlaceholderFragment.newInstance(position + 1)
        }
    }

    override fun getItemCount(): Int {
        // Show 2 total pages.
        return 2
    }
}