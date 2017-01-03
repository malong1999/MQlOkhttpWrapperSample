package maxiaobu.mqlokhttpwrappersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import maxiaobu.mqlokhttpwrapper.OkHttpUtils;
import maxiaobu.mqlokhttpwrapper.callback.StringCallback;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpUtils
                .get()//GetBuilder
                .url("http://182.92.5.3:8081/android/resources/json/HOME_URL.json")//OkHttpRequestBuilder
                .id(100)//请求标示  OkHttpRequestBuilder
                .build()//GetBuilder
                .execute(new MyStringCallback());


    }

    public class MyStringCallback extends StringCallback {

        @Override
        public void onBefore(Request request, int id) {
        }

        @Override
        public void onAfter(int id) {
        }

        @Override
        public void onError(okhttp3.Call call, Exception e, int id) {
            Log.e("TAG", "联网失败" + e.getMessage());
        }


        @Override
        public void onResponse(String response, int id) {

            switch (id) {
                case 100:
                    Log.d("MyStringCallback", response);

                    break;
                case 101:
                    break;
            }
        }
    }
}
