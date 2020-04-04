package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

public class ToUpperCase extends BodyTagSupport {

    //第一步，告诉程序，将原来的hello变成大写，即将doStartTag()的返回值设置成EVAL_BODY_BUFFER(已经在父类默认实现)
    //第二步，获取，并修改


    @Override
    public int doEndTag() throws JspException {
        String content = getBodyContent().getString();
        content = content.toUpperCase();
        try {
            bodyContent.getEnclosingWriter().write(content);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return super.doEndTag();//默认6，代表标签执行完毕后是否执行其他的JSP元素
    }
}
