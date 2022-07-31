package com.example.horsejouney.ui.horse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.horsejouney.databinding.FragmentHorseBinding;

public class HorseFragment extends Fragment {

    private FragmentHorseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HorseViewModel horseViewModel =
                new ViewModelProvider(this).get(HorseViewModel.class);

        binding = FragmentHorseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHorse;
        horseViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}