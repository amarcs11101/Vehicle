/**
 * 
 */
package com.abhishek.amar.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abhishek.amar.bean.ReactiveFormsBean;
import com.abhishek.amar.bean.UIBean;

/**
 * @author Abhishek Amar
 *
 */
public class UiUtils {

	public static UIBean showUITemplate() {
		UIBean ui = new UIBean();
		ui.setNavigation("header");

		List<String> navigationData = new ArrayList<>();
		String s1 = new String("HOME");
		String s2 = new String("UPDATE");
		String s3 = new String("DELETE");
		String s4 = new String("VIEW");

		navigationData.add(s1);
		navigationData.add(s2);
		navigationData.add(s3);
		navigationData.add(s4);

		ui.setNavigationDataList(navigationData);

		Map<String, String> map = new HashMap<>();
		map.put("home", "");
		map.put("update", "");
		map.put("delete", "");
		map.put("view", "");
		ui.setComponentName(map);

		ui.setHref("");
		return ui;
	}

	public static List<ReactiveFormsBean> getFormList() {
		List<ReactiveFormsBean> list = new ArrayList<>();
		ReactiveFormsBean bean = new ReactiveFormsBean();
		bean.setFieldName("name");
		bean.setType("text");
		list.add(bean);

		ReactiveFormsBean bean1 = new ReactiveFormsBean();
		bean1.setFieldName("salary");
		bean1.setType("text");
		list.add(bean1);

		ReactiveFormsBean bean2 = new ReactiveFormsBean();
		bean2.setFieldName("address");
		bean2.setType("text");
		list.add(bean2);

		ReactiveFormsBean bean3 = new ReactiveFormsBean();
		bean3.setFieldName("gender");
		bean3.setType("select");
		list.add(bean3);
		
		ReactiveFormsBean bean4 = new ReactiveFormsBean();
		bean4.setFieldName("Submit");
		bean4.setType("button");
		
		list.add(bean4);
		
		ReactiveFormsBean bean5 = new ReactiveFormsBean();
		bean5.setFieldName("Address");
		bean5.setType("textarea");
		
		list.add(bean5);
		return list;
	}
}
