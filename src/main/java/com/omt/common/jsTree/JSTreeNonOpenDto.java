package com.omt.common.jsTree;

/**
 * Created by wangbl on 16/7/27.
 */
public class JSTreeNonOpenDto {
    String id="";
    String text="";
    String icon="";
    boolean children=true;
    State state=new State(false);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
