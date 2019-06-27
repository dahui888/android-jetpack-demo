package org.zhiwei.jetpack.rxjava.op;

import io.reactivex.Observable;
import org.zhiwei.jetpack.rxjava.op.base.BaseOp;

/**
 * Author: zhiwei.
 * Date: 2018/11/7 0007,20:15.
 */
public class OperateFilter extends BaseOp {

    private static String TAG = "OperateFilter";

    /*
     * Filter操作符，添加指定过滤条件
     */
    public static void doSome() {
        Observable.just("a", "b", "c", "f", "ad", "c", "f", "g")
                .filter(s -> {
                    //过滤条件是长度为 1
                    return s.length() == 1;
                })
                .subscribe(getObserver(TAG, ""));
    }
}