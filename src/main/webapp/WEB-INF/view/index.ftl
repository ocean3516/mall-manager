<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jyl商城后台管理系统</title>
<link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css" />
<script type="text/javascript" src="/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<body class="easyui-layout">
	<!-- 左边菜单展示 -->
	<div data-options="region:'west',split:true,title:'菜单'" style="width: 180px; padding: 10px;">
		<ul id="menu" class="easyui-tree" style="margin-top: 10px; margin-left: 5px;">
			<li><span>商品管理</span>
				<ul>
					<li data-options="attributes:{'url':'/item-add'}">新增商品</li>
					<li data-options="attributes:{'url':'/item-list'}">查询商品</li>
				</ul></li>
		</ul>
	</div>
	<!-- 标签页展示 -->
	<div data-options="region:'center',title:''">
		<div id="tabs" class="easyui-tabs"></div>
	</div>
	<script type="text/javascript">
		$(function() {
			$("#menu").tree({
				onClick : function(node) {
					if ($("#menu").tree("isLeaf", node.target)) {
						var tabs = $("#tabs");
						var tab = tabs.tabs("getTab", node.text);
						if (tab) {
							tabs.tabs("select", node.text);
						} else {
							tabs.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true
							});
						}
					}
				}
			});
		});
	</script>
</body>