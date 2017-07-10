package com.example.firebase;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by nelson336 on 10/07/2017.
 */

public class RegisterFragment extends Fragment {
    @BindView(R.id.edtName)
    TextInputEditText edtName;
    @BindView(R.id.edtNameHint)
    TextInputLayout edtNameHint;
    @BindView(R.id.edtDesc)
    TextInputEditText edtDesc;
    @BindView(R.id.edtDescHint)
    TextInputLayout edtDescHint;
    @BindView(R.id.btSave)
    Button btSave;
    Unbinder unbinder;

    private MainActivity mActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (MainActivity) context;
    }

    public static RegisterFragment newInstance() {
        Bundle args = new Bundle();
        RegisterFragment fragment = new RegisterFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_register, container, false);
        unbinder = ButterKnife.bind(this, v);
        initComponents();
        return v;
    }

    private void initComponents() {
        Toast.makeText(mActivity, "inicializar registro", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.btSave)
    public void onViewClicked() {
        Toast.makeText(mActivity, "Click do botão", Toast.LENGTH_SHORT).show();
    }
}
