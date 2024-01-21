<?php


   if (isset($_COOKIE['style']))
   {
      $st=$_COOKIE['style'];
   }
   if (isset($_COOKIE['color']))
   {
      $color=$_COOKIE['color'];
   }
   if (isset($_COOKIE['bgcolor']))
   {
      $bgcolor=$_COOKIE['bgcolor'];
   }
   if (isset($_COOKIE['size']))
   {
      $size=$_COOKIE['size'];
   }


?>

<html>
    <head>
        <title> Final webpage </title>

        <style>
            body{
                background-color: <?php echo$bgcolor ?>;
            }
            p{
                font-style: <?php echo$st?>;
                font-size: <?php  echo$size?>;
                color: <?php echo$color?>;

            }
        </style>
    </head>

    <body>
           <p>
              Hello this is your final results .
           </p>
    </body>


</html>


<html>
    <head>
        <title> Enter page </title>
        <style>
            p{

            }
        </style>
    </head>
    <body>
       
        <form action="second.php" method="POST">
          Enter font style : <input type="text" name="fstyle"><br>
          Enter font size : <input type="text" name="fsize"><br>
          Enter font color : <input type="text" name="fcolor"><br>
          Enter bg color : <input type="text" name="bgcolor"><br>
          <input type="submit" value="submit"><br>
        </form>
    </body>
</html>
