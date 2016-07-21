import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by pangpeijie on 16/7/21.
 */
public class ProviderMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationProvider.xml");
        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }

}
