package club.mrxiao.amap.api.impl;

import club.mrxiao.amap.api.AmapDistanceService;
import club.mrxiao.amap.api.AmapService;
import club.mrxiao.amap.bean.direction.AmapDistanceRequest;
import club.mrxiao.amap.bean.direction.AmapDistanceResult;
import club.mrxiao.common.error.AmapErrorException;
import lombok.AllArgsConstructor;

/**
 * <pre>
 *  距离测量
 * </pre>
 * @author <a href="https://github.com/huangDouP">huangDouP</a>
 * @since 2023-12-11
 */
@AllArgsConstructor
public class AmapDistanceServiceImpl implements AmapDistanceService {

    private AmapService amapService;

    @Override
    public AmapDistanceResult query(AmapDistanceRequest request) throws AmapErrorException {
        String result = this.amapService.get(DISTANCE, request.toJson());
        return AmapDistanceResult.toObject(result);
    }
}
