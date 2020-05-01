package com.example.timepiker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DialogHandler extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){

        Calendar calendar=Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog;
        TimeSettings timeSettings=new TimeSettings(getActivity());
        dialog=new TimePickerDialog(getActivity(),timeSettings,hour,minute,
                DateFormat.is24HourFormat(getActivity()));

        return dialog;

        //return super.onCreateDialog(savedInstanceState);

    }

}
