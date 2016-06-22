package no.agens.dialogfragmentissue;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.open_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEditDialog();
            }
        });
    }


    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        ExampleDialogFragment editNameDialog = new ExampleDialogFragment();
        editNameDialog.show(fm, "fragment_example_dialog");
    }

    /*@Override
    public void onFinishEditDialog(String inputText) {
        Toast.makeText(this, "Hi, " + inputText, Toast.LENGTH_SHORT).show();
    }*/

}
