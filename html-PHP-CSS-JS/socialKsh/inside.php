<html !DOCTYPE>
    <head>
        <meta charset="utf-8" lang="de-CH">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
        <title>InsideHottingen</title>
    </head>

    <body >
    <!--Navigation-->
    <div class="topnav">
        <a class="buttons" href="#Instagram">INSTAGRAM</a>
        <a class="buttons" href="#tellonym">TELLONYM!</a>
      </div>

      <!--Titel-->
      <div>
          <h1 id="Einleitung">Welcome inside Hottinge!</h1>
      </div>

      <!--Spotify player-->
      <div class="blocks" id="spotify">
          <h1>Listening to:</h1>
          <br>
          <iframe src="https://open.spotify.com/embed/track/313E9hw5bIdNO6rbA0ZxmG" width="300" height="380" frameborder="0" allowtransparency="true" allow="encrypted-media" ></iframe>
      </div>

      <div class="blocks" id="schueler">
          <h1>Yearbook</h1>
          <table id="tableIG">
              <tr>
                  <td>
                        <form method="get" action="yearbook.html">
                        <input class="buttons" type="submit" value="Weiter">
          </form>
                    </td>
                    <td>
                        <form method="get" action="https://tellonym.me/socialhottinge">
                        <input class="buttons" id="tellonymButton" type="submit" value="Schreibt uns wenn Ihr drauf sein wollt!">
                        </td>
          </form>
          </td>
          </tr>
          </table>
          
      </div>

      



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