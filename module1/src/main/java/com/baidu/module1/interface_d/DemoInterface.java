package com.baidu.module1.interface_d;

public class DemoInterface {
    public static void main(String[] args) {
        IProvider provider = new IProvider() {
            @Override
            public String getParamA() {
                return "paramA";
            }

            @Override
            public String getParamB() {
                return "paramB";
            }
        };

        ISDKEngine sdkEngine = new FaceEngine();
        sdkEngine.setProvider(provider);
    }
}
