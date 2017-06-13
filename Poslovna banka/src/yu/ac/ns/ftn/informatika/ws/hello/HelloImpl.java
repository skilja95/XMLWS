package yu.ac.ns.ftn.informatika.ws.hello;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(portName = "HelloPort",
			serviceName = "HelloService",
			targetNamespace = "http://informatika.ftn.ns.ac.yu/ws/hello",
			endpointInterface = "yu.ac.ns.ftn.informatika.ws.hello.Hello")
/*
 * portName, serviceName treba da su isti kao i vrednosti upisane za java2ws
 * task u build.xml-u za vrednosti port.name i service.name
 */
public class HelloImpl implements Hello {

	public HelloImpl() {
		System.out.println("Created HelloImpl object");
	}
    
	public String sayHi(String text) {
		System.out.println("Inovked sayHi method");
        return "Hello " + text;
    }
}