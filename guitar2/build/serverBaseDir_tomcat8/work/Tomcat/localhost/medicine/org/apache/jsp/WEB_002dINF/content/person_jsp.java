/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-11-28 07:53:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class person_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>未遂事件录入及上报</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/login.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.mobile.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/easyloader.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/datagrid-detailview.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t//权限管理\r\n");
      out.write("\tvar str=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['permissions']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\t\r\n");
      out.write("\tvar riskResultValue=new Array();\r\n");
      out.write("\tvar naerMissSnValue=new Array();\r\n");
      out.write("\tvar eventProcessValue=new Array();\r\n");
      out.write("\tvar reasonAnalysisValue=new Array();\r\n");
      out.write("\tvar preventMeasureValue=new Array();\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t<!--数据网络-->\r\n");
      out.write("\t\t$('#dg').datagrid({\r\n");
      out.write("\t\t\t\t\t\t\tpageNumber : 1,\r\n");
      out.write("\t\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/showBuy\",\r\n");
      out.write("\t\t\t\t\t\t\trownumbers : true,\r\n");
      out.write("\t\t\t\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\t\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\t\t\t\t\tsingleSelect : true,\r\n");
      out.write("\t\t\t\t\t\t\tnowrap:false,\r\n");
      out.write("\t\t\t\t\t\t\tpageList : [ 5, 10, 15, 20 ],\r\n");
      out.write("\t\t\t\t\t\t\ttoolbar : [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext : '增加',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid:'addtool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar str=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['permissions']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"160101\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#addtool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#addbtn').show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#editbtn').hide();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#win').window('open');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#form').form('disableValidation');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid:'edittool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thandler : function() {\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar str=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['permissions']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"160102\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#edittool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t//数据回显\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\tvar rows=$(\"#dg\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\tif (rows){\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\tif(rows[0].nearMissState=='未上报'){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#editbtn').show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#addbtn').hide();\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t$('#win').window('open');  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t//对表单数据进行填充\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t$('#form').form('load',{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\tnearMissSn:rows[0].nearMissSn,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\teventName:rows[0].eventName,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\thappenDate:rows[0].happenDate,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\thappenLocation:rows[0].happenLocation,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\teventProcess:rows[0].eventProcess,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\triskResult:rows[0].riskResult,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\triskLevel:rows[0].riskLevel,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\treasonAnalysis:rows[0].reasonAnalysis,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\tpreventMeasure:rows[0].preventMeasure,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t\tnearMissTypeSn:rows[0].nearMissTypeSn\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\t\t$.messager.alert('提示','已上报');\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle:'消息提示',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tmsg:'请先选择您要编辑的未遂事件！',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowType:'null',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttop:'50'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-remove',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid:'deletetool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar str=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['permissions']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"160103\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#deletetool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar row = $('#dg').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (row) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(row.nearMissState=='未上报'){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.confirm('选择是否删除','您确定要删除该未遂事件吗?',function(fn) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif(fn==true){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/attempted/event/deleteNearMiss',{nearMissSn:row.nearMissSn},function(message){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示',message); \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示','已上报');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示','请先选择要删除的未遂事件');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-mini-add',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext : '上报',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid:'reporttool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar str=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['permissions']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"160104\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#reporttool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar row = $('#dg').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (row) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(row.nearMissState=='未上报'){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.confirm('选择是否上报','您确定要上报该未遂事件吗?',function(fn) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (fn==true) \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/attempted/event/changeStateNearMiss',{nearMissSn:row.nearMissSn,range:'上报'},function(message){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示',message); \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示','已上报');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示','请先选择要上报的行');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\t\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : 'nearMissSn',\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : '未遂事件编号',\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 1,hidden:true\r\n");
      out.write("\t\t\t\t\t\t\t}]]\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t//事件类型编号下拉框加载\r\n");
      out.write("\t\t$('#nearMissType').combobox({\r\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/attempted/event/typeNearMiss',\r\n");
      out.write("\t\t\tvalueField : 'nearMissTypeSn',\r\n");
      out.write("\t\t\ttextField : 'nearMissTypeName',\r\n");
      out.write("\t\t\tprompt : '请选择未遂事件类型'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#addbtn').bind('click', function(){    \r\n");
      out.write("\t\t\t$('#form').form('enableValidation');\r\n");
      out.write("\t\t\t$('#form').form('submit', {\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/attempted/event/addNearMiss\",\r\n");
      out.write("\t\t\t\tsuccess: function(message){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示',message.substring(1,message.length-1)); \r\n");
      out.write("\t\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t$('#win').window('close');\r\n");
      out.write("\t\t\t\t\t$('#form').form('reset');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t$('#editbtn').bind('click', function(){    \r\n");
      out.write("\t\t\t$('#form').form('enableValidation');\r\n");
      out.write("\t\t\t$('#form').form('submit', {\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/attempted/event/updateNearMiss.action\",\r\n");
      out.write("\t\t\t\tsuccess: function(){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示','修改成功'); \r\n");
      out.write("\t\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t$('#win').window('close');\r\n");
      out.write("\t\t\t\t\t$('#form').form('reset');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})  \r\n");
      out.write("\t    });\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 未遂事件数据列表 -->\r\n");
      out.write("\t<table id=\"dg\"></table>\r\n");
      out.write("\t<!-- 未遂事件填写窗口-->\r\n");
      out.write("\t<div id=\"win\" class=\"easyui-window\" title=\"未遂事件信息\" closed=\"true\" style=\"width: 950px; height: 400px; padding: 5px;\">\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<form id=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t<div style=\"margin-left: 30px\">\r\n");
      out.write("\t\t\t\t<div style=\"diapaly: inline\">\r\n");
      out.write("\t\t\t\t\t <input name=\"nearMissSn\" hidden/>\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">事件类型：</label>\r\n");
      out.write("\t\t\t\t</div><br />\r\n");
      out.write("\t\t\t\t<div id=\"dlg-buttons\" style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t\t<a id=\"addbtn\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\">确认添加</a>\r\n");
      out.write("\t\t\t\t\t<a id=\"editbtn\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\">确认修改</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
