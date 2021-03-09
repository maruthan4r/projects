<?php

$key=strip_tags($_GET['key']);

if ( $key == '1234' )
{
     # weiterleitung auf die seite nach erfolgreichem login
     header('location:inside.html');
     exit();
}
else
{
     # weiterleitung auf die Login-seite ...
     header('location:index.html');
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