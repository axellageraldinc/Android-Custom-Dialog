package pap.ta.androidcustomdialog;

import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CustomDialogFragment extends DialogFragment {

    ProgressBar progressBar;
    TextView txtMessage;
    Bundle bundle;
    Handler handler = new Handler();
    int progressStatus=0;

    public CustomDialogFragment() {

    }

    public interface CustomDialogListener{
        void onFinishCustomDialog(boolean state);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        View view= inflater.inflate(R.layout.activity_custom_dialog_fragment, container);
        progressBar = view.findViewById(R.id.progressBar2);
        txtMessage = view.findViewById(R.id.txtMessage);
        bundle = this.getArguments();
        txtMessage.setText(bundle.getString("message"));
        return view;
    }
}
