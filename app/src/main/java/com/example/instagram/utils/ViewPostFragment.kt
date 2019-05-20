package com.example.instagram.utils

import android.support.v4.app.Fragment
import com.example.instagram.R
import android.os.Bundle
import android.support.annotation.Nullable
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View


class ViewPostFragment : Fragment() {

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.feed_item, container, false)
    }
}