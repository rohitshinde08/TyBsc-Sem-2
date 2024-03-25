<?php
setcookie('text',$_POST['t1']);
setcookie('style',$_POST['t2']);
setcookie('bcolor',$_POST['t3']);
setcookie('size',$_POST['t4']);
setcookie('color',$_POST['t5']);
echo"<html><form method=POST action=q22.php>
YOUR SETTIG:";
echo"<br>text=".$_POST['t1'];
echo"<br>Style=".$_POST['t2'];
echo"<br>Bgcolor=".$_POST['t3'];
echo"<br>size=".$_POST['t4'];
echo"<br>fontcolor=".$_POST['t5'];
echo"<input type=submit value=implement>";
?>
