package club.mrxiao.amap.api.impl;


import club.mrxiao.amap.api.AmapService;
import club.mrxiao.amap.api.test.ServiceFactory;
import club.mrxiao.amap.bean.direction.AmapDistanceRequest;
import club.mrxiao.amap.bean.direction.AmapDistanceResult;
import club.mrxiao.common.error.AmapErrorException;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class AmapDistanceServiceImplTest {

    private final Log log = LogFactory.get(this.getClass().getName());

    @Test
    public void query() throws AmapErrorException {
        AmapService service = ServiceFactory.getAmapService();
        AmapDistanceRequest request = AmapDistanceRequest.builder()
                .origins("116.481028,39.989643|114.481028,39.989643|115.481028,39.989643")
                .destination("114.465302,40.004717")
                .type(1)
                .output("JSON")
                .build();
        AmapDistanceResult result = service.getAmapDistanceService().query(request);
        log.info("\n【result】: \n{}", JSON.toJSONString(result));
    }
}