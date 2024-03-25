<?php
$a=$_POST['String1'];
$ch=$_POST['op'];
switch($ch)
{
   case 1:length($a);
           break;
   

  case 2:countb($a);
           break;
  
   case 3:lowercase($a);
           break;
  
   case 4:pad($a);
           break;

   case 5:white_space($a);
           break;
  
   case 6:reverse($a);
           break;
           
}          

function length($a)
{
   $c=0;
   while($a[$c]!=NULL)
   {
     echo $a[$c];
     $c++;
   }   
     
    echo "total sring length:",$c;  
}

function countb($a)
{
   $c=preg_match_all('/[aeiou]/i',$a);
   echo $c;
   
}

function lowercase($a)
{
   $c=strtolower($a);
   echo $c;
   $b=strtoupper($a);
   echo $b;
   
}

function pad($a)
{
    $p=str_pad($a,20,'*',STR_PAD_BOTH);
    echo "$p<br>";
    $p=str_pad($a,20,'*',STR_PAD_LEFT);
    echo "$p<br>";
    $p=str_pad($a,20,'*',STR_PAD_RIGHT);
    echo "$p<br>";
    
}
function white_space($a)
{
   $c=trim($a);
   echo "$c<br>";
   $c=ltrim($a);
   echo "$c<br>";
   $c=rtrim($a);
   echo "$c<br>";
}
function reverse($a)
{
   $c=strrev($a);
   echo $c;
}           

?>
