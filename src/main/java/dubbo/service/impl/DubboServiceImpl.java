package dubbo.service.impl;

import dubbo.service.DubboService;

/**
 * Created by pangpeijie on 16/7/21.
 */
public class DubboServiceImpl implements DubboService {


    public void sayHello(String name) {
        System.out.println(name+" say hello world!");
    }
}
