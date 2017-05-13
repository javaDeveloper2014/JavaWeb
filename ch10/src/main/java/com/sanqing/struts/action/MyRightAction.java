/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.sanqing.struts.action;

import com.sanqing.service.RoleService;
import com.sanqing.util.RightList;
import net.sf.json.JSONSerializer;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class MyRightAction extends DispatchAction {
    private RoleService roleService = null;

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    public ActionForward dofindRightName(ActionMapping mapping,
                                         ActionForm form, HttpServletRequest request,
                                         HttpServletResponse response) throws Exception {
        System.out.println("查拥有的权限");
        PrintWriter out = response.getWriter();
        String roleId = request.getParameter("roleId");
        String type = request.getParameter("type");
        System.out.println("角色编号为：" + roleId);
        RightList rl1 = roleService.findRightByRoleId(Long.parseLong(roleId));
        // 转换成JSON数据
        String str1 = JSONSerializer.toJSON(rl1).toString();
        System.out.println(str1);
        out.print(str1);
        return null;
    }
}