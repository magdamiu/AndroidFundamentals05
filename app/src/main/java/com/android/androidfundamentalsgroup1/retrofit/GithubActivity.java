package com.android.androidfundamentalsgroup1.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.android.androidfundamentalsgroup1.Logging;
import com.android.androidfundamentalsgroup1.R;
import com.android.androidfundamentalsgroup1.store_data.ApplicationData;

import java.util.ArrayList;
import java.util.List;

import static com.android.androidfundamentalsgroup1.R.string.error_getting_users;
import static com.android.androidfundamentalsgroup1.R.string.github_users;

public class GithubActivity extends AppCompatActivity {

    private static final String GITHUB_TOKEN = "";
    private static final String VERSION_API = "VERSION_API";

    private UsersRepository usersRepository;
    private IssuesRepository issuesRepository;

    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        usersRepository = UsersRepository.getInstance();
        users = new ArrayList<>();

        ApplicationData.setIntValueInSharedPreferences(GithubActivity.this, VERSION_API, 1);
        int savedVersion = ApplicationData.getIntValueFromSharedPreferences(GithubActivity.this, VERSION_API);
        Logging.show(getString(R.string.saved_version_api), savedVersion + "");

        Issue issue = new Issue();
        issue.setTitle("This is a test #1");
        issue.setBody("Post an issue from code :) ");
        // replace username with your username and repo with a repo name of yours
        String token = "token " + GITHUB_TOKEN;
        postIssue("magdamiu", "AndroidFundamentals05", token, issue);

        //getDataSource();
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

    private void postIssue(String user, String repo, String token, Issue issue) {
        issuesRepository = IssuesRepository.getInstance();

        issuesRepository.postIssue(new OnPostIssueCallback() {
            @Override
            public void onSuccess(Issue issueResult) {
                Logging.show("Github issue = ", issueResult.toString());
                Toast.makeText(GithubActivity.this, issueResult.toString(), Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onError() {
                Logging.show("error Github post issue = ", "check the code :D ");
                Toast.makeText(GithubActivity.this, "error posting an issue",
                        Toast.LENGTH_LONG).show();
            }
        }, user, repo, token, issue);
    }
}
