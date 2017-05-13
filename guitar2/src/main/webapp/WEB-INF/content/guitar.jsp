<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>乐器管理</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.mobile.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/easyloader.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
<script>

var builder=null;
var model=null;
var type=null;
var backWood=null;
var topWood=null;
$(function() {
	$('#dg').datagrid({       
		pageNumber: 1,
		url: "${pageContext.request.contextPath}/searchg",
	    rownumbers:true,
	    fitColumns:true,
	    singleSelect:true,
	    height:650,
	    toolbar:[
		 			{
						text:'制造商:<input id="builderInput" name="builder">'	
			 		},	
					{
						text:'型号：<input id="typeInput" name="type">'
					},
					{
						text:'背面木料：<input id="backWoodInput" name="backWood">'
					},
					{
						text:'头部木料：<input id="topWoodInput" name="topWood">'
					}
	 			],
	    columns:[[  
	              {field:'serialNumber',title:'编号',width:100} ,
	              {field:'price',title:'价格',width:100}, 
	              {field:'builder',title:'制造商',width:100},
	              {field:'model',title:'型号',width:100},
	              {field:'type',title:'类型',width:100},
	              {field:'backWood',title:'背面木料',width:100},
	              {field:'topWood',title:'头部木料',width:100}
	    ]]
	});
    $('#builderInput').combobox({    
        url:'${pageContext.request.contextPath}/json/builder.json',    
        valueField:'id',    
        textField:'text',
        onSelect: function(){
        	builder=$('#builderInput').combobox('getValue');
        	query();
		}
    });
    $('#typeInput').combobox({    
        url:'${pageContext.request.contextPath}/json/type.json',    
        valueField:'id',    
        textField:'text',
        onSelect: function(){
        	type=$('#typeInput').combobox('getValue');
        	query();
		}
    });
    $('#backWoodInput').combobox({    
        url:'${pageContext.request.contextPath}/json/wood.json',    
        valueField:'id',    
        textField:'text',
        onSelect: function(){
        	backWood=$('#backWoodInput').combobox('getValue');
        	query();
		}
    });
    $('#topWoodInput').combobox({    
        url:'${pageContext.request.contextPath}/json/wood.json',    
        valueField:'id',    
        textField:'text',
        onSelect: function(){
        	topWood=$('#topWoodInput').combobox('getValue');
        	query();
		}
    });

})
	function query(){
	$('#dg').datagrid('options').url='${pageContext.request.contextPath}/searchg';
		$('#dg').datagrid('load',{
			builder:builder,
			type:type,
			backWood:backWood,
			topWood:topWood
		});
	}
</script>
</head>
<body>
	<input id="builder" type="hidden">
	<input id="type" type="hidden">
	<input id="backWood" type="hidden">
	<input id="topWood" type="hidden">
	<table id="dg"></table>
</body>
</html>