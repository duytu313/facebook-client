package com.example.facebook;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FriendsActivity extends AppCompatActivity {

    ImageView imgSearch;
    TextView tvFriendRequests, tvFriends, tvAddFriend, tvRemoveFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);


        imgSearch = findViewById(R.id.imgSearch);
        tvFriendRequests = findViewById(R.id.tvFriendRequests);
        tvFriends = findViewById(R.id.tvFriends);
        tvAddFriend = findViewById(R.id.tvAddFriend);
        tvRemoveFriend = findViewById(R.id.tvRemoveFriend);


        tvAddFriend.setOnClickListener(v -> {
            Toast.makeText(FriendsActivity.this, "sent", Toast.LENGTH_SHORT).show();
        });


        tvRemoveFriend.setOnClickListener(v -> {
            Toast.makeText(FriendsActivity.this, "removed", Toast.LENGTH_SHORT).show();
        });


        imgSearch.setOnClickListener(v -> {
            Toast.makeText(FriendsActivity.this, "Open friend search", Toast.LENGTH_SHORT).show();
        });
    }
}
