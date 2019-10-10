package cn.shineiot.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @author GF63
 */
@Route(path = "/login/loginActivity")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){

    }
}
