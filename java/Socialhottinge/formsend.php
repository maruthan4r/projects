<html> 
	<head> 
	<link href="CSS/style.css" rel="stylesheet" type="text/css">
	<meta charset="utf-8">

		<title> Bestätigung</title> 

	</head>
	
	<body>
	<form>
					<?php

		 
		echo	"<h2> Bestätigung</h2>";
		
		if (isset($_POST['vorname'])){
		echo	'Vorname: ' . $_POST['vorname'];
		} else {echo 'Kein Vorname';}
		echo 	"<br>";
		
		if (isset($_POST['nachname'])){
		echo 	'Nachname: ' . $_POST['nachname'];
		} else{ echo 'kein Nachname' ;}
		echo 	"<br>";
		
		if (isset($_POST['email'])){
		echo 	'E-Mail: ' . $_POST['email'];
		}else {echo 'keine Gültige E-Mail';}
		
		$email = $_POST['email'];	
		$vorname = $_POST['vorname'];
		$nachname = $_POST['nachname'];
		$betreff = $_POST['betreff'];
		$nachricht = $_POST['nachricht'];
		
		mail($email ,$betreff ,$nachricht,
		"From: info@webpubli.ch\r\nContent-type: text/plain; charset=utf-8", 
		'-finfo@webpubli.ch');

		?>
	
		</form>
		
		</body>
		
		</html>