+<?php
 $a=$_POST['no1'];
 $b=$_POST['no2'];
 $ch=$_POST['op'];
 switch($ch)
 {
   /* case 1:mod($a,$b);
           break;
    case 2:power($a,$b);
           break;
    case 3:sumN($a);
           break;
   */ case 4:fact($b);
           break;
 }
 
/*function mod($a,$b)
{
  $c=$a%$b;
  echo ("mod of 1st & 2nd no.=$c");
}
function power($a,$b)
{
  $f=1;
  $n1=b;
  while($n1>0)
  {
    $f=$f*$a;
    $n1--;
  }
  echo ("$a raised to the power $b=$f\n");  
}
function sumN($a)
{
   $num=$a;
   $sum=0;
   while($num!=0)
   {
     $sum=$sum+$num;
     $num--;
   }
   echo ("sum of first n no.= $sum\n");   
}
*/function fact($b)
{
   $num=$b;
   $factorial=1;
   while($num!=0)
   {
      $factorial=$factorial*$num;
      $num--;
   }
   echo ("factorial of second no.= $factorial");
}
?>                              
