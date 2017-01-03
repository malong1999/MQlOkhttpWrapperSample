package maxiaobu.mqlokhttpwrapper.request;

import java.util.Map;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by 马小布 on 2017/1/2.
 * introduction: 真他娘的不知道说点啥
 * email:maxiaobu1999@163.com
 * 功能：get请求
 * 伪码：
 * 待完成：
 */
public class GetRequest extends OkHttpRequest {
    public GetRequest(String url, Object tag, Map<String, String> params, Map<String, String> headers, int id) {
        super(url, tag, params, headers, id);
    }

    @Override
    protected RequestBody buildRequestBody() {
        return null;
    }

    @Override
    protected Request buildRequest(RequestBody requestBody) {
        return builder.get().build();
    }


}
