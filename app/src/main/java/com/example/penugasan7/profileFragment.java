package com.example.penugasan7;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class profileFragment extends Fragment {

    private ImageView profileImageView;
    private TextView profileNameTextView;
    private TextView profileEmailTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Menghubungkan komponen UI
        profileImageView = view.findViewById(R.id.imageProfile);
        profileNameTextView = view.findViewById(R.id.tvName);
        profileEmailTextView = view.findViewById(R.id.tvNIM);

        // Set data profil (misalnya, dari Bundle atau API)
        setProfileData("Nadia Aliya Nazira", "23/517375/SV/22766");
    }

    private void setProfileData(String name, String email) {
        profileNameTextView.setText(name);
        profileEmailTextView.setText(email);
        // Anda bisa menambahkan logika untuk mengatur gambar profil di sini
    }
}
