package com.example.horsejouney.ui.qanda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.horsejouney.databinding.FragmentQandaBinding;


public class QandaFragment extends Fragment {

    private FragmentQandaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QandaViewModel qandaViewModel =
                new ViewModelProvider(this).get(QandaViewModel.class);

        binding = FragmentQandaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}