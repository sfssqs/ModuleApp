package com.baidu.module1.normal;

public class DemoNormal {
    public static void main(String[] args) {
        Provider provider = new Provider();
        provider.getParamA("paramA");
        provider.getParamB("paramB");

        SDKEngine sdkEngine = new SDKEngine();
        sdkEngine.setProvider(provider);
    }
}
