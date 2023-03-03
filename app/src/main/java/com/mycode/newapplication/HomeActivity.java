package com.mycode.newapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mycode.newapplication.databinding.ActivityHomeBinding;

import org.jetbrains.annotations.NotNull;

public class HomeActivity extends Fragment {
    private ActivityHomeBinding binding;
    static int image;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        ImageView icon=binding.playerIcon;
        icon.setImageResource(image);
        return binding.getRoot();
    }
}