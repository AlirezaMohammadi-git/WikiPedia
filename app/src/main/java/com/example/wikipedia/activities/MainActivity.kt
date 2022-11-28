package com.example.wikipedia.activities

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.core.view.get
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.wikipedia.R
import com.example.wikipedia.databinding.ActivityMainBinding
import com.example.wikipedia.fragments.About
import com.example.wikipedia.fragments.Explore
import com.example.wikipedia.fragments.Profile
import com.example.wikipedia.fragments.Trends
import com.google.android.material.navigation.NavigationView

const val SEND_DATA = "data"


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate( layoutInflater )
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //
        //setting toolbar as main toolbar:
        setSupportActionBar( binding.toolbarMain )
        //adding toggle option for toolbar:
        actionbar_toggle(this )
        //setting navigation button to show related fragments :
        bottom_navigation_actions()
        navigation_view_actions()

    }


    private fun actionbar_toggle(  activity : Activity )
    {
        val toggle = ActionBarDrawerToggle( activity , binding.drawerLayoutMain , binding.toolbarMain ,
            R.string.app_name,
            R.string.app_name
        )
        binding.drawerLayoutMain.addDrawerListener( toggle )
        toggle.syncState()
    }
    private fun bottom_navigation_actions(){

        load_fragment(Explore())

        binding.bottomNavigationMain.setOnItemSelectedListener {

            when ( it.itemId ){
                R.id.btn_navigation_Explore ->{
                    binding.navigationViewMain.setCheckedItem( R.id.menu_Explore )
                    load_fragment( Explore() )
                }
                R.id.btn_navigation_Trends ->{
                    binding.navigationViewMain.setCheckedItem( R.id.menu_trends )
                    load_fragment( Trends() )
                }
                R.id.btn_navigation_Profile ->{
                    load_fragment( Profile() )
                }
            }

            true
        }

        binding.bottomNavigationMain.setOnItemReselectedListener {
            //for prevent replace fragments more than one time

        }

    }

    private fun navigation_view_actions(){


        binding.navigationViewMain.setNavigationItemSelectedListener {


            when ( it.itemId ){
                R.id.menu_Explore ->{
                    binding.navigationViewMain.setCheckedItem( R.id.menu_Explore )
                    load_fragment( Explore() )
                    binding.drawerLayoutMain.closeDrawer( GravityCompat.START )
                }
                R.id.menu_trends ->{
                    load_fragment( Trends() )
                    binding.navigationViewMain.setCheckedItem( R.id.menu_trends )
                    binding.drawerLayoutMain.closeDrawer( GravityCompat.START )
                }
                R.id.menu_writer ->{
                    Log.v("navigationDrawer" , "writer clicked")
                    val dialog = SweetAlertDialog( this  , SweetAlertDialog.WARNING_TYPE )
                    dialog.titleText = "YOU CAN BE A WRITER !"
                    dialog.confirmText = "Yes I can !"
                    dialog.cancelText = "I need more practice !"
                    dialog.setConfirmClickListener {
                        //what happen if confirm btn clicked
                    }
                    dialog.setCancelClickListener {
                        //what happen if cancel btn clicked
                        dialog.dismiss()
                    }
                    dialog.show()


                }
                R.id.menu_Open_Wikipedia ->{
                    val intent = Intent(Intent.ACTION_VIEW , Uri.parse( "https://www.wikipedia.org/" ))
                    startActivity(intent)
                }
                R.id.menu_photographer ->{
                    val dialog = SweetAlertDialog( this  , SweetAlertDialog.WARNING_TYPE )
                    dialog.titleText = "YOU CAN BE A PHOTOGRAPHER !"
                    dialog.confirmText = "Yes I can !"
                    dialog.cancelText = "I need more practice !"
                    dialog.setConfirmClickListener {
                        //what happen if confirm btn clicked
                    }
                    dialog.setCancelClickListener {
                        //what happen if cancel btn clicked
                    }
                    dialog.show()
                }
                R.id.menu_about ->{
                    load_fragment(About())
                    binding.drawerLayoutMain.closeDrawer( GravityCompat.START )
                }
            }

            true
        }


    }


    private fun load_fragment( fragmentClass : Fragment ){

        val loader = supportFragmentManager.beginTransaction()
        loader.replace(R.id.fragments_place, fragmentClass )
        loader.commit()

    }



}