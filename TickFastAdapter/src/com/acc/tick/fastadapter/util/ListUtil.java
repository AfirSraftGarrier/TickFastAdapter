package com.acc.tick.fastadapter.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	public static boolean isEmpty(List list) {
		return list == null || list.size() == 0;
	}

	// public static <T> List<T> getArrayList(T t) {
	// List<T> ts = new ArrayList<T>();
	// if (t != null) {
	// ts.add(t);
	// }
	// return ts;
	// }

	public static <T> List<T> makeSureInit(List<T> ts) {
		if (ts == null) {
			ts = new ArrayList<T>();
		}
		return ts;
	}

	public static <T> List<T> getList(T... ts) {
		List<T> resultTs = new ArrayList<T>();
		for (T t : ts) {
			resultTs.add(t);
		}
		return resultTs;
	}

	// public static boolean containString(List<String> strings, String string)
	// {
	// if (ListUtil.isEmpty(strings) || string == null) {
	// return false;
	// }
	// for (String tempString : strings) {
	// if (string.equals(tempString)) {
	// return true;
	// }
	// }
	// return false;
	// }

	public static <T> boolean isContainString(List<T> stringObjects,
			Object stringObject) {
		if (ListUtil.isEmpty(stringObjects) || stringObject == null) {
			return false;
		}
		for (T tempStringObject : stringObjects) {
			if (stringObject.toString().equals(tempStringObject.toString())) {
				return true;
			}
		}
		return false;
	}

	public static <T> void addAll(List<T> resultTs, List<T> toAddTs) {
		if (resultTs != null && !ListUtil.isEmpty(toAddTs)) {
			resultTs.addAll(toAddTs);
		}
	}
}
