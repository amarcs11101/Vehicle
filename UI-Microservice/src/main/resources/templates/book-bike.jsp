<!DOCTYPE html>
<html lang="en-US">
<body>

<h1>Daily Routine</h1>

<div id="piechart" class="center"></div>
<input type="hidden" id="task" value="">
<input type="hidden" id="work" value="">
<input type="hidden" id="eat" value="">
<input type="hidden" id="tv" value="">
<input type="hidden" id="gym" value="">
<input type="hidden" id="sleep" value="">
<style>
.center {
  margin: auto;
  width: 60%;
  border: 3px solid #73AD21;
  padding: 10px;
} 
</style>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script> 
<script type="text/javascript">
$(document).ready(function () {  
getDetails();
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

// Draw the chart and set the chart values
function drawChart() {  
	 var task= $("#task").val();
	 var work= parseInt($("#work").val());
	 var eat= parseInt($("#eat").val());
	 var tv= parseInt($("#tv").val());
	 var gym= parseInt($("#gym").val());
	 var sleep= parseInt($("#sleep").val()); 
  var data = google.visualization.arrayToDataTable([
  		['Task', 'Hours per Day'],['Work', work],['Eat', eat], ['TV', tv], ['Gym', gym], ['Sleep', sleep]
  ]);

  // Optional; add a title and set the width and height of the chart
  var options = {'title':task, 'width':550, 'height':400};

  // Display the chart inside the <div> element with id="piechart"
  var chart = new google.visualization.PieChart(document.getElementById('piechart'));
  chart.draw(data, options);
}
function getDetails(){ 
	$.ajax('http://localhost:8080/book/count', {
	    type: 'GET',  // http method
	    //data: {alert(data) },  // data to submit
	    success: function (backEndData, status, xhr) { 
	        $("#task").val(backEndData.data[0].appName);
	        $("#work").val(backEndData.data[0].work);
	        $("#eat").val(backEndData.data[0].eat);
	        $("#tv").val(backEndData.data[0].tv);
	        $("#gym").val(backEndData.data[0].gym);
	        $("#sleep").val(backEndData.data[0].sleep); 
	    },
	    error: function (jqXhr, textStatus, errorMessage) { 
	            alert("error "+errorMessage)
	    }
	});
}

});
</script>

</body>
</html>
