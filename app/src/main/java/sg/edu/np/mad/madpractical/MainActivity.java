package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

import com.example.practical2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonFollow(View v){
        Button button = (Button) v;
        if (UserTest.Followed == false){
            button.setText("Unfollow");
            UserTest.Followed = true;
        }

        else {
            button.setText("Follow");
            UserTest.Followed = false;
        }


    }
}