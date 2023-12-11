package club.mrxiao.amap.bean.direction;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <pre>
 *  距离测量响应对象
 * </pre>
 * @author <a href="https://github.com/huangDouP">huangDouP</a>
 * @since 2023-12-11
 */
@Data
public class AmapDistanceResult implements Serializable {
    private Integer status;
    private String info;
    private Integer infocode;
    private Integer count;
    private List<DistanceResult> results;

    public static AmapDistanceResult toObject(String json) {
        return JSONObject.parseObject(json, AmapDistanceResult.class);
    }

    public JSONObject toJson() {
        String beanString = JSON.toJSONString(this);
        return JSONObject.parseObject(beanString);
    }

    @Data
    public static class DistanceResult {
        private String originId;
        private String destId;
        private BigDecimal distance;
        private BigDecimal duration;
        /**
         * 仅在出错的时候显示该字段。大部分显示“未知错误”
         * 由于此接口支持批量请求，建议不论批量与否用此字段判断请求是否成功
         */
        private String info;
        /**
         * 仅在出错的时候显示此字段。
         * 在驾车模式下：
         * 1，指定地点之间没有可以行车的道路
         * 2，起点/终点 距离所有道路均距离过远（例如在海洋/矿业）
         * 3，起点/终点不在中国境内
         */
        private Integer code;
    }
}
