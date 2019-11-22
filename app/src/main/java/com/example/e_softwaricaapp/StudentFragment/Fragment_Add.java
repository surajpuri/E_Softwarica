package com.example.e_softwaricaapp.StudentFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.e_softwaricaapp.MainActivity;
import com.example.e_softwaricaapp.Models.Students;
import com.example.e_softwaricaapp.R;

public class Fragment_Add extends Fragment {
    EditText name, age, address;
    RadioGroup rdoGender;
    Button btnSave;
    RadioButton btnGender;
    private int image;

    public  Fragment_Add(){
        //Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.add_student, container, false);
        name = view.findViewById(R.id.ET_FullName);
        age = view.findViewById(R.id.ET_Age);
        rdoGender = view.findViewById(R.id.RG_Gender);
        address = view.findViewById(R.id.ET_Address);
        btnSave = view.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validation
                        if (name.equals("")) {
                            name.setError("Enter the username did not match");
                            return;
                        }
                        if (age.equals("")) {
                            age.setError("Enter the age");
                            return;
                        }
                        if (address.equals("")) {
                            address.setError("Enter the address");
                            return;
                        }
                        int selectGender = rdoGender.getCheckedRadioButtonId();
                        btnGender = view.findViewById(selectGender);
                        // for gender of image
                        switch (btnGender.getText().toString()) {
                            case "Male":
                                image = R.drawable.a;
                                break;
                            case "Female":
                                image = R.drawable.f;
                                break;
                            case "Other":
                                image = R.drawable.b;
                                break;
                        }
                        MainActivity.students.add(new Students(name.getText().toString(), Integer.parseInt(age.getText().toString()), btnGender.getText().toString(), address.getText().toString(), image));

                        Toast toast = Toast.makeText(getContext(), "Student Details Successfully Saved", Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                return view;
            }

        }





