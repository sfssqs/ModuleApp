package com.baidu.module1.interface_d;

import com.baidu.module1.normal.Provider;

/**
 * Created by xiaxing on 2018/9/18.
 */
public class FaceEngine implements ISDKEngine {
    private Provider mProvider;

    @Override
    public void setProvider(IProvider provider) {

    }

    public Provider getProvider() {
        return mProvider;
    }
}
