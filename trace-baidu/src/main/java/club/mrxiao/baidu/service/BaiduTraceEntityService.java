package club.mrxiao.baidu.service;

import club.mrxiao.baidu.request.BaiduTraceCommonRequest;
import club.mrxiao.baidu.request.BaiduTraceEntityRequest;

/**
 * 终端管理类接口
 * @author xiaoyu
 */
public interface BaiduTraceEntityService {
    /**
     * 创建entity，并赋属性信息
     */
    String ENTITY_ADD = "entity/add";

    /**
     * 更新entity
     */
    String ENTITY_UPDATE = "entity/update";

    /**
     * 删除entity
     */
    String ENTITY_DELETE = "entity/delete";

    /**
     * entity列表
     */
    String ENTITY_LIST = "entity/list";

    /**
     * 创建entity
     * @param baiduTraceEntityRequest
     */
    void entityAdd(BaiduTraceEntityRequest baiduTraceEntityRequest);

    /**
     * 更新entity
     * @param baiduTraceEntityRequest
     */
    void entityUpdate(BaiduTraceEntityRequest baiduTraceEntityRequest);

    /**
     * 删除entity
     * @param baiduTraceEntityRequest
     */
    void entityDelete(BaiduTraceEntityRequest baiduTraceEntityRequest);

    /**
     * 查询entity列表
     * @param baiduTraceCommonRequest
     */
    void entityList(BaiduTraceCommonRequest baiduTraceCommonRequest);
}
