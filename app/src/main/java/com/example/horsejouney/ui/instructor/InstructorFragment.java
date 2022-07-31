package com.example.horsejouney.ui.instructor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.horsejouney.databinding.FragmentInstrustorBinding;

public class InstructorFragment extends Fragment {

    private FragmentInstrustorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InstructorViewModel instructorViewModel =
                new ViewModelProvider(this).get(InstructorViewModel.class);

        binding = FragmentInstrustorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInstructor;
        instructorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}