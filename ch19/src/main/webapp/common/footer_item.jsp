<%@ page language="java" pageEncoding="UTF-8"%> 
<br/>
<div class="foot" style="border-top:1px #000000 solid;">
	<br/>
	<a href="${ctx }/homepage/homepage!aboutmequery.action">
		关于我们
	</a> &nbsp;&nbsp;|&nbsp;&nbsp;
	广告服务 &nbsp;&nbsp;|&nbsp;&nbsp; 
	<a href="${ctx }/homepage/homepage!aboutmequery.action">
		联系我们 
	</a>&nbsp;&nbsp;|&nbsp;&nbsp; 
	<a href="javascript:void(0)" onClick=this.style.behavior='url(#default#homepage)';this.setHomePage('http://<%=request.getServerName() %>');return false;>
		设置首页
	</a> &nbsp;&nbsp;|&nbsp;&nbsp; 
	商家招聘
	<br/><br/>
	Copyright &copy; 2009 <%=ConstantUtils.restaurantName %>. All rights reserved
	<br/><br/>
	 <a href="http://www.tienting.com" target="_blank">圣古科技(深圳)有限公司&nbsp;&nbsp;版权所有</a>&nbsp;&nbsp;
	<a href="http://www.miibeian.gov.cn/" target="_blank">粤ICP备09165131号</a>
</div>
