
<?php
session_start();
$e1=$_POST['e1'];
$e2=$_POST['e2'];
$e3=$_POST['e3'];
echo"<h3> employee details</h3>";
echo"emp no:".$_SESSION['eno']."<br>";
echo"emp name:".$_SESSION['enm']."<br>";
echo"emp address:".$_SESSION['eadd']."<br>";
echo"Basic:".$e1."<br>";
echo"DA:".$e2."<br>";
echo"HRA:".$e3."<br>";
$total=$e1+$e2+$e3;
echo"<h2> total of earning is:".$total."</h2>";
?>
