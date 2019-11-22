package com.example.e_softwaricaapp.StudentFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.e_softwaricaapp.R;

public class Fragment_About extends Fragment {
    public WebView website;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.fragment_softwarica_details, container, false);

        website= v.findViewById(R.id.WV_Website);
        website.getSettings().setJavaScriptEnabled(true);
        website.setWebViewClient(new WebViewClient());
        website.loadUrl("http://www.softwarica.edu.np/");
        website.requestFocus();
        return v;
    }

}
