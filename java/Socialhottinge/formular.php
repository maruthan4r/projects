<!DOCTYPE html>
<html lang = "de-CH"> 
	<head> 
	<link href="CSS/style.css" rel="stylesheet" type="text/css">
	<meta charset="utf-8">

		<title> Formular mit get-Methode versenden</title> 

	</head>
	
	<body>
					<?php

		 
		echo 	"<h2> IHRE DATEN</h2>";
		
		echo 'Vorname: ' . $_GET['vorname'];
		echo "<br>";
		echo 'Nachname: ' . $_GET['nachname'];
		echo "<br>";
		echo 'Wohnort: ' . $_GET['wohnort'];
		?>
	
	<h1> Formular mit GET-Methode versenden</h1>
	
	
		
		
		<form method="get" action="formular.php" accept-charset="utf-8">
		
		<label for = "vorname"> <p>vorname</p></label>
		<input type="text" name = "vorname" 	placeholder="-"	size="20" autofocus> 
		
		<label for = "nachname"><p>nachname</p></label>
		<input type="text" name = "nachname" 	placeholder="-"	size="20">
		
		<label for = "wohnort"><p>wohnort</p></label>
		<input type="text" name = "wohnort" 	placeholder="-"	size="20">
		
		
		<fieldset>
			<legend>Ich bestelle Informationen zu</legend>
				<label><input type="checkbox" name="infos[]" value="PHP" class="check-radio"> PHP</label><br>
				<label><input type="checkbox" name="infos[]" value="JavaScript" class="check-radio"> JavaScript</label><br>
				<label><input type="checkbox" name="infos[]" value="CSS" class="check-radio"> CSS</label>
		</fieldset>
		<fieldset>
			<legend>Ich abonniere den Newsletter</legend>
				<label><input type="radio" name="newsletter" value="ja" class="check-radio"> ja</label><br>
				<label><input type="radio" name="newsletter" value="nein" class="check-radio"> nein</label>
		</fieldset>
	
		
		<p><input type="submit" value="Datei absenden.">  <input type="reset" value="Löschen"></p>
		
		
		</form>
		

		
	</body>

</html>