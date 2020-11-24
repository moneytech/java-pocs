import com.rabbitmq.client.*;

import java.io.IOException;

public class MainConsumer {
    public static void main(String args[]) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("guest");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("products_queue", false, false, false, null);

        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(
                    String consumerTag,
                    Envelope envelope,
                    AMQP.BasicProperties properties,
                    byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println("Got message: " + message);
            }
        };
        String result = channel.basicConsume("products_queue", true, consumer);
        System.out.println("result: " + result);

        Thread.sleep(2000L);

        channel.close();
        connection.close();
        System.out.println("FIN - all good.");
    }
}
