package com.sanqing.struts.action;

import com.sanqing.service.ProductService;
import com.sanqing.util.PageResult;
import net.sf.json.JSONSerializer;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class ProductAction extends DispatchAction {
    private ProductService productService;                //产品信息业务逻辑层

    public void setProductService(ProductService productService) {
        this.productService = productService;            //注入产品信息业务逻辑层
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                        HttpServletRequest request, HttpServletResponse response)
            throws IOException {// 如果没有传递actionType，默认执行这个方法
        PrintWriter out = response.getWriter();//获得响应输出流
        out.print("允许访问");                    //输出响应文本
        return null;
    }

    public ActionForward doList(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request, HttpServletResponse response)
            throws Exception {                    //查询所有产品信息
        response.setContentType("text/html;charset=UTF-8");//设置响应文本格式
        PrintWriter out = response.getWriter();                //获得响应输出流
        LazyDynaBean ll = new LazyDynaBean();
        BeanUtils.populate(ll, request.getParameterMap());    //获得请求参数
        Map paramMap = ll.getMap();                            //获得参数封装的MAP
        PageResult pgr = productService.findAll(paramMap);        //查询所有产品信息
        String pgrstr = JSONSerializer.toJSON(pgr).toString();//转换成JSON格式
        out.print(pgrstr);                                    //输出查询结果
        out.close();                                        //关闭响应输出流
        return null;
    }
}