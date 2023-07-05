package com.jzfw.bean;

import java.io.Serializable;

public class BasePrivilege implements Serializable {
   private Long id;
   private String name;
   private String description;
   private String route;
   private String routeName;
   private String type;
   private String icon;
   private Integer hidden;
   private Integer num;
   private Long parentId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name == null ? null : name.trim();
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description == null ? null : description.trim();
   }

   public String getRoute() {
      return this.route;
   }

   public void setRoute(String route) {
      this.route = route == null ? null : route.trim();
   }

   public String getRouteName() {
      return this.routeName;
   }

   public void setRouteName(String routeName) {
      this.routeName = routeName == null ? null : routeName.trim();
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type == null ? null : type.trim();
   }

   public String getIcon() {
      return this.icon;
   }

   public void setIcon(String icon) {
      this.icon = icon == null ? null : icon.trim();
   }

   public Integer getHidden() {
      return this.hidden;
   }

   public void setHidden(Integer hidden) {
      this.hidden = hidden;
   }

   public Integer getNum() {
      return this.num;
   }

   public void setNum(Integer num) {
      this.num = num;
   }

   public Long getParentId() {
      return this.parentId;
   }

   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }
}
