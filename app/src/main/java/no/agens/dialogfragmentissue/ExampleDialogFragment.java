package no.agens.dialogfragmentissue;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExampleDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_example_dialog, container, false);

        final View exampleViewOne = root.findViewById(R.id.example_text_one);
        final View exampleViewTwo = root.findViewById(R.id.example_text_two);

        root.findViewById(R.id.switch_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (exampleViewOne.getVisibility() == View.VISIBLE) {
                   exampleViewOne.setVisibility(View.GONE);
                   exampleViewTwo.setVisibility(View.VISIBLE);
               } else {
                   exampleViewOne.setVisibility(View.VISIBLE);
                   exampleViewTwo.setVisibility(View.GONE);
               }
            }
        });
        root.findViewById(R.id.dismiss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return root;
    }
}
