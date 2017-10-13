package p4.appcoletaseletiva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);

        Button bntStart = (Button) findViewById(R.id.start);
        Button bntExit = (Button) findViewById(R.id.exit);

        bntStart.setOnClickListener(this);
        bntExit.setOnClickListener(this);
    }


    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.start:
                Log.d("Tag","WORKS.");
                break;
            case R.id.exit:
                finish();
                break;

            default:
                Log.e("Tag","ID NAO REGISTRADO.");
                break;
        }
    }
}
