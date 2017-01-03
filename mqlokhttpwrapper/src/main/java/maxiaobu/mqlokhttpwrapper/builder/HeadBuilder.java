package maxiaobu.mqlokhttpwrapper.builder;


import maxiaobu.mqlokhttpwrapper.OkHttpUtils;
import maxiaobu.mqlokhttpwrapper.request.OtherRequest;
import maxiaobu.mqlokhttpwrapper.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
