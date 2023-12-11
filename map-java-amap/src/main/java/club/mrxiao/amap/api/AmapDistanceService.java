package club.mrxiao.amap.api;

import club.mrxiao.amap.bean.direction.AmapDistanceRequest;
import club.mrxiao.amap.bean.direction.AmapDistanceResult;
import club.mrxiao.common.error.AmapErrorException;

/**
 * <pre>
 *  距离测量
 * </pre>
 * @author <a href="https://github.com/huangDouP">huangDouP</a>
 * @since 2023-12-11
 */
public interface AmapDistanceService {

    /**
     * 距离测量API服务地址
     */
    String DISTANCE = "https://restapi.amap.com/v3/distance";

    /**
     * 距离测量信息
     * @param request {@link AmapDistanceRequest}
     * @return {@link AmapDistanceResult}
     * @throws AmapErrorException 错误信息
     * <pre>
     *   <a href="https://lbs.amap.com/api/webservice/guide/api/direction#distance">查看文档</a>
     * </pre>
     */
    AmapDistanceResult query(AmapDistanceRequest request) throws AmapErrorException;
}
