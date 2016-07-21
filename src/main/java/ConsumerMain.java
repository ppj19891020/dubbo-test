import dubbo.service.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pangpeijie on 16/7/21.
 */
public class ConsumerMain {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"applicationConsumer.xml"});
        context.start();

        DubboService processDataService = (DubboService)context.getBean("demoService");
        processDataService.sayHello("ppj");
    }

}
