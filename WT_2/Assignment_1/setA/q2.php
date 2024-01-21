<?php

$fstyle=$_POST['fstyle'];
$fsize=$_POST['fsize'];
$fcolor=$_POST['fcolor'];
$bgcolor=$_POST['bgcolor'];



setcookie('style',$fstyle);
setcookie('color',$fcolor);
setcookie('bgcolor',$bgcolor);
setcookie('size',$fsize);

?>

<html>
   <head>
       <title> Second page</title>

    </head>
    <body>

        <p> The information is </p>

        <?php  echo"The font style : ".$fstyle."<br>";
               echo"The font size : ".$fsize."<br>";
               echo"The font color : ".$fcolor."<br>";
               echo"The font bgcolor : ".$bgcolor."<br>";
        ?>
        <form action="q21.php" method="$_POST">
          Press submit to show implementation:<br>
           <input type="submit" value="Send">

        </form>
               

        
    </body>
</html>



