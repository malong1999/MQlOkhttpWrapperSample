package maxiaobu.mqlokhttpwrapper.builder;

import android.net.Uri;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import maxiaobu.mqlokhttpwrapper.request.GetRequest;
import maxiaobu.mqlokhttpwrapper.request.RequestCall;

/**
    *Created by 马小布 on 2017/1/2.
    *introduction: 真他娘的不知道说点啥
    *email:maxiaobu1999@163.com
    *功能：
    *伪码：
    *待完成：
*/
public class GetBuilder extends OkHttpRequestBuilder<GetBuilder> implements HasParamsable {
    @Override
    public RequestCall build() {
        if (params != null) {
            url = appendParams(url, params);
        }

        return new GetRequest(url, tag, params, headers, id).build();
    }

    /**
     * 添加请求参数
     * @param url   网址
     * @param params  参数
     * @return   拼接好的url  无参直接反url
     */
    protected String appendParams(String url, Map<String, String> params) {
        if (url == null || params == null || params.isEmpty()) {
            return url;
        }
        Uri.Builder builder = Uri.parse(url).buildUpon();
        Set<String> keys = params.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            builder.appendQueryParameter(key, params.get(key));
        }
        return builder.build().toString();
    }


    @Override
    public GetBuilder params(Map<String, String> params) {
        this.params = params;
        return this;
    }

    @Override
    public GetBuilder addParams(String key, String val) {
        if (this.params == null) {
            params = new LinkedHashMap<>();
        }
        params.put(key, val);
        return this;
    }


}
