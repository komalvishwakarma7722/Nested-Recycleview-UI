package com.example.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.navigationapp.databinding.ActivityMainBinding
import com.example.navigationapp.fragment.CartFragment
import com.example.navigationapp.fragment.HomeFragment
import com.example.navigationapp.fragment.NotificationFragment
import com.example.navigationapp.fragment.ProfileFragment
import com.example.navigationapp.fragment.SearchFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragment(HomeFragment(), "HOME")

        var badge = binding.bottomNavigation.getOrCreateBadge(R.id.nav_notification)
        badge.isVisible = true
        badge.number = 22

        binding.bottomNavigation.setOnItemSelectedListener { it ->
            when(it.itemId){
                R.id.nav_home ->{
                    addFragment(HomeFragment(),"HOME")
                    true
                } R.id.nav_search->{
                    addFragment(SearchFragment(),"SEARCH")
                    true
                } R.id.nav_profile->{
                    addFragment(ProfileFragment(),"PROFILE")
                    true
                } R.id.nav_notification ->{
                    addFragment(NotificationFragment(),"NOTIFICATION")
                    true
                } R.id.nav_cart ->{
                    addFragment(CartFragment(),"CART")
                    true
                }
                else -> false

            }
        }
    }
    private fun addFragment(fragment: Fragment, tag: String) {
        var manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment, tag)
        transaction.commit()
    }
}