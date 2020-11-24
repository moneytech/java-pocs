import com.github.diegopacheco.javapocs.proxy.DynamicInvocationHandler;

import java.lang.reflect.Proxy;
import java.util.Map;

public class Main {
    public static void main(String args[]) {

        Map proxyInstance = (Map) Proxy.newProxyInstance(
                DynamicInvocationHandler.class.getClassLoader(),
                new Class[]{Map.class},
                new DynamicInvocationHandler());

        System.out.println("Map.get(1) == " + proxyInstance.get("1"));

        Map proxyInstanceLambda = (Map) Proxy.newProxyInstance(
                DynamicInvocationHandler.class.getClassLoader(),
                new Class[]{Map.class},
                (proxy, method, methodArgs) -> {
                    if (method.getName().equals("get")) {
                        return 43;
                    } else {
                        throw new UnsupportedOperationException("Unsupported method: " + method.getName());
                    }
                });
        System.out.println("Map.get(1) == " + proxyInstanceLambda.get("1"));

    }
}
