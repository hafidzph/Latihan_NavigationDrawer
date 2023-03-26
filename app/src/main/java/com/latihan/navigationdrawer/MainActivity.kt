package com.latihan.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.latihan.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawerLayout = findViewById(R.id.drawer_layout)
        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setCurrentFragment(HomeFragment())
        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    setCurrentFragment(HomeFragment())
                }

                R.id.fragment1 -> {
                    setCurrentFragment(FragmentOne())
                }
                R.id.fragment2 -> {
                    setCurrentFragment(FragmentTwo())
                }
                R.id.fragment3 -> {
                    setCurrentFragment(FragmentThree())
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()
        }
}