package top.javatool.canal.client.handler;

/**
 * @author yujiacheng
 * @date 2019-07-24
 */
public interface MessageHandler<T> {



     void handleMessage(T t);
}
