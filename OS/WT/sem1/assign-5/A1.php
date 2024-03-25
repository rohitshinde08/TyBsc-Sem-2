<?php
$fnm=$_GET['t1'];
echo "File Name : $fnm <br><br>";
$fp=fopen($fnm,"r");
if (!$fp)
echo "File not Found <br><br>";
else
{
  $fs=filesize($fnm);
  echo "<br><br> Contents of File : ";
  echo fread($fp,$fs);
  echo "<br><br> Size Of File : $fs";
}
?>  
