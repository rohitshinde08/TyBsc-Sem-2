<body bgcolor=cyan>
<font size=6 color=blue>
<?php
session_start();
$nm=$_GET['n'];
$ps=$_GET['p'];
if($nm==$ps)
   echo"correct <br> LongIn successfull <br> welcome!!";
else if(isset($_SESSION['cnt']))
{
  echo $_SESSION['cnt']."chances used invalid login";
  $_SEESION['cnt']=$_SEESION['cnt']+1;
  if($_SESSION['cnt']>3)
    echo"<br> attempt finished";
}
else
{
  $_SESSION['cnt']=1;
  echo" 1 chance used invalid login ";
}
?>       
