<?php

$no=$_POST['no'];
$name=$_POST['name'];
$address=$_POST['address'];

setcookie('no',$no);
setcookie('name',$name);
setcookie('address',$address);

?>


<html>
    <head>
        <title> Second page </title>
    </head>

    <body>

    <?php
         echo"<br>Employee No : ".$no."<br>";
        echo"Employee Name : ".$name."<br>";
        echo"Employee Address : ".$address."<br><br>";

        ?>
        
    <form action="q21.php" method="POST">
        Enter salary :<input type="number" name="sal"><br><br>
        Enter DA :<input type="number" name="da"><br><br>
        Enter HRA :<input type="number" name="hra"><br><br>
        
        <input type="submit" value="Send">


    </form>
</body>

</html>
