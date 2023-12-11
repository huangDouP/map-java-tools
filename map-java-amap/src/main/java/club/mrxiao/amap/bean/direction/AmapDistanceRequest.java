package club.mrxiao.amap.bean.direction;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 *  距离测量请求对象
 * </pre>
 * @author <a href="https://github.com/huangDouP">huangDouP</a>
 * @since 2023-12-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmapDistanceRequest {
    /**
     * 请求服务权限标识
     */
    private String key;
    /**
     * 出发点
     * <pre>
     * 支持100个坐标对，坐标对见用“| ”分隔；经度和纬度用","分隔
     * </pre>
     */
    private String origins;
    /**
     * 目的地
     */
    private String destination;
    /**
     * 路径计算的方式和方法
     * <pre>
     *  0：直线距离
     *  1：驾车导航距离（仅支持国内坐标）必须指出，当为1时会考虑路况，故在不同时间请求返回结果可能不同。
     *  此策略和驾车路径规划接口的 strategy=0策略基本一致，策略为“ 速度优先，此路线不一定距离最短
     *  3：步行规划距离（仅支持5km之间的距离）
     * </pre>
     */
    private Integer type;
    /**
     * 数字签名
     */
    private String sig;
    /**
     * 返回数据格式类型
     */
    private String output;
    /**
     * 回调函数
     * callback值是用户定义的函数名称，此参数只在output=JSON时有效
     */
    private String callback;

    public JSONObject toJson() {
        String beanString = JSON.toJSONString(this);
        return JSONObject.parseObject(beanString);
    }
}
