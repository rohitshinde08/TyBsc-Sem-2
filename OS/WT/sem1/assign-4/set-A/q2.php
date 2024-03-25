<?php
 $op=$_POST['op'];
 $se=$_POST['se'];
 $qe=$_POST['qe'];
 $a=array('1','2','3','4','5');
 switch($op)
 {
    case "ins":array_push($a,$se);
               print_r($a);
               break;
    case "del":array_pop($a);
               print_r($a);
               break;
    case "sdis":print_r($a);
                break;
    case "deq":array_shift($a);
               print_r($a);
               break;
    case "enq":array_unshift($a,$qe);
               print_r($a);
               break;
    case "qdis":
               print_r($a);
               break;                      
 }
?>
