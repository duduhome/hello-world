<%--
  Created by IntelliJ IDEA.
  User: zhaojj
  Date: 15/11/3
  Time: 下午10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
  <script type="text/javascript" src="JS/jquery-2.1.4.js"></script>
  <script type="text/javascript" src="JS/myjs.js"></script>
  <script language="JavaScript" type="text/javascript" src="jquery-easyui-1.3.6/jquery.min.js" charset="utf-8"></script>
  <!--(指定编码方式，防止出现乱码)引入EasyUI中使用的Jquery版本-->
  <script language="JavaScript" type="text/javascript" src="jquery-easyui-1.3.6/jquery.easyui.min.js" charset="utf-8"></script>
  <!--(指定编码方式，防止出现乱码)引入EasyUi文件-->
  <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/default/easyui.css">   <!--引入CSS样式-->
  <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/icon.css">   <!--Icon引入-->
  <script language="JavaScript" type="text/javascript" src="jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>  <!--汉化-->
</head>
<body>
<div id="tb" style="padding:5px;height:auto">
  <div style="margin-bottom:5px">
    <a class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#win').window('open')">增加</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true">修改</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true">删除</a>
  </div>
  <div>
    Date From: <input class="easyui-datebox" style="width:80px">
    To: <input class="easyui-datebox" style="width:80px">
    类型选择:
    <input class="easyui-combobox" style="width:100px"
           url="data/combobox_data.json"
           valueField="id" textField="text">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search">查询</a>
  </div>
</div>
<table class="easyui-datagrid" style="width:600px;height:500px"
       url="data/datagrid_data.json"
       title="我的账本" toolbar="#tb"
       singleSelect="true" fitColumns="true" rownumbers="true" pagination="true">
  <thead>
  <tr>
    <th field="itemid" width="60">时间</th>
    <th field="productid" width="80">类型</th>
    <th field="listprice" width="70">金额</th>
    <th field="unitcost" width="70">详情</th>
  </tr>
  </thead>
</table>
<div id="win" class="easyui-window" title="增加账目" closed="true" style="width:300px;height:180px;">
  <form style="padding:10px 20px 10px 40px;">
    <p>金额: <input type="text"></p>
    <p>详情: <input type="text"></p>
    <div style="padding:5px;text-align:center;">
      <a href="#" class="easyui-linkbutton" icon="icon-ok">Ok</a>
      <a href="#" class="easyui-linkbutton" icon="icon-cancel">Cancel</a>
    </div>
  </form>
</div>
</body>
</html>
