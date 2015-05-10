package com.mfe.entity.security;

public class Menu {
	/**
	 * 菜单唯一标识
	 */
	private String menuKey;
	/**
	 * 菜单父节点
	 */
	private String parentID;
	/**
	 * 菜单名称
	 */
	private String menuName;
	public String getMenuKey() {
		return menuKey;
	}
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	} 
	
}
