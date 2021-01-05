package com.android.androidfundamentalsgroup1.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.android.androidfundamentalsgroup1.Logging;
import com.android.androidfundamentalsgroup1.R;

import java.util.ArrayList;
import java.util.List;

import static com.android.androidfundamentalsgroup1.R.string.error_getting_users;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository usersRepository;
    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        usersRepository = UsersRepository.getInstance();
        users = new ArrayList<>();

        getDataSource();
    }

    private void getDataSource() {
        usersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> userListFromApi) {
                users = userListFromApi;
                StringBuilder stringBuilder = new StringBuilder();
                for (User user : userListFromApi) {
                    stringBuilder.append(user.toString() + " /// ");
                }
                Logging.show(getString(R.string.github_users), userListFromApi.toString());
                Toast.makeText(GithubActivity.this, stringBuilder.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError() {
                Logging.show(getString(R.string.errorgithub_users), getString(R.string.check_code));
                Toast.makeText(GithubActivity.this, R.string.error_getting_users,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}