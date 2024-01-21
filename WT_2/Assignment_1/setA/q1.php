<?php
    session_start();
    if (isset($_SESSION['cnt']))
       $_SESSION['cnt']+=1;
    else
       $_SESSION['cnt']=1;
    echo "Web Page Access ".$_SESSION['cnt']," Times";
?>
