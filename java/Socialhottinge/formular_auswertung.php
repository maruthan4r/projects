<!DOCTYPE html>
<html> 
	<head> 
	<meta charset="utf-8">

		<title> Formular mit get-Methode versenden</title> 

	</head>
	
	<body>
	
	

	
		<?php
		
		 $vorname = $_GET['vorname'];
		 $nachname = $_GET['nachname'];
		 $wohnort = $_GET['wohnort'];
		 
		echo 	"<h2> IHRE DATEN</h2>";
		
		echo 'Vorname: ' . $vorname;
		echo "<br>";
		echo 'Nachname: ' .$nachname;
		echo "<br>";
		echo 'Wohnort: ' .$wohnort;
		?>
		
	</body>

</html>