import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zoom.service.CustomerService;

public class Application {

	public static void main(String[] args) {

			System.out.println("inside main step 1");
		
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
			System.out.println("inside main step 2");

		//CustomerService service = new CustomerServiceImpl();
		
		CustomerService service = 
				appContext.getBean("customerService",CustomerService.class);
			
		System.out.println(service);
		
		CustomerService service2 = 
				appContext.getBean("customerService",CustomerService.class);
			
		System.out.println(service2);

		System.out.println("inside main step 3");

		System.out.println(service.findAll().get(0).getFirstname());
		
			System.out.println("inside main step 4");

	}

}
