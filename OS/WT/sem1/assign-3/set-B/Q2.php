<?php
$a=$_POST['String1'];
$ch=$_POST['op'];
switch($ch)
{
   case 1:split($a);
           break;
   

  case 2:replace($a);
           break;
  
   case 3:last_word($a);
           break;           
} 
 
function split($a)
{
   $s=explode(',',$a);
     var_dump($s);
}
function replace($a)
{
    $c=substr_replace($a,"#",0,10);
    echo "$a<br>";
    echo($c);
}     

function last_word($a) 
{
   $c=strstr($a,',');
      echo $c;
}   
?> 
