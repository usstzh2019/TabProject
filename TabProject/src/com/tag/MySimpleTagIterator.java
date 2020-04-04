package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MySimpleTagIterator extends SimpleTagSupport {
    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspFragment jspFragment = getJspBody();
        for (int i = 0; i <num ; i++) {
            jspFragment.invoke(null);
        }

    }
}
