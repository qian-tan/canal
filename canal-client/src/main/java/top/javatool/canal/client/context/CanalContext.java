package top.javatool.canal.client.context;


import top.javatool.canal.client.model.CanalModel;

/**
 * @author yujiacheng
 * @date 2019-07-24
 */
public class CanalContext {



    private static ThreadLocal<CanalModel> threadLocal = new ThreadLocal<>();




    public static CanalModel getModel(){
       return threadLocal.get();
    }


    public static void setModel(CanalModel canalModel){
        threadLocal.set(canalModel);
    }


    public  static void removeModel(){
        threadLocal.remove();
    }
}
