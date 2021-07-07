package com.june0122.photogallery.api

import com.google.gson.annotations.SerializedName
import com.june0122.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}