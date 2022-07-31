package com.example.horsejouney.ui.rider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.horsejouney.databinding.FragmentRiderBinding;

public class RiderFragment extends Fragment {

    private FragmentRiderBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RiderViewModel riderViewModel =
                new ViewModelProvider(this).get(RiderViewModel.class);

        binding = FragmentRiderBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRider;
        riderViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}