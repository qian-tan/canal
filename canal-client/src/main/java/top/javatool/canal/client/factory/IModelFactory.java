package top.javatool.canal.client.factory;


import top.javatool.canal.client.handler.EntryHandler;

import java.util.Set;

/**
 * @author yujiacheng
 * @date 2019-07-24
 */
public interface IModelFactory<T> {


    <R> R newInstance(EntryHandler entryHandler, T t) throws Exception;


    default <R> R newInstance(EntryHandler entryHandler, T t, Set<String> updateColumn) throws Exception {
        return null;
    }
}
