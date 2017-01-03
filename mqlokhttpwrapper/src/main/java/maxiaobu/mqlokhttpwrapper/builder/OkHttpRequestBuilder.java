package maxiaobu.mqlokhttpwrapper.builder;


import java.util.LinkedHashMap;
import java.util.Map;

import maxiaobu.mqlokhttpwrapper.request.RequestCall;

/**
 * Created by 马小布 on 2017/1/2.
 * introduction: 真他娘的不知道说点啥
 * email:maxiaobu1999@163.com
 * 功能：
 * 伪码：
 * 待完成：
 */
public abstract class OkHttpRequestBuilder<T extends OkHttpRequestBuilder> {
    /**
     * 请求网址
     */
    protected String url;
    protected Object tag;
    protected Map<String, String> headers;
    protected Map<String, String> params;
    protected int id;

    public T id(int id) {
        this.id = id;
        return (T) this;
    }

    public T url(String url) {
        this.url = url;
        return (T) this;
    }


    public T tag(Object tag) {
        this.tag = tag;
        return (T) this;
    }

    public T headers(Map<String, String> headers) {
        this.headers = headers;
        return (T) this;
    }

    public T addHeader(String key, String val) {
        if (this.headers == null) {
            headers = new LinkedHashMap<>();
        }
        headers.put(key, val);
        return (T) this;
    }

    public abstract RequestCall build();
}
