
<?php
session_start();
$eno=$_POST['eno'];
$enm=$_POST['enm'];
$eadd=$_POST['eadd'];

$_SESSION['eno']=$eno;
$_SESSION['enm']=$enm;
$_SESSION['eadd']=$eadd;

?>
<html>
<body>
<form action="q22.php" method="post">
<pre>
<center>
<h2> enter earning of employee:</h2>
Basic: <input type="text" name="e1">
DA:    <input type="text" name="e2">
HRA:   <input type="text" name="e3">
       <input type="submit" value="next">
</center>
</pre>
</form>
</body>
</html>
