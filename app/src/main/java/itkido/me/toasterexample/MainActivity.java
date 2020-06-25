package itkido.me.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import itkido.me.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {
    Button btnDisplayToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDisplayToast = findViewById(R.id.btnDisplayToast);

        btnDisplayToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToasterMessage.createToasterMessage(MainActivity.this, "Hello World!");
            }
        });

    }
}