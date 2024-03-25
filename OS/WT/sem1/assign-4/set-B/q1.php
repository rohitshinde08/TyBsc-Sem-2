<html>
<?php
$a=array("A","b","c","d");
echo"original array:<br>";
print_r($a);
$var="b";
$p=in_array($var,$a);
echo"<br> check 'A' in given array:$p<br>";
if($p)
{
  echo"<b> present $a</b>";
}
else
{
  echo"<b> not present</b>";
}
$p=array_search($var,$a);
echo"<br> check element present in given array using array_search<br>";
if($p)
{
  echo"<b> present at $p</b>";
}
else
{
  echo"<b> not present</b>";
}
?>
</html>
        
