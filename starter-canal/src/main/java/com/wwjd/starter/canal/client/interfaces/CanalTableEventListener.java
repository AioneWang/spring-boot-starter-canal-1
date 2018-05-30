package com.wwjd.starter.canal.client.interfaces;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * canal 的事件接口层(表结构改变)
 *
 * @author 阿导
 * @CopyRight 萬物皆導
 * @created 2018/5/28 16:37
 * @Modified_By 阿导 2018/5/28 16:37
 */
@FunctionalInterface
public interface CanalTableEventListener {
	
	
	/**
	 * 若是表结构发生改变
	 *
	 * @param rowChange
	 * @return
	 * @author 阿导
	 * @time 2018/5/29 13:25
	 * @CopyRight 万物皆导
	 */
	void onEvent(CanalEntry.EventType eventType,CanalEntry.RowChange rowChange);
}