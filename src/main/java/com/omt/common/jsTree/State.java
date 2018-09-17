package com.omt.common.jsTree;

/**
 * Created by wangbl on 16/7/27.
 */
public class State {
    boolean opened=true;
    boolean selected=false;
    public State(){
    }
    public State(boolean opened){
        this.opened=opened;
    }
    public State(boolean opened,boolean selected){
        this.opened=opened;
        this.selected=selected;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
