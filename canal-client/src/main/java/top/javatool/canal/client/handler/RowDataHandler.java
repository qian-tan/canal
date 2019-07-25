package top.javatool.canal.client.handler;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * @author yujiacheng
 * @date 2019-07-24
 */
public interface RowDataHandler<T> {


    <R> void handlerRowData(T t, EntryHandler<R> entryHandler, CanalEntry.EventType eventType) throws Exception;
}
