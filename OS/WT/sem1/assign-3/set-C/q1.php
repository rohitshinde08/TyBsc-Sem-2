<?php
$n=$_POST['n'];
$s=$_POST['s'];
$m=$_POST['m'];
$total=0;
for($i=0;$i<5;$i++)
{
  $total=$total+$m[$i];
}
$per=$total/5;
//echo $per;

echo "Table";
echo "<Table border=1>";
echo "<th>";
echo "serial no.";
echo "</th>";
echo "<th>";
echo "subject name";
echo "</th>";
echo "<th>";
echo "marks";
echo "</th>";

for($i=0;$i<count($n);$i++)
{
   echo "<tr>";
   echo "<td>";
   echo "$n[$i]";
   echo "</td>";
   echo "<td>";
   echo "$s[$i]";
   echo "</td>";
   echo "<td>";
   echo "$m[$i]";
   echo "</td>";
   echo "<tr>";
  // $total=$total+$m[$i];
}
echo "<tr> <td colspan=3 align=right>total:$total</td></tr>";
echo "<tr> <td colspan=3 align=right> percentage:$per</td></tr>";

if($per>=90)
  {
    echo "<tr> <td colspan=3 align=right> Grade:A</td></tr>";
  }
else if($per>=80 && $per<90)
  {
     echo "<tr> <td colspan=3 align=right> Grade:B</td></tr>";
  }   
else if($per>=70 && $per<80)
  {
      echo "<tr> <td colspan=3 align=right> Grade:C</td></tr>";
  }
else if($per>=35 && $per<70)
  {
      echo "<tr> <td colspan=3 align=right> Grade:D</td></tr>";
  } 
else
 {
     echo "<tr> <td colspan=3 align=right> Grade:F</td></tr>"; 
 }    
        
echo "</table>";

