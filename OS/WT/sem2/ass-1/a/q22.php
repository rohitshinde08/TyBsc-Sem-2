<?php
$text=$_COOKIE['text'];
$s=$_COOKIE['style'];
$b=$_COOKIE['bcolor'];
$sz=$_COOKIE['size'];
$c=$_COOKIE['color'];
echo"<html>
<body bgcolor=$b>
<font size=$sz color=$c>
<$s>$text</$s>
</font>
</body>
</html>";
?>
