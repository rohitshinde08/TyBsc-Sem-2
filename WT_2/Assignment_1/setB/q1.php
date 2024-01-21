<?php
session_start();
$cnt=0;
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $user = $_POST['uname'];
    $pass = $_POST['pass'];

if($user=="rohit" and $pass=="shinde"){
        
        $_SESSION['username'] = $user;

        echo"<form fieldset=1>
               
                Welcome...
             </form>";
       
        
    }
    else {
        $cnt = isset($_SESSION['attempt']) ? $_SESSION['attempt'] : 0;
        echo"Its your ".$cnt." try";
         $cnt++; 
    
    if ($cnt >3){
       echo "<br> Error ...Too many unsuccessful attempts<br>";
        session_destroy();
    }
    else
         $_SESSION['attempt']=$cnt;
    }
}

?>
