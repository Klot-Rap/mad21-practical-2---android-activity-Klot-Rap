package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("Eric","student",12248,true);

        loadUserObj(user);
    }


    //Reacts to the user attribute
    public void loadUserObj(User user){

        TextView followButton = findViewById(R.id.followButton); //retrieving the element

        if(user.isFollowed() == true){                          //determining the attribute Follow is set to what
            followButton.setText("UNFOLLOW");
        }
        else{
            followButton.setText("FOLLOW");
        }
    }

    //Reacts to when the button is clicked
    public void onFollowBtnClick (View view){
        Button followButton = findViewById(R.id.followButton);

        if (followButton.getText() == "Follow"){
            followButton.setText("Unfollow");
        }else{
            followButton.setText("Follow");                 //the capitalization does not matter android is smart enough
        }

    }
}