package cn.shineiot.compontentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author GF63
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view){
        ARouter.getInstance().build("/login/loginActivity").navigation();
    }
}
