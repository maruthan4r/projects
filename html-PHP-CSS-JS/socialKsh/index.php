<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8" lang="de-CH">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>SocialHottinge</title>
</head>
<body>

<!--Navigation-->
    <div class="topnav">
        <a class="buttons" href="#Instagram">Accounts</a>
        <a class="buttons" href="#tellonym">DM US!</a>
      </div>

<!--Title-->      
<div id="Einleitung">
    <h1 id="Titel"> SocialHottinge</h1>
    <p> Diese Seite dient zur Unterhaltung und soll niemanden persönlich angreifen.<br>
    Diese Seite steht in keiner Verbindung mit der Kantonsschule Hottingen.</p>
</div>

<!--Public instagram accounts-->
<div id="Instagram" class="pinnwand">

    <table>
        <tbody>
        <tr>
            <h2>Instagram-accounts</h2>
        </tr>
        <tr>
            <td>
                <button class="buttons" onclick="window.location.href='https://www.instagram.com/so.hottinge/'" >SO</button>
            </td>
            <td>
                <button class="buttons" onclick="window.location.href='https://www.instagram.com/hottinge_daily/'" >Hottinge Daily</button>
            </td>
            <td>
                <button class="buttons" onclick="window.location.href='https://www.instagram.com/hottinge_spotted/'" >Hottinge Spotted</button>
            </td>
            <td>
                <button class="buttons" onclick="window.location.href='https://www.instagram.com/hottingestories/'" >Hottinge Stories </button>
            </td>
            <td>
                <button class="buttons" onclick="window.location.href='https://www.instagram.com/hottinger.motzer/'" >Hottinge motzer </button>
            </td>
        </tr>
        <tr>
            <td>

            </td>
        </tr>
        </tbody>
    </table>
</div>

<!--Tellonym-->
<div id="tellonym">
    <button class="buttons" id="tellonymButton" onclick="window.location.href='https://tellonym.me/socialhottinge'">Schreibt uns vorschläge!</button>
</div>

<!--Login-->
<div class="pinnwand">
    <form action="check.php" id="loginField" method="get">

        <table>
            <tr>
                <td><label  for="passwort"><h2>password</h2></label></td>
                <td><input  class="buttons" type="password" name="passwort" size="20" required></td>
                <td><input class="buttons"  type="submit" value="Weiter"></td>
    </tr>
    </table>
    </form>

</div>

<!--Fusszeile-->
<footer>
    <button class="buttons" id="buttontotop" onclick="window.location.href='#Einleitung' " >Back2Top</button>
    <p> V1</p>
</footer>
</body>

<script language="JavaScript">
<!--
function DoFalse(){alert('Was versuechsch du?'); return(false)}

       
if(document.layers)
{
 document.captureEvents(Event.MOUSEDOWN);
 document.onmousedown=DoFalse();
}
//-->
</script>

<script>
document.onkeydown = function(e) {
        if (e.ctrlKey && 
            (e.keyCode === 85 )) {
            return false;
        }
};
</script>
<body oncontextmenu="return DoFalse();"> 

</html>

