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

        MyProvider myProvider = new MyProvider();
        final ISDKEngine sdkEngine = new FaceEngine();
        sdkEngine.setProvider(myProvider);
    }

    private static class MyProvider implements IProvider, IConfig {

        @Override
        public String getParamA() {
            return "MyParamA";
        }

        @Override
        public String getParamB() {
            return "MyParamB";
        }

        @Override
        public String getConfig() {
            return "MyConfig";
        }
    }

    private interface IConfig {
        String getConfig();
    }
}
