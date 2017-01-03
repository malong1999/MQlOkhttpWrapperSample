package maxiaobu.mqlokhttpwrapper.callback;

/**
 * Created by 马小布 on 2017/1/3.
 * introduction：我长得真他娘的磕碜，单身未娶，求包养
 * email：maxiaobu1216@gmail.com
 * 功能：
 * 伪码：
 * 待完成：
 */
public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}
