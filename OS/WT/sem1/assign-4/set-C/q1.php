<html>
<?php
$a=array("sopia"=>"31","jacob"=>"41","willian"=>"34","ramesh"=>"40");
echo"<b> original array:<b>";
print_r($a);

asort($a);
echo"<br> asending order sort by value:<br>";
print_r($a);

ksort($a);
echo"<br> asending order sort by key:<br>";
print_r($a);

arsort($a);
echo"<br> desending order sort by value:<br>";
print_r($a);

krsort($a);
echo"<br> desending order sort by key:<br>";
print_r($a);
?>
</html>

