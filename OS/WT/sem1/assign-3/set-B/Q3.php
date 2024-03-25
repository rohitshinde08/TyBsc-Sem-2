<?php

   $f_name=$_POST['f_name'];
   $clg_name=$_POST['clg_name'];
   $msg=$_POST['msg'];
   
   function Check($f_name,$clg_name,$msg)
   {
      $a=func_get_args();
      if($a[0]==NULL or $a[1]==NULL or $a[2]==NULL)
          echo "parameter is missing <br>";
      else
          echo "hello <br>  $f_name <br> $clg_name <br>  $msg";
   }           
  Check($f_name,$clg_name,$msg);
?> 
   
