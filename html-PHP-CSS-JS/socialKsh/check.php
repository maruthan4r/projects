<?php

$password=strip_tags($_GET['passwort']);

if ( $password == 'szene1schHottinge' )
{
     # weiterleitung auf die seite nach erfolgreichem login
     header('location:inside.php');
     exit();
}
else
{
     # weiterleitung auf die Login-seite ...
     header('location:index.php');
     exit();
}

?>

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