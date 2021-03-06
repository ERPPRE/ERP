<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="commons/taglib.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<title>派工单管理</title>
<%@ include file="commons/meta.jsp"%>
</head>
<body>
	<div style="margin: 10px 30px;">
	<span>您正在做的业务是:生产管理-内部生产管理-生产登记(责任人控制)</span>
	<p>当前等待登记的生产派工单总数为${workordernum}例</p>
		<!-- 派工单列表显示 -->
		<div style="margin-top: 20px;">
			<table id="workorderDataGrid">
					
			</table>

		</div>
	</div>
</body>
<script type="text/javascript">
	$(function(){
		$("#workorderDataGrid").datagrid({
			url:"lbManufactureController.do",
			fitColumns : true,
			striped : true,
			columns:[[
			{
				field:"manufactureid",
				title:"生产派工单编号",
				width:"220"
			},{
				field:"productid",
				title:"产品编号",
				width:"150"
			},{
				field:"productname",
				title:"产品名称",
				width:"150"
			},{
				field:"amount",
				title:"数量",
				width:"60"
			},{
				field:"applyIdGroup",
				title:"出库单号集合",
				width:"160"
			},{
				field:"registerTime",
				title:"登记时间",
				width:"180",
				formatter: function (value, row, index) {
                                var date = new Date(value);
                                var year = date.getFullYear().toString();
                                var month = (date.getMonth() + 1);
                                var day = date.getDate().toString();
                                var hour = date.getHours().toString();
                                var minutes = date.getMinutes().toString();
                                var seconds = date.getSeconds().toString();
                                if (month < 10) {
                                    month = "0" + month;
                                }
                                if (day < 10) {
                                    day = "0" + day;
                                }
                                if (hour < 10) {
                                    hour = "0" + hour;
                                }
                                if (minutes < 10) {
                                    minutes = "0" + minutes;
                                }
                                if (seconds < 10) {
                                    seconds = "0" + seconds;
                                }
                                return year + "-" + month + "-" + day + " " + hour + ":" + minutes + ":" + seconds;
                            }
				
			},{
				field:"checkTag",
				title:"登记",
				width:"50",
				formatter:function(value,row,index){
					var temp=row["manufactureid"];
						return "<a href='lbManufactureController_detail.do?manufactureid='"+temp+">"+"登记</a>";
				}
			}
			]],
			pagination:"true",
			pageSize:5,
			pageList:[2,5,10,15],
			sortName:"MANUFACTURE_ID",
			sortOrder:"asc"
		});
	});
</script>
</html>
