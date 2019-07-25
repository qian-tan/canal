package top.javatool.canal.client.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yujiacheng
 * @date 2019-07-24
 */
public class CanalThreadUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {


    private Logger logger = LoggerFactory.getLogger(CanalThreadUncaughtExceptionHandler.class);

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        logger.error("thread "+ t.getName()+" have a exception",e);
    }
}
