package com.june0122.photogallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PhotoGalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_gallery)

//        if (supportFragmentManager.findFragmentById(R.id.fragmentContainer) == null) {
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.fragmentContainer, PhotoGalleryFragment.newInstance())
//                .commit()
//        }

        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, PhotoGalleryFragment.newInstance())
                .commit()
        }
    }
}