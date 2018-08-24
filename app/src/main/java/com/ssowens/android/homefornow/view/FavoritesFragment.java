package com.ssowens.android.homefornow.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.ssowens.android.homefornow.view.HotelDetailActivity.ARG_HOTEL_ID;


public class FavoritesFragment extends Fragment {

    public static FavoritesFragment newInstance(String hotelId) {
        FavoritesFragment fragment = new FavoritesFragment();

        Bundle args = new Bundle();
        args.putString(ARG_HOTEL_ID, hotelId);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
