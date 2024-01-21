<?php

$sal=$_POST['sal'];
$da=$_POST['da'];
$hra=$_POST['hra'];

$total=$sal+$da+$hra;
  if (isset($_COOKIE['no'])){
    $eno=$_COOKIE['no'];
  }
  if (isset($_COOKIE['name'])){
    $ename=$_COOKIE['name'];
  }
  if (isset($_COOKIE['address'])){
    $eadd=$_COOKIE['address'];
  }

?>


<html>
    <head>
        <title> third page</title>
    </head>

    <body>
    <?php
         echo"<br>Employee No : ".$eno."<br><br>";
        echo"Employee Name : ".$ename."<br>";
        echo"Employee Address : ".$eadd."<br>";
        echo"Employee Salary : ".$sal."<br>";
        echo"Employee DA : ".$da."<br>";
        echo"Employee HRA : ".$hra."<br>";
        echo"Employee's Total salary  : ".$total."<br><br>";

        ?>
        
    </body>


</html>
