package com.mtr.android.Maven;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
	public static <T> T parseJavaObject(String jsonStr, Class<T> clazz) {
		return JSON.toJavaObject(JSON.parseObject(jsonStr), clazz);
	}

	public static void main(String[] args) {
		String json = "[{\"cpu\":{\"max\":17, \"min\":0, \"avg\":7.0},\"mem\":{\"max\":9, \"min\":1, \"avg\":6.67},\"fps\":{\"max\": 1.0, \"min\": 1.0, \"avg\": 1.0}},{\"cpu\":{\"max\":17, \"min\":0, \"avg\":3.58},\"mem\":{\"max\":9, \"min\":1, \"avg\":3.83},\"fps\":{\"max\": 1.0, \"min\": 1.0, \"avg\": 1.0}},{\"cpu\":{\"max\":17, \"min\":0, \"avg\":2.56},\"mem\":{\"max\":9, \"min\":1, \"avg\":3.39},\"fps\":{\"max\": 1.0, \"min\": 1.0, \"avg\": 1.0}}]";
		JSONArray array = JSONArray.parseArray(json);
		List<FpsCollect> list = new ArrayList<FpsCollect>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jobj = array.getJSONObject(i);
			FpsCollect collect = JSON.toJavaObject(jobj, FpsCollect.class);
			list.add(collect);
		}
		
		for(FpsCollect collect:list) {
			System.out.println(collect.getCpu().getMax());
			System.out.println(collect.getFps().getMax());
			System.out.println(collect.getMem().getMax());
		}
	}
}
