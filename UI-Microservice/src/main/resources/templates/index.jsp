<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial;
}

/* Style the tab */
.tab {
	overflow: hidden;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
	background-color: inherit;
	float: left;
	border: none;
	outline: none;
	cursor: pointer;
	padding: 14px 16px;
	transition: 0.3s;
	font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
	background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
	background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
	display: none;
	padding: 6px 12px;
	border: 1px solid #ccc;
	border-top: none;
}
</style>
</head>
<body>
	<div class="tab">
		<button class="tablinks" style="width: 50%" id="bike_details">Weekly 
			Routine</button>
		<button class="tablinks" style="width: 50%" id="book_details">Daily 
			Routine</button>
	</div>

	<div id="loadDivd"></div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() { 
			$("#bike_details").click(function() { 
				var url = "/view-bike"; 
				loadUrl(url);
			});
			$("#book_details").click(function() {
				var url = "/book-bike"; 
				loadUrl(url);
			});
			function loadUrl(url){ 
				$("#loadDivd").load(url); 
		   }
		});
	</script>


</body>
</html>
