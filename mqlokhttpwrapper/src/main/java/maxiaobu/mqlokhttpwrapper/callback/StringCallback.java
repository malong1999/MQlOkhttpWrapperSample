package maxiaobu.mqlokhttpwrapper.callback;

import java.io.IOException;

import okhttp3.Response;

/**
 * Created by 马小布 on 2017/1/2.
 * introduction: 真他娘的不知道说点啥
 * email:maxiaobu1999@163.com
 * 功能：okhttp 回调string
 * 伪码：
 * 待完成：
 */
public abstract class StringCallback extends Callback<String> {
    @Override
    public String parseNetworkResponse(Response response, int id) throws IOException {
        return response.body().string();
    }
}
