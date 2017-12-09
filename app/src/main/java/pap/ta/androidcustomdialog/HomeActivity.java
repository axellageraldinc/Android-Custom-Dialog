package pap.ta.androidcustomdialog;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnCustomDialog;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCustomDialog = findViewById(R.id.btnCustomDialog);
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomDialog();
            }
        });
    }

    private void showCustomDialog() {
        android.app.FragmentManager fragmentManager = getFragmentManager();
        try{
            bundle = new Bundle();
            bundle.putString("message", "Hai hai this is message");
            CustomDialogFragment CustomDialog = new CustomDialogFragment();
            CustomDialog.setCancelable(true);
            CustomDialog.setArguments(bundle);
            CustomDialog.show(fragmentManager, "Custom Dialog");
        } catch (Exception e){
            System.out.println("Error show custom Dialog : " + e.toString());
        }
    }

}
