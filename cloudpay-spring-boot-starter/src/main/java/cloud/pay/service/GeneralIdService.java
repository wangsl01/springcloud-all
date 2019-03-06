package cloud.pay.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:10:362019/3/6
 */

public class GeneralIdService {

//    private GeneralWorkProperties GeneralWorkProperties;
//
//    public GeneralWorkProperties getGeneralWorkProperties() {
//        return GeneralWorkProperties;
//    }
//
//    public void setGeneralWorkProperties(GeneralWorkProperties generalWorkProperties) {
//        GeneralWorkProperties = generalWorkProperties;
//    }
    private Map<String,IdWorker> workerMap = new ConcurrentHashMap<>(32);

    public long getSequence(long workerId, long datacenterId,long sequence) throws Exception {
        String key = workerId+""+datacenterId;
//        Map<String,IdWorker> workerMap = GeneralWorkProperties.getWorkerMap();
        IdWorker  worker = workerMap.get(key);
        if(worker == null){
           synchronized (this){
               worker = workerMap.get(key);
               if(worker == null) {
                   worker = new IdWorker(workerId, datacenterId, sequence);
                   workerMap.put(key, worker);
               }
           }
        }
        return worker.nextId();
    }

}



