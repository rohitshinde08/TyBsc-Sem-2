<?php
$nm=$_GET['t1'];
$name=array("PRATIKSHA","PIYA","RANI","TANVI");
if($nm==null)
{
   echo "<br> strange, please tell me your name!";
}
else if(in_array(strtoupper($nm),$name))
{
  echo"<br> Hello Master".$nm."!";
}
else
{
   echo"<br>".$nm.",I don't know you";
}
?>        
