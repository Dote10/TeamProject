<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.JAGym.system.dto.MemberChartDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.5.1/chart.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<canvas id="myChartOne" width="300" height="300"></canvas>
			</div>
			<div class="col-md-6">
				<canvas id="myChartTwo" width="300" height="300"></canvas>
			</div>
			<div class="col-md-6">
				<canvas id="myChartThree" width="300" height="300"></canvas>
			</div>
			<div class="col-md-6">
				<canvas id="myChartFour" width="300" height="300"></canvas>
			</div>
		</div>
	</div>
	<script>
		var myChartOne = document.getElementById('myChartOne').getContext('2d');
		var myChartTwo = document.getElementById('myChartTwo').getContext('2d');
		var myChartThree = document.getElementById('myChartThree').getContext('2d');
		var myChartFour = document.getElementById('myChartFour').getContext('2d');
		

		var membercountlist = new Array();
		
		<c:forEach var = "member" items="${memberChart}" varStatus="status">
		membercountlist.push("${member.mCount}");
		</c:forEach>
		
		console.log(membercountlist);
		
		var barChart = new Chart(myChartOne,{
			type:'bar',//pie,line,doughnut,polarArea
			data:{
				labels :['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
				datasets : [{
					label:'회원등록 추이',	
					
					data: membercountlist					
				}]
			}
		});
		
		
		var BarChart = new Chart(myChartTwo,{
			type:'bar',//pie,line,doughnut,polarArea
			data:{
				labels :['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
				datasets : [{
					label:'회원등록 추이',	
					
					data: [
						10,
						20,
						100,
						70,
						50,
						90,
						40,
						60,
						70,
						100,
						60,
						45
					]					
				}]
			}
		});
		
		
		var LineChart = new Chart(myChartThree,{
			type:'line',//pie,line,doughnut,polarArea
			data:{
				labels :['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
				datasets : [{
					label:'회원등록 추이',	
					
					data: [
						10,
						20,
						100,
						70,
						50,
						90,
						40,
						60,
						70,
						100,
						60,
						45
					]					
				}]
			}
		});
		
		
		var PolarAreaChart = new Chart(myChartFour,{
			type:'polarArea',//pie,line,doughnut,polarArea
			data:{
				labels :['Health','Pilates','Yoga'],
				datasets : [{
					label:'회원등록 추이',	
					
					data: [100,60,30]					
				}]
			}
		});
		
		
	
	</script>
</body>
</html>