package com.example.codestructures;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment8b#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment8b extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment8b() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment1a.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment8b newInstance(String param1, String param2) {
        fragment8b fragment = new fragment8b();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment8b, container, false);

        // Access the TextView by its ID


        WebView webView = view.findViewById(R.id.webView);


        // Enable caching
        WebSettings webSettings = webView.getSettings();
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

       // webSettings.setJavaScriptEnabled(true); // Enable JavaScript if needed

        // Replace 'YOUR_GIST_URL' with the URL of your GitHub Gist
        String gistUrl = "https://gist.github.com/aaryam-dev/2ce5a0ebc0e7824574de82933e19f489";

        // Load the Gist URL into the WebView
        webView.loadUrl(gistUrl);


        // Set text for the TextView if needed

        return view;
    }


    }

