<html>
  <head>
    <title> file </title>
  </head>
  <body>
  <?php
    session_start();
    if(isset($_SESSION['count']))
       $_SESSION['count']=$_SESSION['count']+1;
    else
       $_SESSION['count']=1;
    echo"<h3>This page is accessed </h3>".$_SESSION['count'];
  ?>        
  </body>
</html>
